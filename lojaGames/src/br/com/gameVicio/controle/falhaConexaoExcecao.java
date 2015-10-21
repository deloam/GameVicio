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
