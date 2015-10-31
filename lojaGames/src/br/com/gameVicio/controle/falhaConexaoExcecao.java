package br.com.gameVicio.controle;

public class falhaConexaoExcecao extends RuntimeException {

	public falhaConexaoExcecao() {
		super();
	}

	public falhaConexaoExcecao(String message, Throwable cause) {
		super(message, cause);
	}

	public falhaConexaoExcecao(String message) {
		super(message);
	}

	public falhaConexaoExcecao(Throwable cause) {
		super(cause);
	}
	
	
	

}
