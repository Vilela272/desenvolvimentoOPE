package br.com.formacao.java.Inicio;

/**
 * Classe que representa a modelagem de uma conta.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	String cpf;
	String profissao;
	
	/**
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * 
	 * @param valor
	 * @return True || False
	 */
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param valor
	 * @param destino
	 * @return True || False
	 */
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
}