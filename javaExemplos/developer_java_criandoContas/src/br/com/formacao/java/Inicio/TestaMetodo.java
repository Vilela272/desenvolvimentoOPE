package br.com.formacao.java.Inicio;

/**
 * Classe que reprsenta o teste dos metodos da conta.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaMetodo {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.saldo = 100;
		contaDoGuilherme.deposita(50);
		System.out.println("Saldo Atual: " + contaDoGuilherme.saldo);
		
		boolean conseguiuRetirar = contaDoGuilherme.saca(20);
		System.out.println("Novo saldo: " + contaDoGuilherme.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoGuilherme);
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia feita com sucesso");
		}
		else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoGuilherme.saldo);
		
		contaDoGuilherme.titular = "Guilherme Vilela";
		System.out.println(contaDoGuilherme.titular);
		
//		Conta contaDaPaula = new Conta();
//		contaDaPaula.saldo = 200;
//		contaDaPaula.deposita(100);
//		System.out.println(contaDaPaula.saldo);
	}
}
