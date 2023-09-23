package com.senac.laboratoriosenac;

import java.util.Scanner;

public class PainelLaboratorio {

    public int menuPrincipal() {
        System.out.println("\n\nPainel de controle Laboratório Senac de coleta de Sangue\n");

        System.out.println("Escolha: ");
        System.out.println("[ 1 ] Adicionar na fila");
        System.out.println("[ 2 ] Ver fila");
        System.out.println("[ 3 ] Remover da fila");
        System.out.println("[ 4 ] Fechar laboratório");

        int escolha = 0;

        do {

            try {
                escolha = new Scanner(System.in).nextInt();

                if (escolha > 4) {
                    System.out.println("Opção inválida, escolha novamente");
                }

            } catch (Exception ex) {
                System.err.println("Digite apenas números inteiros!");
            }

        } while (escolha < 0 || escolha > 4);

        return escolha;
    }
}
