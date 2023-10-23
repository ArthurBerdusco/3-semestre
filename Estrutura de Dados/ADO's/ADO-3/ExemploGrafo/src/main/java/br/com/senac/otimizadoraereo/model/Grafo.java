package br.com.senac.otimizadoraereo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Grafo {

    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public Grafo(ArrayList<Vertice> vertices, ArrayList<Aresta> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

    public Grafo() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    public void adicionarVertice(Aeroporto dado) {
        Vertice novoVertice = new Vertice(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double distancia, Aeroporto origem, Aeroporto destino) {
        Vertice aeroportoA = this.getVertice(origem);
        Vertice aeroportoB = this.getVertice(destino);

        Aresta arestaAB = new Aresta(distancia, aeroportoA, aeroportoB);
        Aresta arestaBA = new Aresta(distancia, aeroportoB, aeroportoA);

        aeroportoA.adicionarAresta(arestaAB);
        aeroportoB.adicionarAresta(arestaAB);

        aeroportoA.adicionarAresta(arestaBA);
        aeroportoB.adicionarAresta(arestaBA);

        this.arestas.add(arestaAB);
        this.arestas.add(arestaBA);
    }

    public Vertice getVertice(Aeroporto dado) {
        for (Vertice vertice : vertices) {
            if (vertice.getAeroporto().equals(dado)) {
                return vertice;
            }
        }
        return null;
    }

    //Metodos de busca
    public void buscaEmLargura(Aeroporto inicio) {
        Set<Vertice> visitados = new HashSet<>();
        Queue<Vertice> fila = new LinkedList<>();

        Vertice verticeInicio = this.getVertice(inicio);
        visitados.add(verticeInicio);
        System.out.println(verticeInicio.getAeroporto().getNome());
        fila.offer(verticeInicio);

        while (!fila.isEmpty()) {
            Vertice visitado = fila.poll();

            for (Aresta aresta : visitado.getArestas()) {
                Vertice outroVertice;

                if (aresta.getOrigem() == visitado) {
                    outroVertice = aresta.getDestino();
                } else {
                    outroVertice = aresta.getOrigem();
                }

                if (!visitados.contains(outroVertice)) {
                    visitados.add(outroVertice);
                    System.out.println(outroVertice.getAeroporto().getNome());
                    fila.offer(outroVertice);
                }
            }
        }
    }

    public ArrayList<Aresta> encontrarMelhorRotaData(String origem, String destino) {
        Map<String, Double> distancias = new HashMap<>();
        Map<String, Aresta> rotasUtilizadas = new HashMap<>();
        Set<String> visitados = new HashSet<>();

        for (Vertice vertice : vertices) {
            distancias.put(vertice.getAeroporto().getNome(), Double.POSITIVE_INFINITY);
        }
        distancias.put(origem, 0.0);

        while (!visitados.contains(destino)) {
            String aeroportoAtual = encontrarMenorDistanciaNaoVisitado(distancias, visitados);
            visitados.add(aeroportoAtual);

            for (Aresta rota : arestas) {
                if (rota.getOrigem().getAeroporto().getNome().equals(aeroportoAtual)) {
                    Aeroporto aeroportoDestino = rota.getDestino().getAeroporto();
                    Double distanciaAtual = distancias.get(aeroportoAtual);
                    Double distanciaVizinho = distanciaAtual + rota.getDistancia();
                    if (distanciaVizinho < distancias.get(aeroportoDestino.getNome())) {
                        distancias.put(aeroportoDestino.getNome(), distanciaVizinho);
                        rotasUtilizadas.put(aeroportoDestino.getNome(), rota);
                    }
                }
            }
        }

        // Exibir a rota utilizada para chegar ao destino (de cima para baixo)
        String aeroporto = destino;
        ArrayList<Aresta> routeData = new ArrayList<Aresta>();
        while (!aeroporto.equals(origem)) {
            Aresta rota = rotasUtilizadas.get(aeroporto);
            routeData.add(rota);
            aeroporto = rota.getOrigem().getAeroporto().getNome();
        }
        
        Collections.reverse(routeData);

        System.out.println("Dados da Rota:");
        for (Aresta data : routeData) {
            System.out.println("Origem: " + data.getOrigem().getAeroporto().getNome() + ", Destino: " + data.getDestino().getAeroporto().getNome() + ", Distância: " + data.getDistancia());
        }

        

        return routeData;
    }

    private String encontrarMenorDistanciaNaoVisitado(Map<String, Double> distancias, Set<String> visitados) {
        String aeroportoMenorDistancia = null;
        Double menorDistancia = Double.POSITIVE_INFINITY;

        for (String aeroporto : distancias.keySet()) {
            if (!visitados.contains(aeroporto) && distancias.get(aeroporto) < menorDistancia) {
                aeroportoMenorDistancia = aeroporto;
                menorDistancia = distancias.get(aeroporto);
            }
        }

        return aeroportoMenorDistancia;
    }

}
