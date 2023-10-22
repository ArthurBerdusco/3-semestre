package br.com.senac.otimizadoraereo.view;

import br.com.senac.otimizadoraereo.model.Aeroporto;
import br.com.senac.otimizadoraereo.model.Aresta;
import br.com.senac.otimizadoraereo.model.Grafo;
import br.com.senac.otimizadoraereo.model.Vertice;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class OtimizadorAereo extends javax.swing.JFrame {

    ArrayList<Aresta> rotas;
    ArrayList<Vertice> vertices;
    Grafo grafo = new Grafo();
    
    public void carregarDados(){
        Aeroporto acre = new Aeroporto("Acre", 2000);
        Aeroporto alagoas = new Aeroporto("Alagoas", 2600);
        Aeroporto amazonas = new Aeroporto("Amazonas", 2400);
        Aeroporto amapa = new Aeroporto("Amapá", 2200);
        Aeroporto bahia = new Aeroporto("Bahia", 3000);
        Aeroporto ceara = new Aeroporto("Ceará", 3200);
        Aeroporto espiritoSanto = new Aeroporto("Espírito Santo", 2900);
        Aeroporto goias = new Aeroporto("Goiás", 2700);
        Aeroporto maranhao = new Aeroporto("Maranhão", 2800);
        Aeroporto matoGrosso = new Aeroporto("Mato Grosso", 2700);
        Aeroporto matoGrossoDoSul = new Aeroporto("Mato Grosso do Sul", 2700);
        Aeroporto minasGerais = new Aeroporto("Minas Gerais", 3500);
        Aeroporto para = new Aeroporto("Pará", 2500);
        Aeroporto parana = new Aeroporto("Paraná", 3100);
        Aeroporto pernambuco = new Aeroporto("Pernambuco", 2800);
        Aeroporto piaui = new Aeroporto("Piauí", 2400);
        Aeroporto rioDeJaneiro = new Aeroporto("Rio de Janeiro", 4000);
        Aeroporto rioGrandeDoNorte = new Aeroporto("Rio Grande do Norte", 2600);
        Aeroporto rioGrandeDoSul = new Aeroporto("Rio Grande do Sul", 3800);
        Aeroporto rondonia = new Aeroporto("Rondônia", 2500);
        Aeroporto roraima = new Aeroporto("Roraima", 2100);
        Aeroporto santaCatarina = new Aeroporto("Santa Catarina", 2600);
        Aeroporto saoPaulo = new Aeroporto("São Paulo", 5000);
        Aeroporto sergipe = new Aeroporto("Sergipe", 2300);
        Aeroporto tocantins = new Aeroporto("Tocantins", 2200);

        grafo.adicionarVertice(acre);
        grafo.adicionarVertice(alagoas);
        grafo.adicionarVertice(amapa);
        grafo.adicionarVertice(amazonas);
        grafo.adicionarVertice(bahia);
        grafo.adicionarVertice(ceara);
        grafo.adicionarVertice(espiritoSanto);
        grafo.adicionarVertice(goias);
        grafo.adicionarVertice(maranhao);
        grafo.adicionarVertice(matoGrosso);
        grafo.adicionarVertice(matoGrossoDoSul);
        grafo.adicionarVertice(minasGerais);
        grafo.adicionarVertice(para);
        grafo.adicionarVertice(parana);
        grafo.adicionarVertice(pernambuco);
        grafo.adicionarVertice(piaui);
        grafo.adicionarVertice(rioDeJaneiro);
        grafo.adicionarVertice(rioGrandeDoNorte);
        grafo.adicionarVertice(rioGrandeDoSul);
        grafo.adicionarVertice(rondonia);
        grafo.adicionarVertice(roraima);
        grafo.adicionarVertice(santaCatarina);
        grafo.adicionarVertice(saoPaulo);
        grafo.adicionarVertice(sergipe);
        grafo.adicionarVertice(tocantins);

        grafo.adicionarAresta(1017.6, saoPaulo, goias);
        grafo.adicionarAresta(902.4, goias, bahia);
        grafo.adicionarAresta(810.8, bahia, maranhao);
        grafo.adicionarAresta(1045.3, maranhao, tocantins);
        grafo.adicionarAresta(2615.6, tocantins, amazonas);
        grafo.adicionarAresta(2764.5, tocantins, acre);
        grafo.adicionarAresta(1540.2, saoPaulo, acre);
        grafo.adicionarAresta(1458.3, saoPaulo, tocantins);
    }
    
    public OtimizadorAereo() {
        carregarDados();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRotas = new javax.swing.JTable();
        cboOrigem = new javax.swing.JComboBox<>();
        cboDestino = new javax.swing.JComboBox<>();
        lblOrigim = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tblRotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origem", "Destino", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(tblRotas);

        cboOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        cboDestino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        lblOrigim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrigim.setText("Origem:");

        lblDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestino.setText("Destino:");

        btnCalcular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular Rota");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrigim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboOrigem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigim))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(cboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        DefaultTableModel model = (DefaultTableModel)this.tblRotas.getModel();
        model.setRowCount(0);
        
        ArrayList<Aresta> melhoresRotas = grafo.encontrarMelhorRotaData(cboOrigem.getSelectedItem().toString(), cboDestino.getSelectedItem().toString());
        
        for(Aresta rota : melhoresRotas){
            model.addRow(new String[]{
                rota.getOrigem().getAeroporto().getNome(),
                rota.getDestino().getAeroporto().getNome(),
                String.valueOf(rota.getDistancia()),
            });
        }
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtimizadorAereo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cboDestino;
    private javax.swing.JComboBox<String> cboOrigem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblOrigim;
    private javax.swing.JTable tblRotas;
    // End of variables declaration//GEN-END:variables
}
