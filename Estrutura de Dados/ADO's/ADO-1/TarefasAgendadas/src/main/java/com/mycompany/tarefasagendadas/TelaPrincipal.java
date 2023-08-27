package com.mycompany.tarefasagendadas;

import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    ListaTarefas tarefas = new ListaTarefas();

    public TelaPrincipal() {
        initComponents();
    }

    public void fecharTarefa(JPanel janela, Tarefa tarefa) throws Exception {

        if (tarefa.getId() == 0) {
            tarefa.setId(this.tarefas.getTamanho() + 1);
            tarefas.adicionar(tarefa);

        } else {
            tarefas.editarTarefa(tarefa);
        }
        atualizarTabelaTarefas();
        tabPainel.remove(janela);
    }

    public void fecharTarefa(JPanel janela) {
        tabPainel.remove(janela);
    }

    public void atualizarTabelaTarefas() {
        DefaultTableModel modelo = (DefaultTableModel) tblTarefas.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < tarefas.getTamanho(); i++) {
            tarefas.getTarefas()[i].atualizarStatus();
            modelo.addRow(new Object[]{
                tarefas.getTarefas()[i].getId(),
                tarefas.getTarefas()[i].getTitulo(),
                tarefas.getTarefas()[i].getData(),
                tarefas.getTarefas()[i].getHoraInicio(),
                tarefas.getTarefas()[i].getHoraFim(),
                tarefas.getTarefas()[i].getStatus(),
            });
            

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabPainel = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarefas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnVerTarefa = new javax.swing.JButton();
        btnVerTarefa1 = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        iconSenac = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Tarefas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(16, 16, 16));

        tabPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblTarefas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Dia", "Hora Ínicio", "Hora Fim", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTarefas.setRowHeight(30);
        tblTarefas.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblTarefas.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblTarefas.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblTarefas.getColumnModel().getColumn(3).setPreferredWidth(40);
        tblTarefas.getColumnModel().getColumn(4).setPreferredWidth(40);
        jScrollPane1.setViewportView(tblTarefas);

        tabPainel.addTab("Agenda", jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVerTarefa.setBackground(new java.awt.Color(51, 102, 255));
        btnVerTarefa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVerTarefa.setText("Consultar");
        btnVerTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTarefaActionPerformed(evt);
            }
        });

        btnVerTarefa1.setBackground(new java.awt.Color(51, 102, 255));
        btnVerTarefa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVerTarefa1.setText("Deletar");
        btnVerTarefa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTarefa1ActionPerformed(evt);
            }
        });

        btnAgendar.setBackground(new java.awt.Color(51, 102, 255));
        btnAgendar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAgendar.setText("Adicionar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        iconSenac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senac2.png"))); // NOI18N

        jLabel1.setText("Desenvolvido por:");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setText("Arthur Silva Berdusco");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(iconSenac)
                            .addComponent(btnAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(btnVerTarefa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iconSenac)
                .addGap(40, 40, 40)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVerTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVerTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed

        if (tabPainel.getTabCount() > 5) {
            JOptionPane.showMessageDialog(this, "Você está com muitas abas em andamento, finalize uma para abrir outra.");
            return;
        }

        PainelTarefa painelTarefa = new PainelTarefa(this);
        tabPainel.addTab("Nova Tarefa", painelTarefa);
        tabPainel.setSelectedComponent(painelTarefa);
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnVerTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTarefaActionPerformed

        if (tblTarefas.getSelectedRow() != -1) {

            if (tabPainel.getTabCount() > 5) {
                JOptionPane.showMessageDialog(this, "Você está com muitas abas em andamento, finalize uma para abrir outra.");
                return;
            }

            String idTarefa = String.valueOf(tblTarefas.getValueAt(tblTarefas.getSelectedRow(), 0));
            int idSelecionado = Integer.parseInt(idTarefa);
            for (int i = 0; i < tarefas.getTamanho(); i++) {

                if (tarefas.getTarefas()[i].getId() == idSelecionado) {
                    PainelTarefa painelTarefa = new PainelTarefa(this, tarefas.getTarefas()[i]);
                    tabPainel.addTab("Tarefa: " + tarefas.getTarefas()[i].getId(), painelTarefa);
                    tabPainel.setSelectedComponent(painelTarefa);
                    tblTarefas.clearSelection();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa.");
        }
    }//GEN-LAST:event_btnVerTarefaActionPerformed

    private void btnVerTarefa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTarefa1ActionPerformed
        
        int id = Integer.parseInt(tblTarefas.getValueAt(tblTarefas.getSelectedRow(), 0).toString());
        
        for(int i = 0; i< tarefas.getTamanho(); i++){
            if(tarefas.getTarefas()[i].getId() == id){
                try {
                    tarefas.remover(i);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Não foi possível remover tarefa");
                }
            }
        }
        
        atualizarTabelaTarefas();
    }//GEN-LAST:event_btnVerTarefa1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnVerTarefa;
    private javax.swing.JButton btnVerTarefa1;
    private javax.swing.JLabel iconSenac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabPainel;
    private javax.swing.JTable tblTarefas;
    // End of variables declaration//GEN-END:variables
}
