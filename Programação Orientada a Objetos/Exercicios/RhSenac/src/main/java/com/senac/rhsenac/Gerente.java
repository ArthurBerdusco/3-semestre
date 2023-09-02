package com.senac.rhsenac;

import java.math.BigDecimal;

public class Gerente extends Funcionario{
    
    private String area;
    private BigDecimal bonus;

    public Gerente(int codigo, String nome, BigDecimal salarioBase, String area, BigDecimal bonus) {
        super(codigo, nome, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }

    @Override
    public BigDecimal calcularSalario() {
        return salarioBase.add(this.bonus);
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() + "area=" + area + ", bonus=" + bonus + ", salarioTotal=" + this.calcularSalario() + '}';
    }
    
    

}
