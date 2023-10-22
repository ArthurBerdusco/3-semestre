package br.com.senac.otimizadoraereo.model;

public class Aresta {

    private Double distancia;
    private Vertice origem;
    private Vertice destino;

    public Aresta(Double distancia, Vertice origem, Vertice destino) {
        this.distancia = distancia;
        this.origem = origem;
        this.destino = destino;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }



}
