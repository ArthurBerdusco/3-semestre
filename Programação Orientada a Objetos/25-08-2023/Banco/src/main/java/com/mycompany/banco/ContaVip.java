
package com.mycompany.banco;

public class ContaVip extends Conta{
    
    private double limite;
    
    @Override
    public double calcularSaldo(){
        return getSaldo() + limite;
    }
    
}
