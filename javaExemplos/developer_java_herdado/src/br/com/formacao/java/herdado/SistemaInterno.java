package br.com.formacao.java.herdado;

/**
 * Classe que representa um sistema interno.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class SistemaInterno {
	
	private int senha = 222;
	
	/**
	 * 
	 * @param fa
	 */
	public void autentica(Autenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Permiss�o concedida!!!");
		}
		else {
			System.out.println("N�o possui permiss�o");
		}
	}

}