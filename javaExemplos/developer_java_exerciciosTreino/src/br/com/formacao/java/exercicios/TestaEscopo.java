package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de escopo
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaEscopo {

    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 4) {
			acompanhado = true;
		} 
		else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acomanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo (a)");
		}
		else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}
