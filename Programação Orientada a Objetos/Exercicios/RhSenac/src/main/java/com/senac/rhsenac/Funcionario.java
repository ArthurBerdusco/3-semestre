package com.senac.rhsenac;

abstract class Funcionario {

    private int codigo;
    private String nome;
    protected double salarioBase;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
        
    }

    public abstract double calcularSalario();

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

}
