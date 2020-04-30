package br.com.formacao.java.herdado;

/**
 * Classe que representa um Designer que extende de funcion�rio.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Designer extends Funcionario {
	
    /**
     * 
     * @return 200
     */
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Designer");
		return 200;
	}	

}