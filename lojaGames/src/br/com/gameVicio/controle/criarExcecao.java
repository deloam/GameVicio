
package br.com.gameVicio.controle;

public class criarExcecao extends RuntimeException  {
   
    public criarExcecao() {
		super();
	}

	public criarExcecao(String message, Throwable cause) {
		super(message, cause);
	}

	public criarExcecao(String message) {
		super(message);
	}

	public criarExcecao(Throwable cause) {
		super(cause);
	}
	
	
}
