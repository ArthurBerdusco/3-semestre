package com.mycompany.estruturaestatica;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
    }

    @Override
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    @Override
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
    
}
