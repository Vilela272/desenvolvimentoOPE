package br.com.formacao.java.Testes;

import br.com.formacao.java.Modelo.ContaCorrente;
import br.com.formacao.java.Modelo.ContaPoupanca;
import br.com.formacao.java.Modelo.SaldoInsuficienteException;

/**
 * Classe que representa o teste de contas.
 * 
 * @author Guilherme Vilela
 *@version 0.1
 */
//br.com.bytebank.banco.Teste.TesteContas
public class TesteContas {
	
	/**
	 * 
	 * @param args
	 * @throws SaldoInsuficienteException
	 */
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}