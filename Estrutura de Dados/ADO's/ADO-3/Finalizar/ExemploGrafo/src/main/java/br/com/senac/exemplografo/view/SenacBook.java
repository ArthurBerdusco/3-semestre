package br.com.senac.exemplografo.view;

import br.com.senac.exemplografo.Aresta;
import br.com.senac.exemplografo.Grafo;
import br.com.senac.exemplografo.Vertice;
import br.com.senac.exemplografo.model.Usuario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class SenacBook extends javax.swing.JFrame {

    Grafo<Usuario> grafo;
    Vertice<Usuario> usuarioSelecionado;
    Set<Vertice<Usuario>> amigosDoUsuario;

    public SenacBook() {
        carregarDados();
        initComponents();

    }

    public void carregarDados() {

        this.grafo = new Grafo<Usuario>();

        var user1 = new Usuario("Paulo Souza Braz");
        var user2 = new Usuario("Lorenzo Silva Santos");
        var user3 = new Usuario("Cleuza Brasileira Clara");
        var user4 = new Usuario("Kleber Cabral Matos");
        var user5 = new Usuario("Claudio Matos Santos");
        var user6 = new Usuario("Roberto Dias Souza");

        grafo.adicionarVertice(user1);
        grafo.adicionarVertice(user2);
        grafo.adicionarVertice(user3);
        grafo.adicionarVertice(user4);
        grafo.adicionarVertice(user5);
        grafo.adicionarVertice(user6);

        grafo.adicionarAresta(1.0, user1, user2);
        grafo.adicionarAresta(3.0, user2, user5);
        grafo.adicionarAresta(2.0, user5, user4);
        grafo.adicionarAresta(1.0, user3, user4);
        grafo.adicionarAresta(1.0, user1, user3);
        grafo.adicionarAresta(1.0, user3, user1);
        grafo.adicionarAresta(3.0, user4, user6);

        grafo.buscaEmLargura(user1.getNome());
        grafo.buscarAmigos(user1);
    }

    public void atualizarUsuarios() {
        cboUsuario.removeAllItems();
        cboUsuario.addItem("Selecione:");

        for (Vertice<Usuario> user : grafo.getVertices()) {
            cboUsuario.addItem(user.toString());
        }

        if (usuarioSelecionado == null) {
            return;
        } else {

            cboUsuario.setSelectedItem(usuarioSelecionado.getDado().getNome());
            setTitle("SenacBook ---> " + usuarioSelecionado.getDado().getNome());
            lblQntAmigos.setText(String.valueOf(usuarioSelecionado.getArestasSaida().size()));
        }
    }

    public void atualizarAmigos() {
        if (usuarioSelecionado == null) {
            return;
        }

        DefaultListModel<String> modelAmigos = new DefaultListModel<>();
        lstAmigos.setModel(modelAmigos);

        amigosDoUsuario = new HashSet<Vertice<Usuario>>();
        for (Aresta<Usuario> amigo : usuarioSelecionado.getArestasSaida()) {
            amigosDoUsuario.add(amigo.getFim());
            modelAmigos.addElement(amigo.getFim().toString());
        }
    }

    public void atualizarSugestoes() {

        if (usuarioSelecionado == null) {
            return;
        }

        DefaultListModel<String> modelSugestao = new DefaultListModel<>();
        lstSugestao.setModel(modelSugestao);

        if (usuarioSelecionado.getArestasSaida().size() <= 0) {
            for (Vertice<Usuario> recomendacao : grafo.getVertices()) {
                if (!recomendacao.equals(usuarioSelecionado)) {
                    modelSugestao.addElement(recomendacao.getDado().getNome());
                }
            }
            return;
        }

        for (Vertice<Usuario> sugestao : grafo.buscaEmLargura(usuarioSelecionado.getDado().getNome())) {
            if (sugestao.getDado().getNome() != usuarioSelecionado.getDado().getNome() && !amigosDoUsuario.contains(sugestao)) {
                modelSugestao.addElement(sugestao.getDado().getNome());
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabNav = new javax.swing.JTabbedPane();
        pnlUser = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        cboUsuario = new javax.swing.JComboBox<>();
        lblAmigos = new javax.swing.JLabel();
        lblQntAmigos = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlAmigos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAmigos = new javax.swing.JList<>();
        btnDesfazer = new javax.swing.JButton();
        pnlSugestao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSugestao = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtProcurar = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SenacBook :)");
        setResizable(false);

        tabNav.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabNavStateChanged(evt);
            }
        });

        pnlUser.setName("Usuario"); // NOI18N

        lblUsuario.setText("Usuário:");

        cboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));
        cboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuarioActionPerformed(evt);
            }
        });

        lblAmigos.setText("Amigos:");

        lblQntAmigos.setText("0");

        btnCadastrar.setText("Cadastrar Usuário");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblAmigos))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQntAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btnCadastrar)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmigos)
                    .addComponent(lblQntAmigos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        tabNav.addTab("Usuario", pnlUser);

        pnlAmigos.setName("Amigos"); // NOI18N

        jScrollPane2.setViewportView(lstAmigos);

        btnDesfazer.setBackground(new java.awt.Color(255, 51, 51));
        btnDesfazer.setText("Desfazer");
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAmigosLayout = new javax.swing.GroupLayout(pnlAmigos);
        pnlAmigos.setLayout(pnlAmigosLayout);
        pnlAmigosLayout.setHorizontalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAmigosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAmigosLayout.setVerticalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabNav.addTab("Consultar Amigos", pnlAmigos);

        pnlSugestao.setName("Sugestao"); // NOI18N

        jScrollPane1.setViewportView(lstSugestao);

        jLabel3.setText("Recomendação:");

        jLabel4.setText("Procurar:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(51, 51, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSugestaoLayout = new javax.swing.GroupLayout(pnlSugestao);
        pnlSugestao.setLayout(pnlSugestaoLayout);
        pnlSugestaoLayout.setHorizontalGroup(
            pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSugestaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProcurar)
                    .addGroup(pnlSugestaoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSugestaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSugestaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSugestaoLayout.setVerticalGroup(
            pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSugestaoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSugestaoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tabNav.addTab("Recomendações de amizade", pnlSugestao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNav)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNav)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuarioActionPerformed

        if (cboUsuario.getSelectedIndex() <= 0) {
            setTitle("SenacBook :)");
            lblQntAmigos.setText("0");
            return;
        }

        Vertice<Usuario> verticeSelecionado = grafo.getVertice(cboUsuario.getSelectedItem().toString());
        usuarioSelecionado = verticeSelecionado;

        lblQntAmigos.setText(String.valueOf(verticeSelecionado.getArestasSaida().size()));
        setTitle("SenacBook ---> " + cboUsuario.getSelectedItem());

        amigosDoUsuario = new HashSet<Vertice<Usuario>>();

        for (Aresta<Usuario> amigo : usuarioSelecionado.getArestasSaida()) {
            amigosDoUsuario.add(amigo.getFim());
        }


    }//GEN-LAST:event_cboUsuarioActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
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
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nomeUsuario = JOptionPane.showInputDialog("Nome do usuário:");

        if (nomeUsuario == null) {
            return;
        }

        grafo.adicionarVertice(new Usuario(nomeUsuario));
        atualizarUsuarios();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tabNavStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabNavStateChanged

        String tabNome = tabNav.getSelectedComponent().getName();

        if (tabNome.equals("Usuario")) {
            atualizarUsuarios();
        }

        if (tabNome.equals("Amigos")) {
            atualizarAmigos();
        }

        if (tabNome.equals("Sugestao")) {
            atualizarSugestoes();
        }
    }//GEN-LAST:event_tabNavStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String procurar = txtProcurar.getText();

        DefaultListModel<String> modelSugestao = new DefaultListModel<>();
        lstSugestao.setModel(modelSugestao);

        Vertice<Usuario> sugestao = grafo.getVertice(procurar);

        if (sugestao == null) {
            JOptionPane.showMessageDialog(this, "Essa pessoa não está cadastrada", "Não localizado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        modelSugestao.removeAllElements();
        modelSugestao.addElement(sugestao.getDado().getNome());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazerActionPerformed
        String title = getTitle();
        String nome = title.substring(title.lastIndexOf("--->") + 5).trim();

        Usuario usuario = grafo.getVertice(nome).getDado();
        Usuario amigo = grafo.getVertice(lstAmigos.getSelectedValue()).getDado();

        grafo.removerAresta(usuario, amigo);

        DefaultListModel<String> modelAmigo = (DefaultListModel<String>) lstAmigos.getModel();
        lstAmigos.setModel(modelAmigo);

        modelAmigo.removeElement(amigo.getNome());


    }//GEN-LAST:event_btnDesfazerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SenacBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JComboBox<String> cboUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblQntAmigos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> lstAmigos;
    private javax.swing.JList<String> lstSugestao;
    private javax.swing.JPanel pnlAmigos;
    private javax.swing.JPanel pnlSugestao;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JTabbedPane tabNav;
    private javax.swing.JTextField txtProcurar;
    // End of variables declaration//GEN-END:variables
}
