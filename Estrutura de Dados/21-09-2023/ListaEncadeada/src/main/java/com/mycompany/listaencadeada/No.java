package com.mycompany.listaencadeada;

public class No<Tipo> { //Todo nó tem informação e ponteiro

    private Tipo elemento; //Informação
    private No<Tipo> proximo; // Ponteiro

    public No(Tipo elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(Tipo elemento, No<Tipo> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Tipo getElemento() {
        return elemento;
    }

    public No<Tipo> getProximo() {
        return proximo;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    public void setProximo(No<Tipo> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", proximo=" + proximo + '}';
    }

}
