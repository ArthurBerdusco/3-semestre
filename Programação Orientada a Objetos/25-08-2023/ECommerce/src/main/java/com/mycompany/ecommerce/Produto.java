package com.mycompany.ecommerce;

import java.math.BigDecimal;

public abstract class Produto {

    public static final String NOME_DA_LOJA = "Arthur";
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract BigDecimal calcularDesconto();

    public static void mostrarNomeLoja() {
        System.out.println(NOME_DA_LOJA);
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

}
