package com.senac.laboratoriosenac;

public class EstruturaEstatica {

    public Paciente[] elementos;
    public int tamanho;
    public int preferenciais;

    public EstruturaEstatica(int capacidade) {
        this.elementos = new Paciente[capacidade];
        this.tamanho = 0;
        this.preferenciais = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean adiciona(Paciente paciente) {

        this.aumentaCapacidade();

        if (paciente.isPreferencial()) {
            adiciona(this.preferenciais, paciente);
            this.preferenciais+=1;
            return true;
        }

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = paciente;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Paciente paciente) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
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
