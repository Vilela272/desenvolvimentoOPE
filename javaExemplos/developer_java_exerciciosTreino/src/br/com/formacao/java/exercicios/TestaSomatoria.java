package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste de somatoria
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaSomatoria {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println(total);
	}

}
