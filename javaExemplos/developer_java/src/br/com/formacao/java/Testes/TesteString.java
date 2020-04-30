package br.com.formacao.java.Testes;

/**
 * Classe que representa o teste de String.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class TesteString {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		
		String nome = "Alura";//object literal
		//String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);

//		char c = 'A';
//		char d = 'a';

//		String outro = nome.replace(c, d);
		//String outro = nome.toLowerCase();
		//String outro = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outro);

	}

}
