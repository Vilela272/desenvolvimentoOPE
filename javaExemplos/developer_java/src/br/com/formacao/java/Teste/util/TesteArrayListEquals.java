package br.com.formacao.java.Teste.util;

import java.util.ArrayList;

import br.com.formacao.java.Modelo.Conta;
import br.com.formacao.java.Modelo.ContaCorrente;

/**
 * Classe que representa o Teste de ArrayList com equals
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteArrayListEquals {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		//Generics
		ArrayList <Conta>lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		
		System.out.println("j� existe? " + existe);
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
	}

}
