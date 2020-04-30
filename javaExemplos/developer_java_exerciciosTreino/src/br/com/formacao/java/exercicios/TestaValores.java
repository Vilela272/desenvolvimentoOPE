package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de valores
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaValores {
    
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		// quanto vale o segundo?
		
		System.out.println(segundo);
	}
}
