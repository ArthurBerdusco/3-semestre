package com.senac.laboratoriosenac;

import java.util.Scanner;

public class Paciente {

    private String nome;
    private int idade;
    private boolean preferencial = false;

    public Paciente() {

        Scanner input = new Scanner(System.in);

        System.out.println("Nome do paciente: ");
        this.nome = input.next();

        int idade = -1;

        do {
            try {
                System.out.println("Idade do paciente: ");
                idade = input.nextInt();
                if (idade < 0 || idade > 120) {
                    System.out.println("Idade inválida, digite novamente");
                }
                this.idade = idade;
            } catch (Exception ex) {
                System.err.println("Idade inválida, digite apenas números inteiros");
                input.nextLine();
                idade = -1;
            }
        } while (idade < 0 || idade > 120);

        if (idade >= 65) {
            setPreferencial(true);
        }
    }

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        if (idade >= 65) {
            setPreferencial(true);
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

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean idoso) {
        this.preferencial = idoso;
    }

}
