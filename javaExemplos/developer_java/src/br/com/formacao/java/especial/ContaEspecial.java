package br.com.formacao.java.especial;

import br.com.formacao.java.Modelo.Conta;

/**
 * Classe que representa a conta especial.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class ContaEspecial extends Conta {
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
