package com.mycompany.projeto1.vetor;
import java.util.Scanner;
import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho = 0;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public void adicionar(String elemento) throws Exception {
        if (this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor está cheio, não é possível adicionar novos elementos");
        }
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.tamanho -1; i++){
            s.append(elementos[i] + ", ");
        }
        s.append("]");
        
        
        return Arrays.toString(elementos);
    }
    
    public String busca(int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            return elementos[posicao];
        }else{
            throw new Exception("Posição de busca não encontrada");
        }
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        
        try {
            vetor.adicionar("Arthur");
            vetor.adicionar("Fabio");
            vetor.adicionar("Carlos");
            vetor.adicionar("Maria");
            vetor.adicionar("Clara");
            vetor.adicionar("Clara");
            System.out.println(vetor.busca(1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        System.out.println("Tamanho: " + vetor.getTamanho());
        System.out.println(vetor.toString());
        
    }
}
