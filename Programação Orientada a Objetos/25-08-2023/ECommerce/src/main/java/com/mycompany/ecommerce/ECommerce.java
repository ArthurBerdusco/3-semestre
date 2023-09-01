package com.mycompany.ecommerce;

import java.math.BigDecimal;

public class ECommerce {

    public static void main(String[] args) {
        Produto livro1 = new Livro("Harry porta", new BigDecimal("50"), "Mark Zuckerberg");
        Eletronico eletronico1 = new Eletronico("Fone", new BigDecimal("100"), "JBL", "JBL231");
        
        
        
        
        System.out.println(eletronico1.toString());
        System.out.println(livro1.toString());
    }
}
