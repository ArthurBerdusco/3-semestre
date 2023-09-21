package com.senac.laboratoriosenac;
import com.senac.laboratoriosenac.Paciente;

public class Fila extends EstruturaEstatica {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(Paciente p) {
        
        if(p.isIdoso()){
            System.out.println("Sou idoso");
            super.adiciona(0,p);
        }
        
        System.out.println("Não sou idoso");
        
        super.adiciona(p);    
    }

    public void enfileiraPreferencial(Paciente elemento) {
        super.adiciona(0, elemento);
    }

    public Paciente espiar() {
        if (this.estaVazia()) {
            return null;
        }
        
        return (Paciente) this.elementos[0];
    }

    public Paciente desenfileira() {
        if (this.estaVazia()) {
            return null;
        }

        final int POS = 0;
        Paciente elementoASerRemovido = (Paciente) this.elementos[POS];
        this.remove(POS);

        return elementoASerRemovido;

    }

}
