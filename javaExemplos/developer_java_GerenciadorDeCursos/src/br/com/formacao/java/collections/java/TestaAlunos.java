package br.com.formacao.java.collections.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Classe que representa o teste de alunos utilizando HashSet e Collection
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaAlunos {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
	
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio lopes");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
