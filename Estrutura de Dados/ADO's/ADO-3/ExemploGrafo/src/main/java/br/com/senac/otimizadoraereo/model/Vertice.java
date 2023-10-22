package br.com.senac.otimizadoraereo.model;

import java.util.ArrayList;

public class Vertice {
    
    private Aeroporto aeroporto;
    private ArrayList<Aresta> arestas;

    public Vertice(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
        this.arestas = new ArrayList<Aresta>();
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }

    public void adicionarAresta(Aresta aresta){
        this.arestas.add(aresta);
    }
    
}
