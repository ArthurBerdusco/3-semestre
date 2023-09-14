package com.mycompany.estruturaestatica;

import com.mycompany.estruturaestatica.Fila;
import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
//
//    	Fila<Integer> fila = new Fila<Integer>();
//    	
//    	fila.enfileira(1);
//    	fila.enfileira(2);
//    	fila.enfileira(3);
//    	
//    	System.out.println("A fila esta vazia? " + fila.estaVazia());
//    	
//    	System.out.println("Qual o tamanho da fila: " + fila.tamanho());
//    	
//    	System.out.println(fila.toString());
//    	
//    	if(fila.espiar() == null) {
//    		System.out.println("Ninguem na Fila");
//    	} else {
//    		System.out.println("O elemento da primeira posição é " + fila.espiar());
//    	}
//    	
//    	System.out.println(fila.desenfileira());

        Queue<Integer> fila = new LinkedList<Integer>();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);
        
        System.out.println(fila.toString());
        
        System.out.println(fila.peek());
        
        System.out.println(fila.remove());
    	
    }
}
