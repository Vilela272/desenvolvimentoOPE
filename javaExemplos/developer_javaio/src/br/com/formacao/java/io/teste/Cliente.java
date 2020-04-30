package br.com.formacao.java.io.teste;

import java.io.Serializable;

/**
 * Classe que reprezsenta um cliente utilizando um Id de serializa��o.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class Cliente implements Serializable {

	private static final long serialVersionUID = 9205117266306915548L;//Administrar a vers�o da classe.
	private String nome;
    private String cpf;
    private String profissao;
    
    /**
     * 
     * @return Nome mais CPF
     */
    public String getNomeCpf() {
    	return nome + " " + cpf;
    }

    /**
     * 
     * @return Nome, CPF e a Profiss�o
     */
    public String getNomeCpfProfissao() {
    	return nome + " " + cpf + " " + profissao;
    }
    
    /**
     * 
     * @return
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
     * @return Profiss�o
     */
    public String getProfissao() {
        return profissao;
    }
    
    /**
     * 
     * @param profissao
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}