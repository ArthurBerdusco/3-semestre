package br.com.senac.otimizadoraereo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Grafo<Aeroporto> {

    private ArrayList<Vertice<Aeroporto>> vertices;
    private ArrayList<Aresta<Aeroporto>> arestas;

    public Grafo(ArrayList<Vertice<Aeroporto>> vertices, ArrayList<Aresta<Aeroporto>> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

    public Grafo() {
        vertices = new ArrayList<Vertice<Aeroporto>>();
        arestas = new ArrayList<Aresta<Aeroporto>>();
    }

    public void adicionarVertice(Aeroporto dado) {
        Vertice<Aeroporto> novoVertice = new Vertice<Aeroporto>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double distancia, Aeroporto A, Aeroporto B) {
        Vertice<Aeroporto> aeroportoA = this.getVertice(A);
        Vertice<Aeroporto> aeroportoB = this.getVertice(B);

        Aresta<Aeroporto> aresta = new Aresta<Aeroporto>(distancia, aeroportoA, aeroportoB);

        aeroportoA.adicionarAresta(aresta);
        aeroportoB.adicionarAresta(aresta);

        this.arestas.add(aresta);
    }

    public Vertice<Aeroporto> getVertice(Aeroporto dado) {
        for (Vertice<Aeroporto> vertice : vertices) {
            if (vertice.getAeroporto().equals(dado)) {
                return vertice;
            }
        }
        return null;
    }

    //Metodos de busca
    public void buscaEmLargura() {
        ArrayList<Vertice<Aeroporto>> marcados = new ArrayList<Vertice<Aeroporto>>();
        Queue<Vertice<Aeroporto>> fila = new LinkedList<Vertice<Aeroporto>>();

        Vertice<Aeroporto> inicio = this.vertices.get(4);
        marcados.add(inicio);
        System.out.println(inicio.getAeroporto());
        
        
        fila.offer(inicio);

        while (!fila.isEmpty()) {
            Vertice<Aeroporto> visitado = fila.poll();

            for (Aresta<Aeroporto> aresta : visitado.getArestas()) {
                Vertice<Aeroporto> outroVertice;

                if (aresta.getVerticeA() == visitado) {
                    outroVertice = aresta.getVerticeB();
                } else {
                    outroVertice = aresta.getVerticeA();
                }

                if (!marcados.contains(outroVertice)) {
                    marcados.add(outroVertice);
                    System.out.println(outroVertice.getAeroporto());
                    fila.offer(outroVertice);
                }
            }
        }
    }

    public void encontrarMelhorRota(Aeroporto origem, Aeroporto destino) {
        Vertice<Aeroporto> origemVertice = getVertice(origem);
        Vertice<Aeroporto> destinoVertice = getVertice(destino);

        if (origemVertice == null || destinoVertice == null) {
            System.out.println("Origem ou destino não encontrado.");
            return;
        }

        Queue<Vertice<Aeroporto>> fila = new LinkedList<>();
        fila.offer(origemVertice);

        // Utilize um mapa para rastrear o caminho da origem até o destino
        HashMap<Vertice<Aeroporto>, Vertice<Aeroporto>> caminho = new HashMap<>();
        caminho.put(origemVertice, null);

        boolean encontrado = false;

        while (!fila.isEmpty() && !encontrado) {
            Vertice<Aeroporto> visitado = fila.poll();

            if (visitado.equals(destinoVertice)) {
                // Encontrou o destino, imprime o caminho
                imprimirCaminho(origemVertice, destinoVertice, caminho);
                encontrado = true;
                continue;
            }

            for (Aresta<Aeroporto> aresta : visitado.getArestas()) {
                Vertice<Aeroporto> outroVertice;

                if (aresta.getVerticeA() == visitado) {
                    outroVertice = aresta.getVerticeB();
                } else {
                    outroVertice = aresta.getVerticeA();
                }

                if (!caminho.containsKey(outroVertice)) {
                    fila.offer(outroVertice);
                    caminho.put(outroVertice, visitado);
                }
            }
        }

        if (!encontrado) {
            System.out.println("Rota não encontrada entre " + origem + " e " + destino);
        }
    }

    private void imprimirCaminho(Vertice<Aeroporto> origem, Vertice<Aeroporto> destino, HashMap<Vertice<Aeroporto>, Vertice<Aeroporto>> caminho) {
        ArrayList<Aeroporto> rota = new ArrayList<>();
        Vertice<Aeroporto> atual = destino;

        while (atual != null) {
            rota.add(atual.getAeroporto());
            atual = caminho.get(atual);
        }

        Collections.reverse(rota);

        System.out.println("Melhor rota de " + origem.getAeroporto() + " para " + destino.getAeroporto() + ":");
        for (Aeroporto aeroporto : rota) {
            System.out.println(aeroporto);
        }
    }

}
