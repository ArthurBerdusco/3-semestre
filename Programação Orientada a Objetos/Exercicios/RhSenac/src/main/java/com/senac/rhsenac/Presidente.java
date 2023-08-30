package com.senac.rhsenac;

public class Presidente extends Funcionario{
    
    private double cotaAcoes;

    public Presidente() {
    }

    public Presidente(int codigo, String nome, double salarioBase, double cotaAcoes) {
        super(codigo, nome, salarioBase);
        this.cotaAcoes = cotaAcoes;
    }

    @Override
    public double calcularSalario() {
        return salarioBase += cotaAcoes;
    }

    @Override
    public String toString() {
        return "Presidente{" + "nome=" + this.getNome() + ", código=" + this.getCodigo() + ", cotaAcoes=" + cotaAcoes + ", salario=" + this.calcularSalario() + '}';
    }
   
    
}
