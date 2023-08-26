package com.mycompany.ecommerce;

public class Eletronico extends Produto{
    
    private String marca;
    private String modelo;


    public Eletronico() {
    }

    public Eletronico(String nome, double preço, String marca, String modelo) {
        super(nome, preço);
        this.marca = marca;
        this.modelo = modelo;
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Eletronico{" + "marca=" + marca + ", modelo=" + modelo + ", nome=" + getNome() + ", preço=" + getPreço() +  '}';
    }
    
}
