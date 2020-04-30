package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

/**
 * Classe que representa a alteração de saldo.
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */

public class AlteraSaldoContaGuilherme {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta contaDoGuilherme = em.find(Conta.class, 1L);
		
		em.getTransaction().begin();
		
		contaDoGuilherme.setSaldo(20.0);
		
		em.getTransaction().commit();
		
	}

}
