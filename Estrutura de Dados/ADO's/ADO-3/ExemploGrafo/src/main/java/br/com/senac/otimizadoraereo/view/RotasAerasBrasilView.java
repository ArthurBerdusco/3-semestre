package br.com.senac.otimizadoraereo.view;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.SwingUtilities;

public class RotasAerasBrasilView extends javax.swing.JFrame {

    private Point amazonasCoordenadas;
    private Point saoPauloCoordenadas;

    public RotasAerasBrasilView() {
        initComponents();

        amazonasCoordenadas = new Point(180, 190);
        saoPauloCoordenadas = new Point(420, 460);
    }

    private void desenharLinha(Point startPoint, Point endPoint) {
        Graphics g = jLabel2.getGraphics();
        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        rbtAmazonas = new javax.swing.JRadioButton();
        rbtSaoPaulo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaBrasil.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        rbtAmazonas.setForeground(new java.awt.Color(255, 255, 255));
        rbtAmazonas.setText("Amazonas");
        rbtAmazonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtAmazonasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtAmazonasMousePressed(evt);
            }
        });
        rbtAmazonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAmazonasActionPerformed(evt);
            }
        });
        getContentPane().add(rbtAmazonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        rbtSaoPaulo.setForeground(new java.awt.Color(255, 255, 255));
        rbtSaoPaulo.setText("São Paulo");
        rbtSaoPaulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtSaoPauloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtSaoPauloMousePressed(evt);
            }
        });
        getContentPane().add(rbtSaoPaulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtAmazonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAmazonasActionPerformed


    }//GEN-LAST:event_rbtAmazonasActionPerformed

    private void rbtAmazonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtAmazonasMousePressed


    }//GEN-LAST:event_rbtAmazonasMousePressed

    private void rbtSaoPauloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtSaoPauloMousePressed

    }//GEN-LAST:event_rbtSaoPauloMousePressed

    private void rbtSaoPauloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtSaoPauloMouseClicked
        if (rbtSaoPaulo.isSelected() && rbtAmazonas.isSelected()) {
            rbtAmazonas.setEnabled(false); // Desabilitar o outro botão enquanto desenha a linha
            // Desenhe a linha de São Paulo para Amazonas
            desenharLinha(saoPauloCoordenadas, amazonasCoordenadas);
        } else {
            rbtAmazonas.setEnabled(true); // Habilitar o outro botão de novo
            repaint();
        }
    }//GEN-LAST:event_rbtSaoPauloMouseClicked

    private void rbtAmazonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtAmazonasMouseClicked
        if (rbtAmazonas.isSelected() && rbtSaoPaulo.isSelected()) {
            rbtSaoPaulo.setEnabled(false); // Desabilitar o outro botão enquanto desenha a linha
            // Desenhe a linha de Amazonas para São Paulo
            desenharLinha(amazonasCoordenadas, saoPauloCoordenadas);
        } else {
            rbtSaoPaulo.setEnabled(true); // Habilitar o outro botão de novo
            repaint();
        }
    }//GEN-LAST:event_rbtAmazonasMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RotasAerasBrasilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RotasAerasBrasilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RotasAerasBrasilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RotasAerasBrasilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RotasAerasBrasilView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbtAmazonas;
    private javax.swing.JRadioButton rbtSaoPaulo;
    // End of variables declaration//GEN-END:variables
}
