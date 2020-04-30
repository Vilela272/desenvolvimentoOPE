package br.com.formacao.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que faz a leitura do arquivo contas.csv utilizando Scanner e locale.
 * 
 * @author Guilherme Vilela
 * @version  0.1
 */
public class TesteLeitura2 {
	
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR")  ,"%s - %02d, %02d - %s: %08.2f %n", 
					tipoConta, agencia, numero, titular, saldo);
			
			linhaScanner.close();
			
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
//			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}

}
