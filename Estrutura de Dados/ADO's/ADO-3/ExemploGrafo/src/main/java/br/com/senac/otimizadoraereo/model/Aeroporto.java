package br.com.senac.otimizadoraereo.model;

public class Aeroporto {
    
    private String nome;
    private int capacidade;

    public Aeroporto() {
    }

    public Aeroporto(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Aeroporto{" + "nome=" + nome + ", capacidade=" + capacidade + '}';
    }
    
}
