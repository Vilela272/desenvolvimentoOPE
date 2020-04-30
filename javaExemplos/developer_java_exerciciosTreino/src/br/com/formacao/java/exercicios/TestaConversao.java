package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de conversão
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaConversao {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		double salario = 1270.50;
		//float pontoFlutuante = 3.14f;
		int valor = (int) salario;
		System.out.println(valor);
		
		/*
		long numeroGrande = 999999999999l;
		short valorPequeno = 2131;
		byte b = 127;
		*/
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
