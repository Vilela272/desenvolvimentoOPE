package br.com.formacao.java.Modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Guilherme Vilela
 * @version 0.1
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total = 0;
    
    /**
     * Construtor para inicializar o objeto conta a partir da ag�ncia e numero;
     * 
     * @param agencia
     * @param numero
     */
    
    public Conta(int agencia, int numero){
        Conta.total++;
//        System.out.println("O total de contas � " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);
    
    /**
     * Valor precisa ser maior do que o saldo.
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo <= valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        this.saldo -= valor;
    }

    /**
     * 
     * @param valor
     * @param destino
     * @throws SaldoInsuficienteException
     */
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }
    
    /**
     * 
     * @return
     */
        		
    public double getSaldo(){
        return this.saldo;
    }

    /**
     * 
     * @return
     */
    public int getNumero(){
        return this.numero;
    }

    /**
     * 
     * @param numero
     */
    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    /**
     * 
     * @return
     */
    public int getAgencia(){
        return this.agencia;
    }

    /**
     * 
     * @param agencia
     */
    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    /**
     * 
     * @param titular
     */
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    /**
     * 
     * @return
     */
    public Cliente getTitular(){
        return this.titular;
    }

    /**
     * 
     * @return
     */
    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta outra = (Conta)ref;
    	
    	if(this.agencia != outra.agencia) {
    		return false;
    	}
    	if(this.numero != outra.numero) {
    		return false;
    	}
    	return true;
    }
    
    @Override
    public int compareTo(Conta outra) {
    	return Double.compare(this.saldo, outra.saldo);
    }
    
    @Override
	public String toString() {
		return "Nummero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}

}