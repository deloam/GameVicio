/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gameVicio.controle;

/**
 *
 * @author Deloam Kitty
 */
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
