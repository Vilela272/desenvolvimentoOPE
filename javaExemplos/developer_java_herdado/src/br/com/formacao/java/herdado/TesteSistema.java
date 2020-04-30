package br.com.formacao.java.herdado;

/**
 * Classe que representa o teste do sistema.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteSistema {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}

}