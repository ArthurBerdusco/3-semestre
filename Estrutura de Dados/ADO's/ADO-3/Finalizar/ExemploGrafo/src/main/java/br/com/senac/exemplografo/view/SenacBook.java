package br.com.senac.exemplografo.view;

import br.com.senac.exemplografo.Aresta;
import br.com.senac.exemplografo.Grafo;
import br.com.senac.exemplografo.Vertice;
import br.com.senac.exemplografo.model.Usuario;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;

public class SenacBook extends javax.swing.JFrame {

    Grafo<Usuario> grafo;

    public SenacBook() {

        initComponents();
        carregarDados();
    }

    public void carregarDados() {
        this.grafo = new Grafo<Usuario>();

        var user1 = new Usuario("Paulo");
        var user2 = new Usuario("Lorenzo");
        var user3 = new Usuario("Cleuza");
        var user4 = new Usuario("Kleber");
        var user5 = new Usuario("Claudio");
        var user6 = new Usuario("Roberto");

        grafo.adicionarVertice(user1);
        grafo.adicionarVertice(user2);
        grafo.adicionarVertice(user3);
        grafo.adicionarVertice(user4);
        grafo.adicionarVertice(user5);

        grafo.adicionarAresta(1.0, user1, user2);
        grafo.adicionarAresta(3.0, user2, user5);
        grafo.adicionarAresta(2.0, user5, user4);
        grafo.adicionarAresta(1.0, user3, user4);
        grafo.adicionarAresta(1.0, user1, user3);
        grafo.adicionarAresta(1.0, user3, user1);

        atualizarUsuarios();

        grafo.buscaEmLargura();
        grafo.buscarAmigos(user1);
    }

    public void atualizarUsuarios() {
        for (Vertice<Usuario> user : grafo.getVertices()) {
            cboUsuario.addItem(user.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlUser = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        cboUsuario = new javax.swing.JComboBox<>();
        lblAmigos = new javax.swing.JLabel();
        lblQntAmigos = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlAmigos = new javax.swing.JPanel();
        btnDesfazer = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAmigos = new javax.swing.JList<>();
        pnlSugestao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSugestao = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SenacBook :)");
        setResizable(false);

        lblUsuario.setText("Usuário:");

        cboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione: " }));
        cboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuarioActionPerformed(evt);
            }
        });

        lblAmigos.setText("Quantidade de Amigos:");

        lblQntAmigos.setText("0");

        btnCadastrar.setText("Cadastrar Usuário");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblAmigos)
                        .addGap(18, 18, 18)
                        .addComponent(lblQntAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmigos)
                    .addComponent(lblQntAmigos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuario", pnlUser);

        btnDesfazer.setBackground(new java.awt.Color(255, 51, 51));
        btnDesfazer.setText("Desfazer");

        jScrollPane2.setViewportView(lstAmigos);

        javax.swing.GroupLayout pnlAmigosLayout = new javax.swing.GroupLayout(pnlAmigos);
        pnlAmigos.setLayout(pnlAmigosLayout);
        pnlAmigosLayout.setHorizontalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAmigosLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAmigosLayout.setVerticalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnDesfazer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Amigos", pnlAmigos);

        jScrollPane1.setViewportView(lstSugestao);

        jLabel3.setText("Recomendação:");

        jLabel4.setText("Procurar:");

        jButton1.setText("Buscar");

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSugestaoLayout = new javax.swing.GroupLayout(pnlSugestao);
        pnlSugestao.setLayout(pnlSugestaoLayout);
        pnlSugestaoLayout.setHorizontalGroup(
            pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSugestaoLayout.createSequentialGroup()
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSugestaoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18))
                    .addGroup(pnlSugestaoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)))
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSugestaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(229, 229, 229))
        );
        pnlSugestaoLayout.setVerticalGroup(
            pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSugestaoLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSugestaoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Recomendações de amizade", pnlSugestao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuarioActionPerformed
        if (cboUsuario.getSelectedIndex() != 0) {
            Vertice<Usuario> verticeSelecionado = grafo.getVertice(cboUsuario.getSelectedItem().toString());
            DefaultListModel<String> modelAmigos = new DefaultListModel<>();
            DefaultListModel<String> modelSugestao = new DefaultListModel<>();

            lstAmigos.setModel(modelAmigos);
            lstSugestao.setModel(modelSugestao);
            lblQntAmigos.setText(String.valueOf(verticeSelecionado.getArestasSaida().size()));
            setTitle("SenacBook ---> " + cboUsuario.getSelectedItem());

            for (Aresta<Usuario> amigo : verticeSelecionado.getArestasSaida()) {
                modelAmigos.addElement(amigo.getFim().toString());
            }

            Set<Usuario> amigosDoAmigoSet = new HashSet<>(); // Usando um Set para evitar duplicatas
            

            for (Aresta<Usuario> amigo : verticeSelecionado.getArestasSaida()) {
                Vertice<Usuario> amigoVertice = amigo.getFim();

                for (Aresta<Usuario> arestaDoAmigo : amigoVertice.getArestasSaida()) {
                    Vertice<Usuario> amigoDoAmigo = arestaDoAmigo.getFim();

                    if (!amigoDoAmigo.getDado().equals(verticeSelecionado.getDado())) {
                        amigosDoAmigoSet.add(amigoDoAmigo.getDado());
                    }
                }
            }

            for (Usuario amigoDoAmigo : amigosDoAmigoSet) {
                modelSugestao.addElement(amigoDoAmigo.toString());
            }

        } else {
            setTitle("SenacBook :)");
            lblQntAmigos.setText("0");
        }

    }//GEN-LAST:event_cboUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (lstSugestao.getSelectedIndex() == -1) {
            return;
        }

        String title = getTitle();
        String nome = title.substring(title.lastIndexOf("--->") + 5).trim();

        Usuario novoAmigo = grafo.getVertice(lstSugestao.getSelectedValue()).getDado();
        Usuario usuario = grafo.getVertice(nome).getDado();

        grafo.adicionarAresta(1.0, usuario, novoAmigo);

        DefaultListModel<String> modelSugestao = (DefaultListModel<String>) lstSugestao.getModel();

        // Remove apenas o amigo selecionado da lista de sugestões
        modelSugestao.removeElement(lstSugestao.getSelectedValue());
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SenacBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JToggleButton btnDesfazer;
    private javax.swing.JComboBox<String> cboUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblQntAmigos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> lstAmigos;
    private javax.swing.JList<String> lstSugestao;
    private javax.swing.JPanel pnlAmigos;
    private javax.swing.JPanel pnlSugestao;
    private javax.swing.JPanel pnlUser;
    // End of variables declaration//GEN-END:variables
}
