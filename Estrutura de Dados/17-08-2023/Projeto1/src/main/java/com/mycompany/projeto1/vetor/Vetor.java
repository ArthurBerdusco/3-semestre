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
        this.aumentaCapacidade();
        if (this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor está cheio, não é possível adicionar novos elementos");
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public String buscarElemento(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else {
            throw new Exception("Posição de busca não encontrada");
        }
    }

    public int buscarPosicao(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i].equalsIgnoreCase(elemento)) {
                return i;

            }
        }
        return -1;
    }

    public boolean adicionaNaPosicao(int posicao, String elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < this.tamanho) {
            for (int i = this.tamanho; i > posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Posição Inválida!");
        }
        return true;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < this.tamanho) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posição do array inválida");
        }
    }

    public boolean removeElemento(String elemento) {

        for (int i = 0; i < this.tamanho - 1; i++) {
            if (elemento.equalsIgnoreCase(elementos[i])) {
                this.elementos[i] = this.elementos[i + 1];
                this.tamanho--;
                return true;
                
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adicionar("Arthur");
            vetor.adicionar("Fabio");
            vetor.adicionar("Carlos");
            vetor.adicionar("Maria");
            vetor.adicionar("Clara");
            vetor.adicionar("Maike");
            vetor.adicionar("Joao");
            vetor.removeElemento("arthur");

            //vetor.adicionaNaPosicao(4, "Clebin");
            System.out.println(vetor.buscarElemento(8));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(vetor.buscarPosicao("arthur"));

        System.out.println("Tamanho: " + vetor.getTamanho());
        System.out.println(vetor.toString());
    }
}
