package br.com.alura.jpa.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que representa a criacao de tabela conta no banco de dados.
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */

public class CriaTabelaConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		emf.close();
	}
}
