package br.com.formacao.java.exercicios;

/**
 * Classe que represeta o teste de mês
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaMes {
    
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		int mes = 10;
		
		switch (mes) {
		case 1:
			System.out.println("O m�s � Janeiro");
			break;
		case 2:
			System.out.println("O m�s � Fevereiro");
			break;
		case 3:
			System.out.println("O m�s � Mar�o");
			break;
		case 4:
			System.out.println("O m�s � Abril");
			break;
		case 5:
			System.out.println("O m�s � Maio");
			break;
		case 6:
			System.out.println("O m�s � Junho");
			break;
		case 7:
			System.out.println("O m�s � Julho");
			break;
		case 8:
			System.out.println("O m�s � Agosto");
			break;
		case 9:
			System.out.println("O m�s � Setembro");
			break;
		case 10:
			System.out.println("O m�s � Outubro");
			break;
		case 11:
			System.out.println("O m�s � Novembro");
			break;
		case 12:
			System.out.println("O m�s � Dezembrp");
			break;
		default:
			System.out.println("M�s inv�lido");
			break;
		}
	}

}
