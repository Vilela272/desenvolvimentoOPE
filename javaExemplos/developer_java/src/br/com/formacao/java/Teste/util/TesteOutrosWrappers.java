package br.com.formacao.java.Teste.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o teste de outros Wrappers.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteOutrosWrappers {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double dRef = Double.valueOf(3.2);//autoboxing
		System.out.println(dRef.doubleValue());//unboxing
		
		Boolean bRef = Boolean.TRUE;//autoboxing
		System.out.println(bRef.booleanValue());//unboxing
		
		Number refNumero = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}
}