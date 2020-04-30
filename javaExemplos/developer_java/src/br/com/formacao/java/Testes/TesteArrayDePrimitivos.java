package br.com.formacao.java.Testes;

/**
 * Classe para representa o teste de Arrays.
 * 
 * @author Guilherme Vilela
 *@version 0.1
 */

public class TesteArrayDePrimitivos {

	//Array []
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] idades = new int[5];//inicializa o array com o valor padr�o (0)
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
