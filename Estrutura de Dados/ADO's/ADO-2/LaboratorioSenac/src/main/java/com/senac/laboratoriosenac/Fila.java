package com.senac.laboratoriosenac;
import com.senac.laboratoriosenac.Paciente;

public class Fila<T extends Paciente> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T p) {
        
        if(p.isIdoso()){
            System.out.println("Sou idoso");
            super.adiciona(0,p);
        }
        
        System.out.println("Não sou idoso");
        
        super.adiciona(p);    
    }

    public void enfileiraPreferencial(T elemento) {
        super.adiciona(0, elemento);
    }

    public Paciente espiar() {
        if (this.estaVazia()) {
            return null;
        }
        
        System.out.println(this.elementos[0] instanceof Paciente);
        return this.elementos[0];
    }

    public Paciente desenfileira() {
        if (this.estaVazia()) {
            return null;
        }

        final int POS = 0;
        Paciente elementoASerRemovido = this.elementos[POS];
        this.remove(POS);

        return elementoASerRemovido;

    }

}
