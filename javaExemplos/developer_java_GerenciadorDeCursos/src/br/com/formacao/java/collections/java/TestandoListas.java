package br.com.formacao.java.collections.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe que representa o teste de listas.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestandoListas {

    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {

		String aula1 = "Conhecendo mais sobre Listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e set";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A Primeira aula �: " + primeiraAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
			
		}
		
		System.out.println(aulas.size());
		
		aulas.forEach(aula -> {
			System.out.println(aula);
			System.out.println("percorrendo: " + aula);
		});
		
		aulas.add("Aula aumentando meu conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println("Depois de ordenados: ");
		System.out.println(aulas);
	}

}
