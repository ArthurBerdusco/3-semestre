package com.senac.laboratoriosenac;
import com.senac.laboratoriosenac.Paciente;

public class Fila<T> extends EstruturaEstatica {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(Paciente p) {
        super.adiciona(p);    
    }

    public Paciente espiar() {
        if (this.estaVazia()) {
            return null;
        }
        
        return this.elementos[0];
    }

    public Paciente desenfileira() {
        if (this.estaVazia()) {
            return null;
        }

        final int POS = 0;
        Paciente elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        
        if(elementoASerRemovido.isPreferencial()){
            this.preferenciais-=1;
        }

        return elementoASerRemovido;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            sb.append('[');
            sb.append("Nome="+this.elementos[i].getNome());
            sb.append(", ");
            sb.append("Idade="+this.elementos[i].getIdade());
            sb.append(", ");
            sb.append("Preferencial="+this.elementos[i].isPreferencial());
            sb.append(']');
            sb.append(", \n");
        }

        return sb.toString();
    }
    
}
