package com.senac.rhsenac;

import java.math.BigDecimal;

public abstract class Funcionario {

    private int codigo;
    private String nome;
    protected BigDecimal salarioBase;

    public Funcionario(int codigo, String nome, BigDecimal salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract BigDecimal calcularSalario();

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

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", salarioBase=" + salarioBase;
    }
    
    

}
