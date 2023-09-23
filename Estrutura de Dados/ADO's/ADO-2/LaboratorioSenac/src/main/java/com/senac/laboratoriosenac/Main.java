package com.senac.laboratoriosenac;

public class Main {

    public static void main(String[] args) {

        Fila<Paciente> fila = new Fila();

        Paciente p1 = new Paciente("Arthur", 31);
        Paciente p2 = new Paciente("Maria", 70);

        fila.enfileira(p1);
        fila.enfileira(p2);

        var painel = new PainelLaboratorio();

        boolean labAberto = true;

        do {
            int escolha = painel.menuPrincipal();

            if (escolha == 1) {
                var paciente = new Paciente();
                fila.enfileira(paciente);
            }
            
            if (escolha == 2) {
                System.out.println(fila.toString());
            }
            
            if (escolha == 3) {
                fila.desenfileira();
            }
            
            if(escolha == 4){
                labAberto = false;
                
            }

        } while (labAberto);

    }
}
