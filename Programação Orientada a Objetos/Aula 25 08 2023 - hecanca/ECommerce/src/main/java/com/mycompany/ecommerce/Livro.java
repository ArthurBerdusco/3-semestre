package com.mycompany.ecommerce;

public class Livro extends Produto {

    private String autor;

    public Livro() {
    }

    public Livro(String nome, double preço, String autor) {
        super(nome, preço);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Eletronico{" + "marca=" + autor + ", nome=" + getNome() + ", preço=" + getPreço() + '}';
    }

}
