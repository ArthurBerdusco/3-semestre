package br.com.senac.connectsenac;

import br.com.senac.connectsenac.model.Usuario;
import java.util.ArrayList;

public class Vertice<TIPO> {

    private TIPO usuario;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;

    public Vertice(TIPO usuario) {
        this.usuario = usuario;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return usuario;
    }

    public void setDado(TIPO usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }

    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
        this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<TIPO> aresta) {
        this.arestasSaida.add(aresta);
    }

    public void removerArestaSaida(Aresta<TIPO> aresta) {
        this.arestasSaida.remove(aresta);
    }

    public void removerArestaEntrada(Aresta<TIPO> aresta) {
        this.arestasEntrada.remove(aresta);
    }

    @Override
    public String toString() {
        Usuario user = (Usuario) this.usuario;
        return user.getNome();
    }
}
