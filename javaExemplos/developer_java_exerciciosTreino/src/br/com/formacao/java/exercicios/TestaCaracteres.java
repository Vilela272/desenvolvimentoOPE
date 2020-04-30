package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de caracteres
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaCaracteres {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Alura curso online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
