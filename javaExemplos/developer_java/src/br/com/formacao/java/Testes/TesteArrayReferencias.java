package br.com.formacao.java.Testes;

import br.com.formacao.java.Modelo.Cliente;
import br.com.formacao.java.Modelo.Conta;
import br.com.formacao.java.Modelo.ContaCorrente;
import br.com.formacao.java.Modelo.ContaPoupanca;

/**
 * Classe que reprsenta o teste de array.
 * 
 * @author Guilherme Vilela
 *@version 0.1
 */

public class TesteArrayReferencias {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		Object referenciaGenerica = contas[1];
//		
//		//System.out.println(cc2.getNumero());
//		System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1];//type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
