package com.senac.laboratoriosenac;

/**
 *
 * @author arthur.sbsouza
 */

public class EstruturaEstatica<Paciente> {

    public Paciente[] elementos;
    public int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (Paciente[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean adiciona(Paciente paciente) {
        this.aumentaCapacidade();
        
        if (this.tamanho < this.elementos.length) {
            System.out.println("Entrei aqui no adiciona super");
            this.elementos[this.tamanho] = paciente;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Paciente paciente) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i++) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = paciente;
        this.tamanho++;
        return true;
    }


    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Paciente[] pacientesNovos = (Paciente[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                pacientesNovos[i] = this.elementos[i];

            }
            this.elementos = pacientesNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

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

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

}
