package com.mycompany.tarefasagendadas;

import java.util.Scanner;
import java.util.Arrays;

public class ListaTarefas {

    private Tarefa[] tarefas;
    private int id = 1;

    public int getId() {
        return id;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
    private int tamanho = 0;

    public ListaTarefas() {
        this.tarefas = new Tarefa[5];
    }
    
    public void editarTarefa(Tarefa tarefaAtualizada){
        for(Tarefa tarefa: getTarefas()){
            if(tarefa.getId() == tarefaAtualizada.getId()){
                tarefa = tarefaAtualizada;
                return;
            }
        }
    }

    public void adicionar(Tarefa tarefa) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < tarefas.length) {
            tarefa.setId(this.getId());
            this.tarefas[this.tamanho] = tarefa;
            this.tamanho++;
            this.id++;
        } else {
            throw new Exception("O vetor está cheio, não é possível adicionar novos tarefas");
        }
    }

    public boolean adicionaNaPosicao(int posicao, Tarefa elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < this.tamanho) {
            for (int i = this.tamanho; i > posicao; i--) {
                this.tarefas[i + 1] = this.tarefas[i];
            }
            this.tarefas[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Posição Inválida!");
        }
        return true;
    }

    public Tarefa buscarTarefa(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return tarefas[posicao];
        } else {
            throw new Exception("Posição de busca não encontrada");
        }
    }

    public int buscarPosicao(Tarefa elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (tarefas[i].equals(elemento)) {
                return i;

            }
        }
        return -1;
    }

    public void remover(int posicao) throws Exception {
        if (posicao >= 0 && posicao < this.tamanho) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.tarefas[i] = this.tarefas[i + 1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posição do array inválida");
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
            s.append(this.tarefas[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.tarefas[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.tarefas.length) {
            Tarefa[] tarefasNovos = new Tarefa[this.tarefas.length * 2];
            for (int i = 0; i < this.tarefas.length; i++) {
                tarefasNovos[i] = this.tarefas[i];
            }
            this.tarefas = tarefasNovos;
        }
    }
}
