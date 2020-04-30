package br.com.formacao.java.Teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.formacao.java.Modelo.Conta;
import br.com.formacao.java.Modelo.ContaCorrente;

/**
 * Classe que representa o teste de ArrayList.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteArrayList {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Generics
		List<Conta>lista = new ArrayList<Conta>();//Thread safe
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------");
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
	}

}
