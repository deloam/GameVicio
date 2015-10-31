package br.com.gameVicio.controle;

public class excecaoUpdate extends RuntimeException {
    
	public excecaoUpdate() {
		super();
	}

	public excecaoUpdate(String message, Throwable cause) {
		super(message, cause);
	}

	public excecaoUpdate(String message) {
		super(message);
	}

	public excecaoUpdate(Throwable cause) {
		super(cause);
	}
	
	
	
}
