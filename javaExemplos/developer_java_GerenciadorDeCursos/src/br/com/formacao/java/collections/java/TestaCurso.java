package br.com.formacao.java.collections.java;

import java.util.List;

/**
 * Classe que representa o teste de Cursos
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaCurso {

    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(javaColecoes.getAulas());
		
	}

}
