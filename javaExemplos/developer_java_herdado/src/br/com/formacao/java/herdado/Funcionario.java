package br.com.formacao.java.herdado;
/**
 * Classe que representa a moldura de um funcion�rio.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public abstract class Funcionario {
		
		private String nome;
		private String cpf;
		private double salario;
		
		/**
		 * 
		 * @return
		 */
		//Esse met�do n�o pode ser instanciado, pois � abstrato
		//Metodo sem corpo, n�o h� implementa��o		
		public abstract double getBonificacao(); 
		
		/**
		 * 
		 * @return Nome
		 */
		public String getNome() {
			return nome;
		}
		
		/**
		 * 
		 * @param nome
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		/**
		 * 
		 * @return CPF
		 */
		public String getCpf() {
			return cpf;
		}
		
		/**
		 * 
		 * @param cpf
		 */
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		/**
		 * 
		 * @return Salario
		 */
		public double getSalario() {
			return salario;
		}
		
		/**
		 * 
		 * @param salario
		 */
		public void setSalario(double salario) {
			this.salario = salario;
		}
}