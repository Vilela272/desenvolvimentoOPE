package br.com.formacao.java.herdado;

/**
 * Classe que representa o teste do Gerente.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteGerente {
    
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		Autenticavel gerente = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Guilherme");
		g1.setCpf("438.432.548-77");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autentica = g1.autentica(2222);
		
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}

}