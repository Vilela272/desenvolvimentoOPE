package br.com.formacao.java.Modelo;

import java.io.Serializable;

/**
 * Classe que reprezsenta um cliente.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

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
     * @return
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
     * @return
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