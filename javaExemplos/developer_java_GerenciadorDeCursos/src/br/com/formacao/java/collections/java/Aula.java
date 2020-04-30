package br.com.formacao.java.collections.java;

/**
 * Classe que representa a modelagem de uma aula.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
        /**
         * 
         * @param titulo
         * @param tempo 
         */
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
        /**
         * 
         * @return titulo
         */
	public String getTitulo() {
		return titulo;
	}
	
        /**
         * 
         * @return tempo
         */
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + " " + this.tempo + " minuto]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
