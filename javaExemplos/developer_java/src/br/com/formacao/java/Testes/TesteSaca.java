package br.com.formacao.java.Testes;

import br.com.formacao.java.Modelo.ContaCorrente;
import br.com.formacao.java.Modelo.SaldoInsuficienteException;
import br.com.formacao.java.Modelo.Conta;

/**
 * Classe que representa o teste de saque.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class TesteSaca {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		}catch (SaldoInsuficienteException ex) {
			System.out.println("EX: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
