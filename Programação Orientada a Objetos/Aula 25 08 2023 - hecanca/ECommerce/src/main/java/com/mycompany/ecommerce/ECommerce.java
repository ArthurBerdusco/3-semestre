package com.mycompany.ecommerce;

public class ECommerce {

    public static void main(String[] args) {
        Produto livro1 = new Livro("Harry porta", 50, "Mark Zuckerberg");
        Eletronico eletronico1 = new Eletronico("Fone", 200, "JBL", "JBL231");
        
        
        
        
        System.out.println(eletronico1.toString());
        System.out.println(livro1.toString());
    }
}
