package br.com.formacao.java.Modelo;

/**
 * Classe que representa uma Conta Corrente
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

// Nova ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	// Anota��o/configura��o do compilador
	@Override 
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente - " + super.toString();
	}
}
