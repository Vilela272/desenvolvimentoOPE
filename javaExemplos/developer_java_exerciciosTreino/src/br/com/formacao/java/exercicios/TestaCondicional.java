package br.com.formacao.java.exercicios;

/**
 * Classe que representa o testde de condicionais
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaCondicional {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 15;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo (a)");
		}
		else {
			if(quantidadePessoas >=2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar. " + "pois est� acompanhado");
			}
			else {
				System.out.println("infelizmente voc� n�o pode entrar");
			}
			
		}
	}
}
