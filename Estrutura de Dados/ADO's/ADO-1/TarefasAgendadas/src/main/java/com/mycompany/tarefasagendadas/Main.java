package com.mycompany.tarefasagendadas;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            // Define o Look and Feel para Nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Cria a instância da TelaPrincipal
       
            TelaPrincipal sistema = new TelaPrincipal();
            sistema.setVisible(true);
      
    }
}
