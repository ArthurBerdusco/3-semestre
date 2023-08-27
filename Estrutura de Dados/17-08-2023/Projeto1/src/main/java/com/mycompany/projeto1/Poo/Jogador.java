package com.mycompany.projeto1.Poo;

/**
 *
 * @author arthur
 */
public class Jogador {

    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado;

    public Jogador() {
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEnvenedado() {
        return envenenado;
    }

    public void receberDano(int pontos) {
        hp -= pontos;
    }

    public void receberCura(int pontos) {
        hp += pontos;
    }

    public void ganharExperiencia(int pontos) {
        xp += pontos;
    }

    public void receberAntidoto() {
        envenenado = false;
    }
}
