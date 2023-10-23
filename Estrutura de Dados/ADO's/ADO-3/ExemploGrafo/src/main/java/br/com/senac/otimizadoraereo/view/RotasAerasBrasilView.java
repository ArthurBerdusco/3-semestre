package br.com.senac.otimizadoraereo.view;

import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RotasAerasBrasilView extends javax.swing.JFrame {

    public RotasAerasBrasilView(List<String[]> rotas) {
        initComponents();
        // Inicialize o mapa de coordenadas dos estados (adapte isso ao seu layout)
        Map<String, Point> coordenadasEstados = new HashMap<>();
        coordenadasEstados.put("Amazonas", new Point(180, 190));
        coordenadasEstados.put("São Paulo", new Point(420, 460));
        coordenadasEstados.put("Rio de Janeiro", new Point(500, 470));
        coordenadasEstados.put("Minas Gerais", new Point(500, 400));

        // Itere pelas rotas e desenhe as conexões
        for (String[] rota : rotas) {
            String origem = rota[0];

            if (coordenadasEstados.containsKey(origem)) {
                Point pontoOrigem = coordenadasEstados.get(origem);

                for (String[] rota2 : rotas) {
                    String destino = rota2[1]; // Obtenha o destino da rota2

                    if (coordenadasEstados.containsKey(destino)) {
                        Point pontoDestino = coordenadasEstados.get(destino);
                        desenharRota(pontoOrigem, pontoDestino);
                    }
                }
            }
        }

        Point pontoTesteOrigem = new Point(100, 100);
        Point pontoTesteDestino = new Point(300, 300);
        desenharRota(pontoTesteOrigem, pontoTesteDestino);
    }

    public RotasAerasBrasilView() {
        initComponents();
    }

    public void desenharRota(Point origem, Point destino) {
        Graphics g = jPanel1.getGraphics();
        g.drawLine(origem.x, origem.y, destino.x, destino.y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgEstados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtAmazonas = new javax.swing.JRadioButton();
        rbtSaoPaulo = new javax.swing.JRadioButton();
        rbtRioDeJaneiro = new javax.swing.JRadioButton();
        rbtMinasGerais = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtAmazonas.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtAmazonas);
        rbtAmazonas.setForeground(new java.awt.Color(0, 0, 0));
        rbtAmazonas.setText("Amazonas");
        jPanel1.add(rbtAmazonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        rbtSaoPaulo.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtSaoPaulo);
        rbtSaoPaulo.setForeground(new java.awt.Color(0, 0, 0));
        rbtSaoPaulo.setText("São Paulo");
        jPanel1.add(rbtSaoPaulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        rbtRioDeJaneiro.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtRioDeJaneiro);
        rbtRioDeJaneiro.setForeground(new java.awt.Color(0, 0, 0));
        rbtRioDeJaneiro.setText("Rio de Janeiro");
        jPanel1.add(rbtRioDeJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        rbtMinasGerais.setBackground(new java.awt.Color(255, 255, 255));
        btgEstados.add(rbtMinasGerais);
        rbtMinasGerais.setForeground(new java.awt.Color(0, 0, 0));
        rbtMinasGerais.setText("Minas Gerais");
        rbtMinasGerais.setBorder(null);
        jPanel1.add(rbtMinasGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaBrasil.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlPrincipalMouspnlPrincipal1eClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtAmazonas;
    private javax.swing.JRadioButton rbtMinasGerais;
    private javax.swing.JRadioButton rbtRioDeJaneiro;
    private javax.swing.JRadioButton rbtSaoPaulo;
    // End of variables declaration//GEN-END:variables
}
