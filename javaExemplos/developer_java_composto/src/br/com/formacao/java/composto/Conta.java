package br.com.formacao.java.composto;

/**
 * Classe que representa a modelagem de uma conta de cliente
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
			return false;
		}
	
       /**
        * 
        * @return saldo
        */
		public double getSaldo() {
			return this.saldo;
	}
}