package sistema;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retornos.Retornos;
import ast.AST;
import excecoes.ErroAnotacaoDeComando;
import excecoes.ErroComandoReadSemParametros;
import excecoes.ErroDeTipo;
import excecoes.ErroFuncaoComMesmaAnotacao;
import excecoes.ErroFuncaoNaoDeclarada;
import excecoes.ErroOperadorNot;
import excecoes.ErroTipoFuncaoIncompativel;
import excecoes.ErroVariavelDuplicada;
import excecoes.ErroVariavelNaoDelarada;

public class Semantica extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AST ast;
	TabelaDeSimbolos tabela;
	TypeChecker tp;
	String anotacao_funcao="";
	int enderecoLocal;
	
	/**
	 * Construtor da classe Semantica que recebe a AST como parâmetro
	 * Instancia a variável global tabela do tipo TabelaDeSimbolos
	 * Instancia a variável tp do tipo TypeChecker
	 * 
	 * Inicia a chamada de preencheTabelaSimbolos
	 * Imprime declarações globais de tabela
	 * Imprime funcoes de tabela
	 * @param ast
	 * @throws Exception
	 */
	public Semantica(AST ast) throws Exception{
		this.ast = ast;
		this.tabela = new TabelaDeSimbolos(ast);//porque?
		
		
		preencheTabelaSimbolos();
		tabela.imprimeDeclaracoesGlobais();
		tabela.imprimeFuncoes();
	}
	
	
	/**
	 * Método responsável por percorrer os nós do segundo nível da AST
	 * Percorre nó "var" global
	 * Percorre nó "const" global
	 * Percorre nó "function"
	 * Percorre nó "main"
	 * @throws Exception
	 */
	public void preencheTabelaSimbolos() throws Exception{
		
		for(AST filhoDoNoInicial : ast.getFilhos()){
			String rotuloAtual = filhoDoNoInicial.getRotulo();
			if(rotuloAtual == "var") 
				adicionarVariaveisATabela(filhoDoNoInicial, "", "global");
			else if(rotuloAtual == "const") 
				adicionarConstantesATabela(filhoDoNoInicial,"","global");
			else if(rotuloAtual == "function") 
				preencheTabelaFuncoes(filhoDoNoInicial);
			else if(rotuloAtual == "main") 
				preencheTabelaMain(filhoDoNoInicial);
		}
	}
	
	public void preencheTabelaMain(AST noMain) throws Exception{
		String nome = noMain.getRotulo();
		HashMap<String,Retornos> variaveis_locais = new HashMap<>();
		tabela.getFuncoes().put(nome, variaveis_locais);
		tabela.getTipo_funcaoMap().put(nome, null);
		adicionarDeclaracoesLocaisATabela(noMain, nome);
	}
	
	
	/**
	 * Método que recebe como parâmetro o nó function e criar uma chave 
	 * com o nome_retorno_tipoParametro_nomeParametro, além de percorrer os nós internos
	 * Declarações, Atribuições, e Comandos de controle e condicional
	 * @param noFuncao
	 * @throws Exception
	 */
	private void preencheTabelaFuncoes(AST noFuncao) throws Exception {
		
		String nome = noFuncao.getFilhos().get(0).getRotulo();
		String retorno = noFuncao.getFilhos().get(2).getRotulo();	
		anotacao_funcao = nome;//acumula o nome da função retorno e seus parametros
		AST noParametros = new AST("sem parametros");
		if(!noFuncao.getFilhos().get(1).getFilhos().get(0).getRotulo().equals("")){
			noParametros =	noFuncao.getFilhos().get(1).getFilhos().get(0);		
		}
		
		
		//Cria uma entrada para a função na tabela de símbolos
		enderecoLocal = 0;
		incluirParametrosEmAnotacaoFuncao(noParametros,nome,noFuncao);
		
		//incluir o tipo da funcao em outra hash chamada tipo funcao
		tabela.getTipo_funcaoMap().put(anotacao_funcao, retorno);
		
		//Adiciona as variáveis e constantes declaradas dentro da função na sua entrada na tabela de símbolos
		adicionarDeclaracoesLocaisATabela(noFuncao, anotacao_funcao);
		
		if(noFuncao.getFilhos().get(0)!= null){
			for(AST noComandosDentrDaFuncao : noFuncao.getFilhos()){
				
				String rotuloAtual = noComandosDentrDaFuncao.getRotulo();
				if(rotuloAtual.equals("=")) 
					testaAtribuicao(noComandosDentrDaFuncao, anotacao_funcao);
				else if(rotuloAtual.equals("print")){
					AST filhoNoPrint = noComandosDentrDaFuncao.getFilhos().get(0);
					testaPrint(filhoNoPrint, anotacao_funcao);
				}else if(rotuloAtual.equals("scan")){
					AST filhoNoScan = noComandosDentrDaFuncao.getFilhos().get(0);
					if(filhoNoScan != null)
						testaScan(filhoNoScan, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando scan sem parâmetros em :"+noComandosDentrDaFuncao.getLinha(), 
							noComandosDentrDaFuncao.getLinha());
				}else if(rotuloAtual.equals("if")){
					testaIf(noComandosDentrDaFuncao, anotacao_funcao);
				}
				else if(rotuloAtual.equals("for")) testaComandos(noComandosDentrDaFuncao, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(noComandosDentrDaFuncao, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao")) testaChamadaFuncao(noComandosDentrDaFuncao, anotacao_funcao);
				
			}
		}else throw new ErroAnotacaoDeComando("O comando "+noFuncao.getRotulo()+" com problema na anotacao em: "+noFuncao.getLinha(),
				noFuncao.getLinha());
		
	}
	
	


	/**
	 * Método responsável por percorrer os parâmetros da anotação da função
	 * Ao mesmo tempo concatena o tipo e o nome do parâmetro à Strig nome para criar a chave
	 * da tabela de símbolos.
	 * Além disso criar uma instância para os parâmetros na tabela de símbolos.
	 *  
	 * @param noParametros
	 * @param nome
	 * @param noFuncao
	 * @throws Exception
	 */
	private void incluirParametrosEmAnotacaoFuncao(AST noParametros, String nome, AST noFuncao) throws Exception{
		
		HashMap<String, Retornos> variaveis_locais = new HashMap<>();
		
		//Se só existe um parâmetro
		if(noParametros.getRotulo() != "," && !noParametros.getRotulo().equals("sem parametros")){
			
			String tipo = noParametros.getRotulo();
			String ID = noParametros.getFilhos().get(0).getRotulo();
			String parametro =  "_"+tipo;
			anotacao_funcao+=parametro;
			
			Retornos retornosParametros = new Retornos(); //para criar uma instância de uma variável
			//mandada como parâmetro
			
			//Seta o parametro da funcao como uma variavel local
			retornosParametros.setTipo(tipo);
			retornosParametros.setValor(enderecoLocal);
			retornosParametros.setParametro(true);
			enderecoLocal = enderecoLocal+1;

			variaveis_locais.put(ID+"_var", retornosParametros);
			//return;//porque?
			
		}else{//Existe mais de um parâmetro
			//Ao final desta função a variável anotacao_funcao estará completa
			//passa para variaveis_locais as variaveis_locais(parâmetros) inseridas dentro do método
			//gerarAnotacaoFuncao
			variaveis_locais = gerarAnotacaoFuncao(noParametros,variaveis_locais);
		}
		
		
		if(!tabela.getFuncoes().containsKey(anotacao_funcao)){//Não existe função semelhante
			
			tabela.getFuncoes().put(anotacao_funcao, variaveis_locais);//inclui na tabela de símbolos
		
		}else throw new ErroFuncaoComMesmaAnotacao("Função "+
												  /*anotacao_funcao.substring(0, nome.length())+*/nome+
												  " já declarada "+
												  "com a mesma anotação, linha:"+
												  noFuncao.getLinha(),
												  noFuncao.getLinha());
	}
	
	/**
	 * Método que percorre o a lista de parâmetros caso haja dois ou mais parâmetros
	 * na anotação do método.
	 * @param param
	 * @param variaveis_locais
	 * @throws ErroVariavelDuplicada 
	 * @throws ErroFuncaoComMesmaAnotacao 
	 */
	public HashMap<String, Retornos> gerarAnotacaoFuncao(AST param, HashMap<String, Retornos> variaveis_locais) throws ErroVariavelDuplicada, ErroFuncaoComMesmaAnotacao {
		
		//Se ja encontrou um parâmetro
		if(param.getRotulo() != "," && !param.getRotulo().equals("sem parametros")){
			

			String tipo = param.getRotulo();
			String ID = param.getFilhos().get(0).getRotulo();
			
			//verifica se já não existe uma declaração de parâmetro com o mesmo nome na tabela
			//de símbolos da
			if(!variaveis_locais.containsKey(ID)){
				
				String parametro = "_"+tipo;
				
				anotacao_funcao+=parametro;
				
				Retornos retornosParametros = new Retornos(); //para criar uma instância da variável
				//mandada como parâmetro
				
				//Seta o parametro da funcao como uma variavel local
				retornosParametros.setTipo(tipo);
				retornosParametros.setValor(enderecoLocal);
				retornosParametros.setParametro(true);
				
				enderecoLocal = enderecoLocal+1;
				
				variaveis_locais.put(ID+"_var", retornosParametros);
			//caso contrário gerará exceção de variável já declarada
			}else throw new ErroVariavelDuplicada("Já existe um parâmetro com o nome "+ID, param.getLinha());
			
		//Se ainda não encontrou o parâmetro	
		}else if(!param.getRotulo().equals("sem parametros")){
			//Percorre a subarvore da esquerda em busca de um parâmetro
			gerarAnotacaoFuncao(param.getFilhos().get(0), variaveis_locais);
			//Percorre a subarvore da direita em busca de uma vírgula ou outro parâmetro
			gerarAnotacaoFuncao(param.getFilhos().get(1), variaveis_locais);
			
		}
			return variaveis_locais;
	}
		
	/**
	 * Recebe o nó de uma função e o percorre procurando variaveis e constantes locais
	 * 
	 * @param no
	 * @param anotacao
	 * @throws Exception
	 */
	public void adicionarDeclaracoesLocaisATabela(AST no, String anotacao) throws Exception{
		
		for(AST f : no.getFilhos()){
			
			if(f.getRotulo() == "var") adicionarVariaveisATabela(f, anotacao, "local");
			else if(f.getRotulo() == "const") adicionarConstantesATabela(f, anotacao, "local");
			
		}
		
	}
	
	/**
	 * Recebe o nó da variavel ou constante declarada no escopo global ou local
	 * @param noDeclaracaoDeVariavel
	 * @param chave
	 * @param tipo_declaracao
	 * @throws Exception
	 */
	public void adicionarVariaveisATabela(AST noDeclaracaoDeVariavel, String chave, String tipo_declaracao) throws Exception{
		
		String rotulo;
		String tipo = "";
		Map<String, Retornos> variaveisNaTabelaDeSimbolos = null;
		Retornos var = new Retornos();
		
		//Verifica em qual dos dois HashMaps será inserida variável
		if(tipo_declaracao.equals("global")){
			variaveisNaTabelaDeSimbolos = tabela.getDeclaracoes_globais();
		}else{
			variaveisNaTabelaDeSimbolos = tabela.getFuncoes().get(chave);
		}
		
		//Pode ser que haja uma declaração aninhada de múltiplas variáveis
		for(AST noElementoDaDeclaracaoDeVariavel : noDeclaracaoDeVariavel.getFilhos()){
			
			rotulo = noElementoDaDeclaracaoDeVariavel.getRotulo();
			
			if(rotulo.equals("int") ||
			   rotulo.equals("real") ||
			   rotulo.equals("string") ||
			   rotulo.equals("bool")){
				
				tipo = rotulo;
				
			}else{
				//Não é uma declaração de várias variáveis
				if(rotulo.equals(",") == false){
					//Não existe nenhuma chave com o nome desta variável
					if(!variaveisNaTabelaDeSimbolos.containsKey(rotulo+"_var") &&
					   !variaveisNaTabelaDeSimbolos.containsKey(rotulo+"_const")){
						
						var.setTipo(tipo);
						var.setValor(enderecoLocal);
						var.setParametro(false);
						enderecoLocal = enderecoLocal+1;
						
						if(tipo_declaracao.equals("global"))
							
							tabela.getDeclaracoes_globais().put(rotulo+"_var", var);
						
						else 
							
							tabela.getFuncoes().get(chave).put(rotulo+"_var", var);
						
					}else{
						
						throw new ErroVariavelDuplicada("Variável ou constante \'"+
														rotulo+
														"\' duplicada, linha: "+
						                                noElementoDaDeclaracaoDeVariavel.getLinha(),
						                                noElementoDaDeclaracaoDeVariavel.getLinha());
						
					}
						
				}else{
					//mais de uma variável declarada na mesma linha
					adicionaDelaracoesAninhadasATabela(noElementoDaDeclaracaoDeVariavel,tipo, chave, tipo_declaracao);
				}
			}		
		}
	}
	
	/**
	 * Método para percorrer uma lista de declarações aninhadas em uma única linha
	 * Se a declaração for global, insere as instâncias nas declarações globais da tabela de símbolo
	 * Se local, insere na instância da respectiva função buscando por sua anotação
	 * @param noParametros
	 * @param tipo
	 * @param chave
	 * @param tipo_declaracao
	 * @throws Exception
	 */
	public void adicionaDelaracoesAninhadasATabela(AST noElementoDaDeclaracaoDeVariavel, String tipo, String chave, String tipo_declaracao) throws Exception{
		//variavel var para armazenar o tipo e o valor da variavel percorrida no nó
		Retornos var = new Retornos();
		Map<String, Retornos> variaveis = null;
		
		if(tipo_declaracao.equals("global")){
			//se o método foi chamado em preencheTabela, onde as declarações são globais
			//armazena as declarações já existentes na tabela de símbolos em variaveis
			variaveis = tabela.getDeclaracoes_globais();
			
		}else{
			//se o método foi chamado em adicionarDeclaracoesLocaisATabela, onde as declarações são globais
			//armazena as declarações já existentes na tabela de símbolos em variaveis
			variaveis = tabela.getFuncoes().get(chave);
			
		}
		
		for(AST p : noElementoDaDeclaracaoDeVariavel.getFilhos()){
			if(p.getRotulo() != ","){
				//verifica se já contém a declaração da variável em declarações_globais, faz tanto para var
				//quanto para constante
				if(!variaveis.containsKey(p.getRotulo()+"_var") && !variaveis.containsKey(p.getRotulo()+"_const")){
					var.setTipo(tipo);
					if(tipo_declaracao.equals("global"))
						tabela.getDeclaracoes_globais().put(p.getRotulo()+"_var", var);
					else tabela.getFuncoes().get(chave).put(p.getRotulo()+"_var", var);
				}else{
					//erro de variável ou constante duplicada
					throw new ErroVariavelDuplicada("Nome de variável ou constante duplicada na linha : "+ p.getLinha(), p.getLinha());
				}
			}else{
				adicionaDelaracoesAninhadasATabela(p, tipo, chave, tipo_declaracao);
			}
		}
	}
	
	/**
	 * Método recebe um nó com uma declaração de uma constante local ou global
	 * e adiciona na tabela de símbolos
	 * @param no
	 * @param chave
	 * @param tipo_declaracao
	 * @throws Exception
	 */
	public void adicionarConstantesATabela(AST noConstante, String anotacao_funcao, String tipo_declaracao) throws Exception{
		
		//cria instância cons do tipo dos valores das declaracoes globais da tabela
		//de símbolos
		Retornos cons = new Retornos();
		Map<String, Retornos> constantes = null;
		
		//verifica se a declaracao de constante é global ou local
		if(tipo_declaracao.equals("global")){
			constantes = tabela.getDeclaracoes_globais();
		}else{
			constantes = tabela.getFuncoes().get(anotacao_funcao);
		}
		//captura o nome, o tipo e o valor na ast
		String nome = noConstante.getFilhos().get(0).getRotulo();
		String tipo = noConstante.getFilhos().get(1).getRotulo();
		String valor = noConstante.getFilhos().get(2).getRotulo();
		
		//verifica se já existe esta instância em declarada como constante ou variável
		if(!constantes.containsKey(nome+"_const") && !constantes.containsKey(nome+"_var")){
			cons = tp.checaTipoConstanteGlobal(tipo, valor, noConstante);
			if(tipo_declaracao.equals("global"))
				tabela.getDeclaracoes_globais().put(nome+"_const", cons);
			else tabela.getFuncoes().get(anotacao_funcao).put(nome+"_const", cons);
			
			cons.setParametro(false);
		}else{
			throw new ErroVariavelDuplicada("Nome de variável ou constante duplicada na linha : "+ noConstante.getLinha(), noConstante.getLinha());
		}
	}
	
	/**
	 * Método que testa uma atrubuição 
	 * testa se a variável do lado esquerdo foi declarada localmente ou globalmente
	 * verifica a expressão do lado direito
	 * @param no
	 * @param chave
	 * @throws ErroVariavelNaoDelarada
	 * @throws ErroOperadorNot
	 * @throws ErroDeTipo
	 * @throws ErroFuncaoNaoDeclarada 
	 * @throws ErroTipoFuncaoIncompativel 
	 */
	public void testaAtribuicao(AST noAtribuicao, String anotacao_funcao) throws ErroVariavelNaoDelarada, 
				ErroOperadorNot, ErroDeTipo, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, IOException{
		
		//Problema: Somente o ID do lado esquerdo da atribuição está sendo verificado como variável existente
		//Consertado erro de variável não declarada lado direito da atribuição
		
		String tipoDeclarado;//armazena o tipo declarado em escopo global ou local
		String ID = noAtribuicao.getFilhos().get(0).getRotulo();
		
		if(tabela.verificaSeFoiDeclaradoEmVariaveisLocais(ID, anotacao_funcao)){
			
			Retornos variavelLocal = tabela.retornaVariavelLocal(anotacao_funcao, ID);
			tipoDeclarado = variavelLocal.getTipo();
			AST subArvoreDireitaDaDeclaracao = noAtribuicao.getFilhos().get(1);
			verificaExpressaoEmAtribuicao(subArvoreDireitaDaDeclaracao, anotacao_funcao, tipoDeclarado);
			
		}else if(tabela.verificaSeExisteDeclaracaoEmVariaveisGlobais(ID)){
			
			Retornos variavelGlobal = tabela.getDeclaracoes_globais().get(ID+"_var");
			tipoDeclarado = variavelGlobal.getTipo();
			AST subArvoreDireitaDaDeclaracao = noAtribuicao.getFilhos().get(1);
			verificaExpressaoEmAtribuicao(subArvoreDireitaDaDeclaracao,anotacao_funcao,tipoDeclarado);
			
		}else {
			
			throw new ErroVariavelNaoDelarada("Variavel "+
											  ID+
											  ""+//porque?
											  " não declarada em : "+
											  noAtribuicao.getLinha(),
											  noAtribuicao.getLinha());
			
		}
	}
	
	/**
	 * Método verifica a expressão aritmética dentro de uma expressão relacional
	 * Recebe como parâmetros o nó da expressão, a anotação da função, o parâmetro simboloRelacional
	 * recebe o tipo do comparador (>,>=,==,<,<=) para o teste no checador de tipo e o parâmetro
	 * entrouEmExprRelacional recebe true se as expressões possuem os operadores +/-/* ou /
	 * essa variável também é usada para o checador de tipo, que só permitirá operações aritméticas
	 * com valores de tipo int ou real, ou expressões do tipo (booleano == booleano) ou (booleano != booleano) 
	 * @param noExpr
	 * @param anotacao_funcao
	 * @param simboloRelacional
	 * @param entrouEmExprAritmetica
	 * @throws ErroOperadorNot
	 * @throws ErroDeTipo
	 * @throws ErroVariavelNaoDelarada
	 * @throws ErroFuncaoNaoDeclarada 
	 * @throws ErroTipoFuncaoIncompativel 
	 */
	public void verificaExpressao(AST noExpr, String anotacao_funcao, 
			String simboloRelacional, boolean entrouEmExprAritmetica, String tipoRetorno) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		
		String rotuloAtual = noExpr.getRotulo();
		
		if(rotuloAtual.equals("+") ||
		   rotuloAtual.equals("-") ||
		   rotuloAtual.equals("*") ||
                   rotuloAtual.equals("^") ||
		   rotuloAtual.equals("/") ){
			
			AST subarvoreEsquerda = noExpr.getFilhos().get(0);
			AST subarvoreDireita = noExpr.getFilhos().get(1);
			
			verificaExpressao(subarvoreEsquerda, anotacao_funcao, simboloRelacional, true,tipoRetorno);
			verificaExpressao(subarvoreDireita, anotacao_funcao, simboloRelacional, true,tipoRetorno);
			
		}else if(rotuloAtual.equals("!")) {
			verificaOperadorRelacional(noExpr, anotacao_funcao,"bool");
			
		}else if(rotuloAtual.equals("chamada_funcao") && !tipoRetorno.equals("")){
			//tp.checarChamadaFuncao()
			String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(noExpr, anotacao_funcao);
			if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
				String tipoFuncaoChamada = tabela.getTipo_funcaoMap().get(anotacaoChamaFuncao);
				if(tipoRetorno == tipoFuncaoChamada) return;
				else if(tipoRetorno.equals("real") && tipoFuncaoChamada.equals("int")) return;
				else throw new ErroTipoFuncaoIncompativel("A funcao com a anotacao "+anotacaoChamaFuncao+
						" é do tipo "+tipoFuncaoChamada+" em :"+noExpr.getLinha(), noExpr.getLinha());
			}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
					+" não existe ou parametros de tipos incompatíveis em : "+noExpr.getLinha(),noExpr.getLinha());
		}else if(rotuloAtual.equals("chamada_funcao") && tipoRetorno.equals("")){
			//tp.checarChamadaFuncao()
			String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(noExpr, anotacao_funcao);
			if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
				return;
			}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
					+" não existe ou parametros de tipos incompatíveis em : "+noExpr.getLinha(),noExpr.getLinha());
		}else if(!simboloRelacional.equals("")){
			tp.checaTipoExpressaoEmRelacional(tabela, anotacao_funcao, noExpr, simboloRelacional, entrouEmExprAritmetica);
		}else{	
			
			tp.checaTipoExpressaoEmPrint(tabela, anotacao_funcao, noExpr, entrouEmExprAritmetica);
				
			return;
			
		}
	}
	
	/**
	 * Método utilizado para verificar se o operador relacional
	 * @param noOperador
	 * @param anotacao_funcao
	 * @throws ErroOperadorNot
	 * @throws ErroDeTipo
	 * @throws ErroVariavelNaoDelarada
	 * @throws ErroTipoFuncaoIncompativel 
	 * @throws ErroFuncaoNaoDeclarada 
	 */
	public void verificaOperadorRelacional(AST noOperador, String anotacao_funcao, String tipoRetoro) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		if(noOperador != null){
			String rotuloAtual = noOperador.getRotulo();
			AST subArvoreEsquerda, subArvoreDireita, noFilhoOperadorNot;
			if(rotuloAtual.equals("==") ||
			   rotuloAtual.equals("!=") ||
			   rotuloAtual.equals(">")  ||
			   rotuloAtual.equals(">=") ||
			   rotuloAtual.equals("<")  ||
			   rotuloAtual.equals("<=") ||
                           rotuloAtual.equals("||") ||
                           rotuloAtual.equals("&&")){
				subArvoreEsquerda = noOperador.getFilhos().get(0);
				subArvoreDireita = noOperador.getFilhos().get(1);
				verificaExpressao(subArvoreEsquerda, anotacao_funcao, rotuloAtual, false,tipoRetoro);
				verificaExpressao(subArvoreDireita, anotacao_funcao,  rotuloAtual, false,tipoRetoro);
				//"" significa que a expressão não está
				// vinculada a atribuição, sendo assim a 
				// a passagem do tipo do lado esquerdo de uma atribuição não é possível
				
			}else if(rotuloAtual.equals("!")){
				//se o rótulo for o operador not, então verifica se o filho dele é um
				//operador de comparação, como '==', '!=', '!', ou uma variável
				noFilhoOperadorNot = noOperador.getFilhos().get(0);
				verificaOperadorRelacional(noFilhoOperadorNot, anotacao_funcao,"bool");
			}else if(rotuloAtual.equals("chamada_funcao")){
				String anotacao = montarAnotacaoChamadaFuncao(noOperador, anotacao_funcao);
				if(tabela.getFuncoes().containsKey(anotacao)){
					String tipo = tabela.getTipo_funcaoMap().get(anotacao);
					String nomeChamadaFuncao = noOperador.getFilhos().get(0).getRotulo();
					if(tipo == "bool") return;
					else throw new ErroTipoFuncaoIncompativel("A funcao "+nomeChamadaFuncao+" possui tipo "+tipo+" em : "
							+noOperador.getLinha(), noOperador.getLinha());
				}
			}else{
				//se acontecer de a operação relacional tiver apenas uma variável ou 'TRUE', 'FALSE', ou
				//um valor qualquer, então checa se é boolean
				tp.checaTipoValorOperacaoRelacionalBool(noOperador, anotacao_funcao, tabela);
			}
		}
	}
	/**
	 * Método verifica a expressão do lado direito da atribuição
	 * @param no
	 * @param anotacao_funcao
	 * @param tipo
	 * @throws ErroOperadorNot
	 * @throws ErroDeTipo
	 * @throws ErroVariavelNaoDelarada 
	 * @throws ErroFuncaoNaoDeclarada 
	 * @throws ErroTipoFuncaoIncompativel 
	 */
	public void verificaExpressaoEmAtribuicao(AST no, String anotacao_funcao, String tipo) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, IOException{
		
		String rotuloAtual = no.getRotulo();
		
		if(rotuloAtual.equals("+") ||
		   rotuloAtual.equals("-") ||
		   rotuloAtual.equals("*") ||
                   rotuloAtual.equals("^") ||
		   rotuloAtual.equals("/") ){
			
			AST subarvoreEsquerda = no.getFilhos().get(0);
			AST subarvoreDireita = no.getFilhos().get(1);
			
			// se esse passo não gerar exceção então o operando da esquerda é do tipo certo
			verificaExpressaoEmAtribuicao(subarvoreEsquerda, anotacao_funcao, tipo);
			// se esse passo não gerar exceção então o operando da direita é do tipo certo
			verificaExpressaoEmAtribuicao(subarvoreDireita, anotacao_funcao, tipo);
			
		}else if(rotuloAtual.equals("!")) {
			
			tp.checaTipoExprNot(no, tipo);
			
			verificaOperadorRelacional(no, anotacao_funcao, "bool");
			
			return;
			
		}else if(rotuloAtual.equals("chamada_funcao")){
			//tp.checarChamadaFuncao()
			String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(no, anotacao_funcao);
			if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
				String tipoFuncaoChamada = tabela.getTipo_funcaoMap().get(anotacaoChamaFuncao);
				if(tipo == tipoFuncaoChamada) return;
				else if(tipo.equals("real") && tipoFuncaoChamada.equals("int")) return;
				else throw new ErroTipoFuncaoIncompativel("A funcao com a anotacao "+anotacaoChamaFuncao+
						" é do tipo "+tipoFuncaoChamada+" em :"+no.getLinha(), no.getLinha());
			}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
					+" não existe ou parametros de tipos incompatíveis em : "+no.getLinha(),no.getLinha());
		}else{
			tp.checaTipoExpressaoAtribuicao(tabela, anotacao_funcao, no, tipo);
			return;
			
		}
	}
	
	public String montarAnotacaoChamadaFuncao(AST noChamadaFuncao, String anotacao) throws ErroVariavelNaoDelarada, ErroOperadorNot, ErroDeTipo, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		String nomeFuncao = noChamadaFuncao.getFilhos().get(0).getRotulo();
		String anotacaoMontada = "";
		AST filhoLadoDireito = noChamadaFuncao.getFilhos().get(1);
		String tipo = montarParametrosAnotacaoFuncao(filhoLadoDireito, anotacao);
		anotacaoMontada = nomeFuncao+tipo;
		return anotacaoMontada;
	}
	
	public String montarParametrosAnotacaoFuncao(AST parametroChamadaFuncao, String anotacao) throws ErroDeTipo, ErroVariavelNaoDelarada, ErroOperadorNot, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		AST filhoEsquerdo, filhoDireito;
		String rotulo = parametroChamadaFuncao.getRotulo(), tipo = "", anotacaoMontada = "";
		
		if(rotulo != "," && !rotulo.equals("")){
			if( !rotulo.equals("+") &&
				!rotulo.equals("-") &&
				!rotulo.equals("/") && 
				!rotulo.equals("*") &&
                                !rotulo.equals("^") &&
				!rotulo.equals("!")){
				if(tabela.verificaSeExisteDeclaracaoEmConstantesLocais(rotulo, 
						anotacao)){
					tipo = tabela.retornaConstanteLocal(anotacao, rotulo).getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(tabela.verificaSeFoiDeclaradoEmVariaveisLocais(rotulo, 
						anotacao)){
					tipo = tabela.retornaVariavelLocal(anotacao, rotulo).getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(tabela.verificaSeExisteDeclaracaoEmConstantesGlobais(rotulo)){
					tipo = tabela.getDeclaracoes_globais().get(rotulo+"_const").getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(tabela.verificaSeExisteDeclaracaoEmVariaveisGlobais(rotulo)){
					tipo = tabela.getDeclaracoes_globais().get(rotulo+"_var").getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(rotulo.charAt(0)=='0' ||
						 rotulo.charAt(0)=='1' ||
						 rotulo.charAt(0)=='2' ||
						 rotulo.charAt(0)=='3' ||
						 rotulo.charAt(0)=='4' ||
						 rotulo.charAt(0)=='5' ||
						 rotulo.charAt(0)=='6' ||
						 rotulo.charAt(0)=='7' ||
						 rotulo.charAt(0)=='8' ||
						 rotulo.charAt(0)=='9'){
					if(rotulo.contains(".")){
						tipo = "real";
						anotacaoMontada = "_"+tipo;
						return anotacaoMontada;
					}else{
						tipo = "int";
						anotacaoMontada = "_"+tipo;
						return anotacaoMontada;
					}
				}else if(rotulo.charAt(0)=='"' && 
						rotulo.charAt(rotulo.length()-1)=='"'){
					tipo ="string";
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(rotulo.equals("TRUE") || rotulo.equals("FALSE")){
					tipo ="bool";
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(rotulo.equals("chamada_funcao")){
					String anotacaoFuncaoAninhada = montarAnotacaoChamadaFuncao(parametroChamadaFuncao, anotacao);
					tipo = tabela.getTipo_funcaoMap().get(anotacaoFuncaoAninhada);
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else throw new ErroVariavelNaoDelarada("A variavel "+rotulo+" "
						+ " não foi declarada em : "+parametroChamadaFuncao.getLinha(), parametroChamadaFuncao.getLinha());
				
			}else if( rotulo.equals("+") ||
					  rotulo.equals("-") ||
					  rotulo.equals("/") || 
					  rotulo.equals("*") ||
                                          rotulo.equals("^") ||
					  rotulo.equals("!")){
				verificaExpressao(parametroChamadaFuncao, anotacao, "", false,"real");
				if(rotulo.equals("!")){
					tipo = "bool";
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else{
					tipo = retornaTipoComumExpressaoChamadaFuncao(parametroChamadaFuncao, "", anotacao);
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}
			}
		}else if(rotulo.equals(",")){
			filhoEsquerdo = parametroChamadaFuncao.getFilhos().get(0);
			filhoDireito = parametroChamadaFuncao.getFilhos().get(1);
			anotacaoMontada+= montarParametrosAnotacaoFuncao(filhoEsquerdo, anotacao);
			anotacaoMontada+= montarParametrosAnotacaoFuncao(filhoDireito, anotacao);
		}
		return anotacaoMontada;
	}
	
	public String retornaTipoComumExpressaoChamadaFuncao(AST expr, String tipo, String anotacao) throws ErroDeTipo, ErroVariavelNaoDelarada{
		String rotulo = expr.getRotulo();
		if(rotulo.equals("+") ||
			rotulo.equals("-")||
			rotulo.equals("/")||
                        rotulo.equals("^")||
			rotulo.equals("*")){
			AST filhoEsquerdo, filhoDireito;
			filhoEsquerdo = expr.getFilhos().get(0);
			filhoDireito = expr.getFilhos().get(1);
			if(!tipo.equals("real"))
				tipo = retornaTipoComumExpressaoChamadaFuncao(filhoEsquerdo, tipo, anotacao);
			if(!tipo.equals("real"))
				tipo = retornaTipoComumExpressaoChamadaFuncao(filhoDireito, tipo, anotacao);
		}else if((rotulo.charAt(0)=='0' ||
				 rotulo.charAt(0)=='1' ||
				 rotulo.charAt(0)=='2' ||
				 rotulo.charAt(0)=='3' ||
				 rotulo.charAt(0)=='4' ||
				 rotulo.charAt(0)=='5' ||
				 rotulo.charAt(0)=='6' ||
				 rotulo.charAt(0)=='7' ||
				 rotulo.charAt(0)=='8' ||
				 rotulo.charAt(0)=='9')){
			if(rotulo.contains(".")){
				tipo = "real";
				return tipo;
			}else{
				tipo ="int";
				return tipo;
			}
		}else if(!rotulo.equals("TRUE") &&
				 !rotulo.equals("FALSE")&&
				 (rotulo.charAt(0)!= '"' && rotulo.charAt(rotulo.length()-1)!='"')){
			if(tabela.verificaSeExisteDeclaracaoEmConstantesLocais(rotulo, 
					anotacao)){
				tipo = tabela.retornaConstanteLocal(anotacao, rotulo).getTipo();
				return tipo;
			}else if(tabela.verificaSeFoiDeclaradoEmVariaveisLocais(rotulo, 
					anotacao)){
				tipo = tabela.retornaVariavelLocal(anotacao, rotulo).getTipo();
				return tipo;
			}else if(tabela.verificaSeExisteDeclaracaoEmConstantesGlobais(rotulo)){
				tipo = tabela.getDeclaracoes_globais().get(rotulo+"_const").getTipo();
				return tipo;
			}else if(tabela.verificaSeExisteDeclaracaoEmVariaveisGlobais(rotulo)){
				tipo = tabela.getDeclaracoes_globais().get(rotulo+"_var").getTipo();
				return tipo;
			}else throw new ErroVariavelNaoDelarada("A variável "+rotulo+" não declarada em : " 
					+expr.getLinha(), expr.getLinha());
		}else throw new ErroDeTipo("O valor "+rotulo+" com tipo incompatível para expressão em : "
				+expr.getLinha(), expr.getLinha());
		return tipo;
	}
	
	
	public void testaPrint(AST noPrint, String anotacao_funcao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		String RotulofilhoDeNoPrint = noPrint.getRotulo();
		if(!RotulofilhoDeNoPrint .equals(",") && !RotulofilhoDeNoPrint.equals("")){
			verificaExpressao(noPrint, anotacao_funcao, "", false,"");
			return;
		}else if(RotulofilhoDeNoPrint.equals(",")){
			AST noExprDeNoPrintEsquerda = noPrint.getFilhos().get(0);
			AST noExprDeNoPrintDireita = noPrint.getFilhos().get(1);
			testaPrint(noExprDeNoPrintEsquerda, anotacao_funcao);
			testaPrint(noExprDeNoPrintDireita, anotacao_funcao);
		}else return;
	}
	
	public void testaReturn(AST noReturn, String anotacao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, IOException{
		AST expr = noReturn.getFilhos().get(0);
		String tipoFuncao = tabela.getTipo_funcaoMap().get(anotacao);
		verificaExpressaoEmAtribuicao(expr, anotacao, tipoFuncao);
	}
	
	public void testaScan(AST noScan, String anotacao_funcao) throws ErroVariavelNaoDelarada {
		String rotulo = noScan.getRotulo();
		if(!rotulo .equals(",") && !rotulo.equals("")){
			tp.checaScan(tabela, noScan, anotacao_funcao);
			return;
		}else if(rotulo.equals(",")){
			AST noExprDeNoPrintEsquerda = noScan.getFilhos().get(0);
			AST noExprDeNoPrintDireita = noScan.getFilhos().get(1);
			testaScan(noExprDeNoPrintEsquerda, anotacao_funcao);
			testaScan(noExprDeNoPrintDireita, anotacao_funcao);
		}else return;
		
	}
	
	public void testaElse(AST noElse, String anotacao_funcao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, ErroComandoReadSemParametros, ErroAnotacaoDeComando, IOException{
		String rotuloAtual;
		if(noElse.getFilhos().get(0) != null){
			for(AST filhosComandoElse : noElse.getFilhos()){
				rotuloAtual = filhosComandoElse.getRotulo();
				if(rotuloAtual.equals("print")) testaPrint(filhosComandoElse.getFilhos().get(0), anotacao_funcao);
				else if(rotuloAtual.equals("Scan")){
					AST filhoNoScan = filhosComandoElse.getFilhos().get(0);
					if(filhoNoScan != null)
						testaScan(filhoNoScan, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando scan sem parâmetros em :"+filhosComandoElse.getLinha(), 
							filhosComandoElse.getLinha());
				}
				else if(rotuloAtual.equals("for")) testaComandos(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("if")) testaComandos(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("=")) testaAtribuicao(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("return")) testaReturn(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("exit")) continue;
				//else if(rotuloAtual.equals("else")) testaElse(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao"))testaChamadaFuncao(filhosComandoElse, anotacao_funcao);
			}
		}else throw new ErroAnotacaoDeComando("O comando "+noElse.getRotulo()+" com problema na anotacao em: "+noElse.getLinha(),
				noElse.getLinha());
	}
	
	public void testaChamadaFuncao(AST noChamadaFuncao, String anotacao_funcao) throws ErroVariavelNaoDelarada, ErroOperadorNot, ErroDeTipo, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(noChamadaFuncao, anotacao_funcao);
		if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
			return;
		}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
				+" não existe ou parametros de tipos incompatíveis em : "+noChamadaFuncao.getLinha(),noChamadaFuncao.getLinha());
		
	}
	
	public void testaIf(AST noIf, String anotacao_funcao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, ErroComandoReadSemParametros, ErroAnotacaoDeComando, IOException {
		AST noOperadorRelacional = noIf.getFilhos().get(0);
		verificaOperadorRelacional(noOperadorRelacional, anotacao_funcao, "bool");
		String rotuloAtual;
		if(noIf.getFilhos().get(0) != null){
			for(AST filhosComandoIf : noIf.getFilhos()){
				rotuloAtual = filhosComandoIf.getRotulo();
				if(rotuloAtual.equals("print")) testaPrint(filhosComandoIf.getFilhos().get(0), anotacao_funcao);
				else if(rotuloAtual.equals("scan")){
					AST filhoNoScan = filhosComandoIf.getFilhos().get(0);
					if(filhoNoScan != null)
						testaScan(filhoNoScan, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando scan sem parâmetros em :"+filhosComandoIf.getLinha(), 
							filhosComandoIf.getLinha());
				}
				else if(rotuloAtual.equals("for")) testaComandos(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("if")) testaIf(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("=")) testaAtribuicao(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("return")) testaReturn(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("exit")) continue;
				else if(rotuloAtual.equals("else")) testaElse(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao")) testaChamadaFuncao(filhosComandoIf, anotacao_funcao);
			}
		}else throw new ErroAnotacaoDeComando("O comando "+noIf.getRotulo()+" com problema na anotacao em: "+noIf.getLinha(),
				noIf.getLinha());
	}
	
	public void testaComandos(AST no, String anotacao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, ErroComandoReadSemParametros, ErroAnotacaoDeComando, IOException{
		String variavel="", valorInicial="", tipoValorInicial="", valorFinal="", passo="";
		String rotulo = no.getRotulo();
		if(rotulo.equals("while")){
			AST noOperadorRelacional = no.getFilhos().get(0);
			verificaOperadorRelacional(noOperadorRelacional, anotacao_funcao, "bool");
		}else if(rotulo.equals("for")){
			variavel = no.getFilhos().get(0).getFilhos().get(0).getRotulo();
			valorInicial = no.getFilhos().get(0).getFilhos().get(1).getRotulo();
			valorFinal = no.getFilhos().get(1).getFilhos().get(0).getRotulo();
			if(no.getFilhos().size()>2){
				if(no.getFilhos().get(2).getRotulo().equals("step"))
					passo = no.getFilhos().get(2).getFilhos().get(0).getRotulo();
			}
			if(tabela.verificaSeFoiDeclaradoEmVariaveisLocais(variavel, anotacao)){
				tipoValorInicial = tabela.retornaVariavelLocal(anotacao, variavel).getTipo();
			}else if(tabela.verificaSeExisteDeclaracaoEmVariaveisGlobais(variavel)){
				tipoValorInicial = tabela.getDeclaracoes_globais().get(variavel+"_var").getTipo();
			}else throw new ErroVariavelNaoDelarada("A variável "+variavel+" não foi declarada em : "
					+no.getLinha(), no.getLinha());
			if(tipoValorInicial.equals("int")){
				try{
					Integer.parseInt(valorInicial);
					//Integer.parseInt(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorInicial+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				
				try{
					//Integer.parseInt(valorInicial);
					Integer.parseInt(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorFinal+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				if(!passo.equals("")){
					try{
						Integer.parseInt(passo);
						//Integer.parseInt(valorFinal);
					}catch(Exception e){
						throw new ErroDeTipo("O valor do passo  tem que ser do tipo "+tipoValorInicial
								+" em :"+no.getLinha(),no.getLinha());
					}
				}
			}else if(tipoValorInicial.equals("real")){
				try{
					Float.parseFloat(valorInicial);
					//Integer.parseInt(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorInicial+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				
				try{
					//Integer.parseInt(valorInicial);
					Float.parseFloat(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorFinal+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				
				if(!passo.equals("")){
					try{
						Float.parseFloat(passo);
						//Integer.parseInt(valorFinal);
					}catch(Exception e){
						throw new ErroDeTipo("O valor do passo  tem que ser do tipo "+tipoValorInicial
								+" em :"+no.getLinha(),no.getLinha());
					}
				}
			}else throw new ErroDeTipo("Tipo "+tipoValorInicial+" não compatível em for em :"+no.getLinha(),
					no.getLinha());
		}
		
		String rotuloAtual;
		if(no.getFilhos().get(0) != null){
			for(AST comandos : no.getFilhos()){
				rotuloAtual = comandos.getRotulo();
				if(rotuloAtual.equals("print")) testaPrint(comandos.getFilhos().get(0), anotacao_funcao);
				else if(rotuloAtual.equals("scan")){
					AST filhoNoScan = comandos.getFilhos().get(0);
					if(filhoNoScan != null)
						testaScan(filhoNoScan, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando scan sem parâmetros em :"+comandos.getLinha(), 
								comandos.getLinha());
				}
				else if(rotuloAtual.equals("for")) testaComandos(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("if")) testaIf(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("=")) testaAtribuicao(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("return")) testaReturn(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("exit")) continue;
				//else if(rotuloAtual.equals("else")) testaElse(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao")) testaChamadaFuncao(comandos, anotacao_funcao);
			}
			
		}else throw new ErroAnotacaoDeComando("O comando "+rotulo+" com problema na anotacao em: "+no.getLinha(),
				no.getLinha());
		}
		
}
