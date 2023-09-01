package com.mycompany.banco;

public class Banco {

    public static void main(String[] args) {
        var conta = new ContaCorrente(2200, 12,"Joao");
        conta.setSaldo(100);
        System.out.println(conta.calcularSaldo());
    }
}
