package br.com.senac.connectsenac;

import java.util.ArrayList;

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

    public void adicionarAresta(Double peso, TIPO usuario, TIPO amigo) {
        Vertice<TIPO> inicio = this.getVertice(usuario);
        Vertice<TIPO> fim = this.getVertice(amigo);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public void removerAresta(TIPO usuario, TIPO amigo) {
        Vertice<TIPO> inicio = this.getVertice(usuario);
        Vertice<TIPO> fim = this.getVertice(amigo);

        if (inicio == null || fim == null) {
            // Verifica se os vértices existem no grafo
            System.out.println("Vértices não encontrados. Não é possível remover a aresta.");
            return;
        }

        Aresta<TIPO> arestaParaRemover = null;

        for (Aresta<TIPO> aresta : this.arestas) {
            if (aresta.getInicio() == inicio && aresta.getFim() == fim) {
                arestaParaRemover = aresta;
                break;
            }
        }

        if (arestaParaRemover != null) {
            inicio.removerArestaSaida(arestaParaRemover);
            fim.removerArestaEntrada(arestaParaRemover);
            this.arestas.remove(arestaParaRemover);
            System.out.println("Aresta removida com sucesso.");
        } else {
            System.out.println("Aresta não encontrada. Nenhuma ação realizada.");
        }
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

    public Vertice<TIPO> getVertice(String dado) {
        if(dado.equals("")){
            return null;
        }
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            
            if (this.vertices.get(i).getDado().toString().toLowerCase().contains(dado.toLowerCase())) {
                return vertices.get(i);
            }
        }
        return vertice;
    }

    
    public ArrayList<Vertice<TIPO>> buscaEmLargura(String usuario) {
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = getVertice(usuario);
        marcados.add(atual);
        fila.add(atual);
        ArrayList<Vertice<TIPO>> resultado = new ArrayList<Vertice<TIPO>>(); 

        while (fila.size() > 0) {
            Vertice<TIPO> visitado = fila.get(0);
            resultado.add(visitado);
            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
        return resultado; 
    }

    public void buscarAmigos(TIPO usuario) {

        Vertice<TIPO> verticeUsuario = getVertice(usuario);

        if (verticeUsuario == null) {
            return;
        }

        for (Aresta<TIPO> aresta : verticeUsuario.getArestasSaida()) {
            System.out.println(aresta.getFim().toString());
        }
    }

    public ArrayList<Vertice<TIPO>> getVertices() {
        return vertices;
    }

}
