package br.com.formacao.java.herdado;

/**
 * Classe que representa o teste de referencias.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteReferencias {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario ev = new EditorDeVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}