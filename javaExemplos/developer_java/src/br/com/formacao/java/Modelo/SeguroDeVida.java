package br.com.formacao.java.Modelo;

/**
 * Classe que representa o seguro de vida.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}