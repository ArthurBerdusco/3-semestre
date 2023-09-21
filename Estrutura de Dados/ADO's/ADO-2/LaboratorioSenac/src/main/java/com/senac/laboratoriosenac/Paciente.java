package com.senac.laboratoriosenac;

public class Paciente {

    private String nome;
    private int idade;
    private boolean idoso = false;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        
        if(idade >= 65){
            setIdoso(true);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isIdoso() {
        return idoso;
    }

    public void setIdoso(boolean idoso) {
        this.idoso = idoso;
    }

}
