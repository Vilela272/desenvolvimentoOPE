package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de condicionais
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaCondicional2 {

    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acomanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo (a)");
		}
		else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}
