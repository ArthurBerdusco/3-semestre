package com.senac.laboratoriosenac;

public class LaboratorioSenac {

    public static void main(String[] args) {
        Fila<Paciente> fila = new Fila<Paciente>();
        
        Paciente p1 = new Paciente("Arthur", 31); 
        Paciente p2 = new Paciente("Joao", 20); 
        Paciente p3 = new Paciente("Carlos", 20); 
        
        fila.enfileira(p1);
        fila.enfileira(p2);
        fila.enfileira(p3);
        
        System.out.println(fila.tamanho);
        
        System.out.println(fila.espiar());
    }

}
