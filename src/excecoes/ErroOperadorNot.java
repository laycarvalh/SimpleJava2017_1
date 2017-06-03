package excecoes;

public class ErroOperadorNot extends Exception{
	int linha;
	int coluna;
	
	public ErroOperadorNot(String mensagem, int linha) {
		super(mensagem);
		this.linha = linha;
		this.coluna = 0;
	}
		
	public ErroOperadorNot(String mensagem, int linha, int coluna) {
		super(mensagem);
		this.linha = linha;
		this.coluna = coluna;
	}
}
