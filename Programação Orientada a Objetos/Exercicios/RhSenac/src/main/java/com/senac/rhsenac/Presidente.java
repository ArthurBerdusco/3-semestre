package com.senac.rhsenac;

import java.math.BigDecimal;

public final class Presidente extends Funcionario{
    
    private BigDecimal cotaAcoes;

    public Presidente(int codigo, String nome, BigDecimal salarioBase, BigDecimal cotaAcoes) {
        super(codigo, nome, salarioBase);
        this.cotaAcoes = cotaAcoes;
    }

    @Override
    public BigDecimal calcularSalario() {
        return salarioBase.add(cotaAcoes);
    }

    @Override
    public String toString() {
        return "Presidente{" + super.toString() + "cotaAcoes=" + cotaAcoes + ", salarioTotal=" + this.calcularSalario() + '}';
    }
   
}
