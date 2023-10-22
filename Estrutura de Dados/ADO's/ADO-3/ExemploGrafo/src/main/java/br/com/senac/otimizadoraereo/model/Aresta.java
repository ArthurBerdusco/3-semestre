package br.com.senac.otimizadoraereo.model;

public class Aresta<TIPO> {

    private Double distancia;
    private Vertice<TIPO> verticeA;
    private Vertice<TIPO> verticeB;

    public Aresta(Double distancia, Vertice<TIPO> verticeA, Vertice<TIPO> verticeB) {
        this.distancia = distancia;
        this.verticeA = verticeA;
        this.verticeB = verticeB;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Vertice<TIPO> getVerticeA() {
        return verticeA;
    }

    public void setVerticeA(Vertice<TIPO> verticeA) {
        this.verticeA = verticeA;
    }

    public Vertice<TIPO> getVerticeB() {
        return verticeB;
    }

    public void setVerticeB(Vertice<TIPO> verticeB) {
        this.verticeB = verticeB;
    }



}
