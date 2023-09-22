package com.mycompany.listaencadeada;

public class ListaEncadeada<Tipo> {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }
    
    public void adiciona(Tipo elemento){
        No<Tipo> celula = new No<Tipo>(elemento);
        if(this.inicio == null && this.fim == null){
            this.inicio = celula;
            this.fim = celula;
        }else{
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    public No getInicio() {
        return inicio;
    }

    public No getFim() {
        return fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }

}
