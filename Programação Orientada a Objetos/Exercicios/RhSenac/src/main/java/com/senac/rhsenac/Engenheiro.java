package com.senac.rhsenac;

import java.math.BigDecimal;

public class Engenheiro extends Funcionario{
    
    
    private String departamento;
    private String crea;

    public Engenheiro(int codigo, String nome, BigDecimal salarioBase, String departamento, String crea) {
        super(codigo, nome, salarioBase);
        this.departamento = departamento;
        this.crea = crea;
    }

    @Override
    public BigDecimal calcularSalario(){
        return salarioBase.multiply(new BigDecimal("1.5"));
    }

    @Override
    public String toString() {
        return "Engenheiro{" + super.toString() + "departamento=" + departamento + ", crea=" + crea + ", salarioTotal=" + this.calcularSalario() + '}';
    }
    
}
