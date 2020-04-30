package br.com.formacao.java.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe que representa o teste de cursos utilizando Collections
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaCurso2 {
    
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		
		System.out.println(javaColecoes);
	}

}
