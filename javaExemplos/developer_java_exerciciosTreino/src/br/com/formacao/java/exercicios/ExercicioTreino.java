package br.com.formacao.java.exercicios;

/**
 * Classe que representa a modelagem de salario
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class ExercicioTreino {
    
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Pode deduzir na dclara��o o valor de R$ 142");
		}
		
		if(salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Pode deduzir R$ 350");
		}
		
		if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Pode deduzir R$ 636");
		}
	}

}
