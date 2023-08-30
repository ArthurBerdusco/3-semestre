package com.senac.rhsenac;

public class RhSenac {

    public static void main(String[] args) {
        Funcionario engenheiro1 = new Engenheiro(1, "João Silva", 5500, "Automação", "182938");
        Funcionario gerente1 = new Gerente(2, "Carlos Souza", 7890, "Serviços", 3500);
        Funcionario presidente1 = new Presidente(3, "Fabio Santos", 22300, 75000);
        
        System.out.println(engenheiro1.toString());
        System.out.println(gerente1.toString());
        System.out.println(presidente1.toString());
    }
    
}
