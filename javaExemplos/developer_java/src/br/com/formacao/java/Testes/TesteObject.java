package br.com.formacao.java.Testes;

import br.com.formacao.java.Modelo.ContaCorrente;
import br.com.formacao.java.Modelo.ContaPoupanca;;

/**
 * Classe que representa o teste do tipo "Object".
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteObject {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		//Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cc);

	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}

	static void println(boolean valor) {
	
	}
	
	static void println(Object referencia) {
		
	}

}
