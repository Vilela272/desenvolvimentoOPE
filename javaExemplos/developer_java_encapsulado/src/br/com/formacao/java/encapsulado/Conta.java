package br.com.formacao.java.encapsulado;

/**
 * Classe que representa uma modelagem da conta de um cliente.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

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
         * @return Saldo
         */
		public double getSaldo() {
			return this.saldo;
	}
		
                /**
                 * 
                 * @return numero
                 */
		public int getNumero() {
			return this.numero;
		}
}