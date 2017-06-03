/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excecoes;

public class ErroAnotacaoDeComando extends Exception{
	int linha;
	int coluna;
	
	public ErroAnotacaoDeComando(String mensagem, int linha) {
		super(mensagem);
		this.linha = linha;
		this.coluna = 0;
	}
		
	public ErroAnotacaoDeComando(String mensagem, int linha, int coluna) {
		super(mensagem);
		this.linha = linha;
		this.coluna = coluna;
	}
}
