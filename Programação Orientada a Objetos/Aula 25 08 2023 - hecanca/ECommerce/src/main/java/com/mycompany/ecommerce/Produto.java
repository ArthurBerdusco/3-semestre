package com.mycompany.ecommerce;

public class Produto {

    private String nome;
    private double preço;

    public Produto() {
    }
    
    public Produto(String nome, double preço) {
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

    public double getPreço() {
        return preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    

    

}
