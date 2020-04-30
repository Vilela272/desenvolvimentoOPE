package br.com.formacao.java.exercicios;

/**
 * Classe que representa o testes de laços com for
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaLacos2 {

    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		for(int linha = 0; linha < 10; linha++) {
			
			for(int coluna = 0; coluna <= linha; coluna ++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
