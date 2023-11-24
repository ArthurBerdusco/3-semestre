package br.com.senac.exemplografo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Grafo<TIPO> {

    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo(ArrayList<Vertice<TIPO>> vertices, ArrayList<Aresta<TIPO>> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

    public Grafo() {
        vertices = new ArrayList<Vertice<TIPO>>();
        arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(int peso, TIPO dadoInicio, TIPO dadoFim) {
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);

        Aresta<TIPO> arestaDirecional = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(arestaDirecional);
        fim.adicionarArestaEntrada(arestaDirecional);

        Aresta<TIPO> arestaOposta = new Aresta<TIPO>(peso, fim, inicio);
        fim.adicionarArestaSaida(arestaOposta);
        inicio.adicionarArestaEntrada(arestaOposta);

        this.arestas.add(arestaDirecional);
        this.arestas.add(arestaOposta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    //Metodos de busca
    public void buscaEmLargura(TIPO dado) {
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.getVertice(dado);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Vertice<TIPO> visitado = fila.get(0);
            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }

    public void encontrarMelhoresCaminhos(TIPO inicio, TIPO fim) {

        Vertice<TIPO> verticeInicio = this.getVertice(inicio);
        Vertice<TIPO> verticeFim = this.getVertice(fim);

        List<List<Aresta<TIPO>>> todosCaminhos = new ArrayList<>();

        Queue<List<Aresta<TIPO>>> fila = new LinkedList<>();

        Set<Vertice<TIPO>> visitados = new HashSet<>();

        List<Aresta<TIPO>> caminhoInicial = new ArrayList<>();
        fila.add(caminhoInicial);

        while (!fila.isEmpty()) {
            List<Aresta<TIPO>> caminhoAtual = fila.poll();
            Aresta<TIPO> arestaAtual = caminhoAtual.isEmpty() ? null : caminhoAtual.get(caminhoAtual.size() - 1);

            Vertice<TIPO> verticeAtual = (arestaAtual == null) ? verticeInicio : arestaAtual.getFim();

            if (verticeAtual.equals(verticeFim)) {
                todosCaminhos.add(caminhoAtual);
                continue;
            }

            if (!visitados.contains(verticeAtual)) {
                visitados.add(verticeAtual);

                for (Aresta<TIPO> aresta : verticeAtual.getArestasSaida()) {
                    Vertice<TIPO> vizinho = aresta.getFim();

                    if (!visitados.contains(vizinho)) {
                        List<Aresta<TIPO>> novoCaminho = new ArrayList<>(caminhoAtual);
                        novoCaminho.add(aresta);
                        fila.add(novoCaminho);
                    }
                }
            }
        }

        // Imprimir todos os caminhos encontrados
        int caminhos = 1;
        for (List<Aresta<TIPO>> caminho : todosCaminhos) {

            System.out.print("[Caminho=" + caminhos + " ---> ");
            imprimirCaminho(caminho);
            System.out.print("]\n");
            caminhos++;
        }
    }

    private void imprimirCaminho(List<Aresta<TIPO>> caminho) {
        StringBuilder resultado = new StringBuilder();
        int distanciaTotal = 0;

        for (Aresta<TIPO> aresta : caminho) {

            resultado.append(aresta.getInicio().getDado())
                    .append(" - ")
                    .append(aresta.getFim().getDado())
                    .append(" ")
                    .append(aresta.getPeso())
                    .append(" metros, ");

            distanciaTotal += aresta.getPeso();
        }

        if (resultado.length() > 0) {
            resultado.delete(resultado.length() - 2, resultado.length());
        }

        System.out.print(resultado.toString() + " - Distância Total: " + distanciaTotal + " metros");
    }

}
