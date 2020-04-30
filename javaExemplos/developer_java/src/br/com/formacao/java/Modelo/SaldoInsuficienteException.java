package br.com.formacao.java.Modelo;

/**
 * Classe que representa a Exce��o do saldo insuficiente.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class SaldoInsuficienteException extends Exception{
	
	/**
	 * 
	 * @param msg
	 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
