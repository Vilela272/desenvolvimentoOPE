package br.com.caelum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.caelum.model.Produto;

/**
 * Classe que representa o teste de cache
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */

public class TestaCache {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfigurator.class);
		
		EntityManagerFactory entityManagerFactory = ctx.getBean(EntityManagerFactory.class);
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Produto produto = em.find(Produto.class, 1);
		Produto produto2 = em.find(Produto.class, 2);

		System.out.println(produto.getNome());
		System.out.println(produto2.getNome());
		
		em.close();
	}
}
