package br.com.gameVicio.controle;

public class deleteExcecao extends RuntimeException {
    public deleteExcecao() {
		super();
	}

	public deleteExcecao(String message, Throwable cause) {
		super(message, cause);
	}

	public deleteExcecao(String message) {
		super(message);
	}

	public deleteExcecao(Throwable cause) {
		super(cause);
	}
	
}
