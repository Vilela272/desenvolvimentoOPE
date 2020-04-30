package br.com.formacao.java.exercicios;

/**
 * Classe que representa o teste com While
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaWhile {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
            int contador = 0;
            while(contador <= 10) {
		System.out.println(contador);
		// contador = contador + 1
		//contador += 1;
		++contador;
            }
		
		System.out.println(contador);
	}
}
