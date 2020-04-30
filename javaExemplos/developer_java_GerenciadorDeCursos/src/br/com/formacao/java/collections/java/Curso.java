package br.com.formacao.java.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Classe que representa a modelagem de um curso
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
        /**
         * 
         * @param nome
         * @param instrutor 
         */
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
        /**
         * 
         * @return nome
         */
	public String getNome() {
		return nome;
	}
	
        /**
         * 
         * @return instrutor
         */
	public String getInstrutor() {
		return instrutor;
	}
	
        /**
         * 
         * @return 
         */
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
        /**
         * 
         * @param aula 
         */
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
        /**
         * 
         * @return soma do tempo das aulas
         */
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
        /**
         * 
         * @return uma visão de alunos
         */
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

        /**
         * 
         * @param aluno
         * @return aluno
         */
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
}
