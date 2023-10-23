package br.com.senac.otimizadoraereo.view;

import br.com.senac.otimizadoraereo.model.Grafo;
import java.awt.Graphics;
import java.awt.Point;


public class RotasAerasBrasilView extends javax.swing.JFrame {

    public RotasAerasBrasilView() {
        initComponents();
    }
    
    public void desenharRota(Point origem, Point destino){
        Graphics g = pnlPrincipal.getGraphics();
        g.drawLine(origem.x,origem.y,destino.x, destino.y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgEstados = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        rbtAmazonas = new javax.swing.JRadioButton();
        rbtSaoPaulo = new javax.swing.JRadioButton();
        rbtRioDeJaneiro = new javax.swing.JRadioButton();
        rbtMinasGerais = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);

        pnlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPrincipalMouseClicked(evt);
            }
        });
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtAmazonas.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtAmazonas);
        rbtAmazonas.setForeground(new java.awt.Color(0, 0, 0));
        rbtAmazonas.setText("Amazonas");
        pnlPrincipal.add(rbtAmazonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        rbtSaoPaulo.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtSaoPaulo);
        rbtSaoPaulo.setForeground(new java.awt.Color(0, 0, 0));
        rbtSaoPaulo.setText("São Paulo");
        pnlPrincipal.add(rbtSaoPaulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        rbtRioDeJaneiro.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtRioDeJaneiro);
        rbtRioDeJaneiro.setForeground(new java.awt.Color(0, 0, 0));
        rbtRioDeJaneiro.setText("Rio de Janeiro");
        pnlPrincipal.add(rbtRioDeJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        rbtMinasGerais.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtMinasGerais);
        rbtMinasGerais.setForeground(new java.awt.Color(0, 0, 0));
        rbtMinasGerais.setText("Minas Gerais");
        rbtMinasGerais.setBorder(null);
        pnlPrincipal.add(rbtMinasGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaBrasil.jpg"))); // NOI18N
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMouseClicked
        
    }//GEN-LAST:event_pnlPrincipalMouseClicked

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
    private javax.swing.ButtonGroup btgEstados;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JRadioButton rbtAmazonas;
    private javax.swing.JRadioButton rbtMinasGerais;
    private javax.swing.JRadioButton rbtRioDeJaneiro;
    private javax.swing.JRadioButton rbtSaoPaulo;
    // End of variables declaration//GEN-END:variables
}
