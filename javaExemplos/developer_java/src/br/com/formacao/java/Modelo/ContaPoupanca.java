package br.com.formacao.java.Modelo;

/**
 * Classe que representa uma Conta Poupan�a.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class ContaPoupanca extends Conta{
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }	
	
	@Override
	public String toString() {
		return "ContaPoupanca - " + super.toString();
	}
}
