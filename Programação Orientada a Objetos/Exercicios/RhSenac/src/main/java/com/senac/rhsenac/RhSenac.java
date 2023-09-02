package com.senac.rhsenac;

import java.math.BigDecimal;

public class RhSenac {

    public static void main(String[] args) {
        var engenheiro = new Engenheiro(1, "João Silva", new BigDecimal(5500), "Automação", "182938");
        var gerente = new Gerente(2, "Carlos Souza", new BigDecimal(7890), "Serviços", new BigDecimal(3500));
        var presidente = new Presidente(3, "Fabio Santos", new BigDecimal(22300), new BigDecimal(75000));
        
        System.out.println(engenheiro);
        System.out.println(gerente);
        System.out.println(presidente);
    }
    
}
