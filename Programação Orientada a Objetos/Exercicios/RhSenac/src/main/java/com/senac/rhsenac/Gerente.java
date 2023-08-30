package com.senac.rhsenac;

public class Gerente extends Funcionario{
    
    private String area;
    private double bonus;
    
    public Gerente() {
    }

    public Gerente(int codigo, String nome, double salarioBase, String area, double bonus) {
        super(codigo, nome, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase += this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "nome=" + this.getNome() + ", código=" + this.getCodigo() + ", area=" + area + ", bonus=" + bonus + ", salario=" + this.calcularSalario() + '}';
    }
    
    

}
