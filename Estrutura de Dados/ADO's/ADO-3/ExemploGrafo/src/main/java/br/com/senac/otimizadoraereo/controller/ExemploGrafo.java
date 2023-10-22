package br.com.senac.otimizadoraereo.controller;

import br.com.senac.otimizadoraereo.model.Aeroporto;
import br.com.senac.otimizadoraereo.model.Grafo;

public class ExemploGrafo {

    public static void main(String[] args) {

        Grafo<Aeroporto> grafo = new Grafo<Aeroporto>();

        Aeroporto acre = new Aeroporto("Acre", 2000);
        Aeroporto alagoas = new Aeroporto("Alagoas", 2600);
        Aeroporto amazonas = new Aeroporto("Amazonas", 2400);
        Aeroporto amapa = new Aeroporto("Amapá", 2200);
        Aeroporto bahia = new Aeroporto("Bahia", 3000);
        Aeroporto ceara = new Aeroporto("Ceará", 3200);
        Aeroporto espiritoSanto = new Aeroporto("Espírito Santo", 2900);
        Aeroporto goias = new Aeroporto("Goiás", 2700);
        Aeroporto maranhao = new Aeroporto("Maranhão", 2800);
        Aeroporto matoGrosso = new Aeroporto("Mato Grosso", 2700);
        Aeroporto matoGrossoDoSul = new Aeroporto("Mato Grosso do Sul", 2700);
        Aeroporto minasGerais = new Aeroporto("Minas Gerais", 3500);
        Aeroporto para = new Aeroporto("Pará", 2500);
        Aeroporto parana = new Aeroporto("Paraná", 3100);
        Aeroporto pernambuco = new Aeroporto("Pernambuco", 2800);
        Aeroporto piaui = new Aeroporto("Piauí", 2400);
        Aeroporto rioDeJaneiro = new Aeroporto("Rio de Janeiro", 4000);
        Aeroporto rioGrandeDoNorte = new Aeroporto("Rio Grande do Norte", 2600);
        Aeroporto rioGrandeDoSul = new Aeroporto("Rio Grande do Sul", 3800);
        Aeroporto rondonia = new Aeroporto("Rondônia", 2500);
        Aeroporto roraima = new Aeroporto("Roraima", 2100);
        Aeroporto santaCatarina = new Aeroporto("Santa Catarina", 2600);
        Aeroporto saoPaulo = new Aeroporto("São Paulo", 5000);
        Aeroporto sergipe = new Aeroporto("Sergipe", 2300);
        Aeroporto tocantins = new Aeroporto("Tocantins", 2200);

        grafo.adicionarVertice(acre);
        grafo.adicionarVertice(alagoas);
        grafo.adicionarVertice(amapa);
        grafo.adicionarVertice(amazonas);
        grafo.adicionarVertice(bahia);
        grafo.adicionarVertice(ceara);
        grafo.adicionarVertice(espiritoSanto);
        grafo.adicionarVertice(goias);
        grafo.adicionarVertice(maranhao);
        grafo.adicionarVertice(matoGrosso);
        grafo.adicionarVertice(matoGrossoDoSul);
        grafo.adicionarVertice(minasGerais);
        grafo.adicionarVertice(para);
        grafo.adicionarVertice(parana);
        grafo.adicionarVertice(pernambuco);
        grafo.adicionarVertice(piaui);
        grafo.adicionarVertice(rioDeJaneiro);
        grafo.adicionarVertice(rioGrandeDoNorte);
        grafo.adicionarVertice(rioGrandeDoSul);
        grafo.adicionarVertice(rondonia);
        grafo.adicionarVertice(roraima);
        grafo.adicionarVertice(santaCatarina);
        grafo.adicionarVertice(saoPaulo);
        grafo.adicionarVertice(sergipe);
        grafo.adicionarVertice(tocantins);

        grafo.adicionarAresta(1017.6, saoPaulo, goias);
        grafo.adicionarAresta(902.4, goias, bahia);
        grafo.adicionarAresta(810.8, bahia, maranhao);
        grafo.adicionarAresta(1045.3, maranhao, tocantins);
        grafo.adicionarAresta(2615.6, tocantins, amazonas);
        grafo.adicionarAresta(2764.5, tocantins, acre);
        grafo.adicionarAresta(1540.2, saoPaulo, acre);
        grafo.adicionarAresta(1458.3, saoPaulo, tocantins);

        grafo.buscaEmLargura();
        
        grafo.encontrarMelhorRota(saoPaulo, maranhao);
    }
}
