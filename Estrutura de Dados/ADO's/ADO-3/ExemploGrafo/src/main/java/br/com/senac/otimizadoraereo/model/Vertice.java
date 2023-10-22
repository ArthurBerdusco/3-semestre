package br.com.senac.otimizadoraereo.model;

import java.util.ArrayList;

public class Vertice<Aeroporto> {
    
    private Aeroporto aeroporto;
    private ArrayList<Aresta<Aeroporto>> arestas;

    public Vertice(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
        this.arestas = new ArrayList<Aresta<Aeroporto>>();
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public ArrayList<Aresta<Aeroporto>> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta<Aeroporto>> arestas) {
        this.arestas = arestas;
    }

    public void adicionarAresta(Aresta<Aeroporto> aresta){
        this.arestas.add(aresta);
    }
    
}
