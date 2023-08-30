package com.senac.rhsenac;

public class Engenheiro extends Funcionario{
    
    
    private String departamento;
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(int codigo, String nome, double salarioBase, String departamento, String crea) {
        super(codigo, nome, salarioBase);
        this.departamento = departamento;
        this.crea = crea;
    }

    @Override
    public double calcularSalario(){
        return salarioBase * 1.5;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + "nome=" + this.getNome() + ", código=" + this.getCodigo() +  ", departamento=" + departamento + ", crea=" + crea + ", salario=" + this.calcularSalario() + '}';
    }
    
}
