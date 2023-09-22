package com.mycompany.listaencadeada;

import java.util.LinkedList;

public class Teste {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        
        lista.add("Arthur");
        lista.add("Carlos");
        lista.add("Jose");
        lista.add("Maria");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.size());
        System.out.println("Inicio da lista = " + lista.getFirst());
        System.out.println("Fim da lista = " + lista.getLast());
        System.out.println("Buscar informação na 2º posição da lista: " + lista.get(2));
        System.out.println("Buscar o nome Elis na lista: " + lista.contains("Carlos"));
        lista.remove(2);
        lista.remove("Arthur");
        System.out.println(lista);
  
        
        System.out.println("Tamanho da Lista = " + lista.size());
    }
}
