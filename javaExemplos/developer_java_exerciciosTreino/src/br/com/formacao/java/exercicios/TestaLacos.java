package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de laço com o for
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaLacos {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		for(int multiplicador = 1; multiplicador < 10; multiplicador++) {
			for(int contador = 0; contador <=10; contador ++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
