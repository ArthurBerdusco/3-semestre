package com.mycompany.ecommerce;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal preço;
    
    public Produto(String nome, BigDecimal preço) {
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", pre\u00e7o=" + preço + '}';
    }
    
    public String getNome() {
        return nome;
    }

    public BigDecimal getPreço() {
        return preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(BigDecimal preço) {
        this.preço = preço;
    }
    
    

    

}
