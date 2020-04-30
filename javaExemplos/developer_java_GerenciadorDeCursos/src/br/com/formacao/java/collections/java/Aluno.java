package br.com.formacao.java.collections.java;

/**
 * Classe que representa a modelagem de um aluno.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Aluno {

	private String nome;
	private int numeroMatricula;

        /**
         * 
         * @param nome
         * @param numeroMatricula 
         */
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("nome n�o pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

        /**
         * 
         * @return Nome
         */
	public String getNome() {
		return nome;
	}

        /**
         * 
         * @return numeroMatricula
         */
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

}
