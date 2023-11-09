package br.com.senac.connectsenac.view;

import br.com.senac.connectsenac.Aresta;
import br.com.senac.connectsenac.Grafo;
import br.com.senac.connectsenac.Vertice;
import br.com.senac.connectsenac.model.Usuario;
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

        var arthur = new Usuario("Arthur Souza Braz");
        var ana = new Usuario("Ana Silva Santos");
        var carol = new Usuario("Carol Brasileira Clara");
        var joao = new Usuario("João Cabral Matos");
        var maria = new Usuario("Maria Oliveira Souza");
        var clara = new Usuario("Clara Ferreira");
        var carlos = new Usuario("Carlos Henrique Junior");

        grafo.adicionarVertice(arthur);
        grafo.adicionarVertice(ana);
        grafo.adicionarVertice(carol);
        grafo.adicionarVertice(joao);
        grafo.adicionarVertice(maria);
        grafo.adicionarVertice(clara);
        grafo.adicionarVertice(carlos);

        grafo.adicionarAresta(1.0, arthur, joao);
        grafo.adicionarAresta(1.0, arthur, clara);
        grafo.adicionarAresta(1.0, maria, arthur);
        grafo.adicionarAresta(1.0, joao, ana);
        grafo.adicionarAresta(1.0, ana, arthur);
        grafo.adicionarAresta(1.0, ana, carol);
        grafo.adicionarAresta(1.0, clara, carlos);

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
        lblAmigos2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDesfazer = new javax.swing.JButton();
        pnlSugestao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSugestao = new javax.swing.JList<>();
        lblRecomenda = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProcurar = new javax.swing.JLabel();
        txtProcurar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SenacBook :)");
        setResizable(false);

        tabNav.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabNavStateChanged(evt);
            }
        });

        pnlUser.setBackground(new java.awt.Color(57, 106, 177));
        pnlUser.setName("Usuario"); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário:");

        cboUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:" }));
        cboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuarioActionPerformed(evt);
            }
        });

        lblAmigos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAmigos.setForeground(new java.awt.Color(255, 255, 255));
        lblAmigos.setText("Amigos:");

        lblQntAmigos.setBackground(new java.awt.Color(255, 255, 255));
        lblQntAmigos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQntAmigos.setForeground(new java.awt.Color(255, 255, 255));
        lblQntAmigos.setText("0");

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 204));
        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(124, 124, 124)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblAmigos))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQntAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmigos)
                    .addComponent(lblQntAmigos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        tabNav.addTab("Usuario", pnlUser);

        pnlAmigos.setBackground(new java.awt.Color(57, 106, 177));
        pnlAmigos.setName("Amigos"); // NOI18N

        lstAmigos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(lstAmigos);

        lblAmigos2.setBackground(new java.awt.Color(255, 255, 255));
        lblAmigos2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAmigos2.setForeground(new java.awt.Color(249, 243, 219));
        lblAmigos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmigos2.setText("Amigos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnDesfazer.setBackground(new java.awt.Color(255, 102, 102));
        btnDesfazer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDesfazer.setForeground(new java.awt.Color(255, 255, 255));
        btnDesfazer.setText("Desfazer");
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDesfazer, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnDesfazer)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAmigosLayout = new javax.swing.GroupLayout(pnlAmigos);
        pnlAmigos.setLayout(pnlAmigosLayout);
        pnlAmigosLayout.setHorizontalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAmigos2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAmigosLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlAmigosLayout.setVerticalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAmigos2)
                .addGap(18, 18, 18)
                .addGroup(pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        tabNav.addTab("Consultar Amigos", pnlAmigos);

        pnlSugestao.setBackground(new java.awt.Color(57, 106, 177));
        pnlSugestao.setName("Sugestao"); // NOI18N

        lstSugestao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lstSugestao);

        lblRecomenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRecomenda.setForeground(new java.awt.Color(255, 255, 255));
        lblRecomenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecomenda.setText("Recomendação:");

        btnAdicionar.setBackground(new java.awt.Color(46, 204, 113));
        btnAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProcurar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblProcurar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcurar.setText("Procurar:");

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(txtProcurar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblProcurar)
                .addGap(26, 26, 26)
                .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnBuscar)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSugestaoLayout = new javax.swing.GroupLayout(pnlSugestao);
        pnlSugestao.setLayout(pnlSugestaoLayout);
        pnlSugestaoLayout.setHorizontalGroup(
            pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSugestaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRecomenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSugestaoLayout.setVerticalGroup(
            pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSugestaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRecomenda)
                .addGap(18, 18, 18)
                .addGroup(pnlSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSugestaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
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
        
        if(usuarioSelecionado.equals(grafo.getVertice(lstSugestao.getSelectedValue()))){
            JOptionPane.showMessageDialog(this, "Não é possivel adicionar você mesmo", "Erro ao adicionar", JOptionPane.WARNING_MESSAGE);
            
            return;
        }

        String title = getTitle();
        String nome = title.substring(title.lastIndexOf("--->") + 5).trim();

        Usuario novoAmigo = grafo.getVertice(lstSugestao.getSelectedValue()).getDado();
        Usuario usuario = grafo.getVertice(nome).getDado();

        grafo.adicionarAresta(1.0, usuario, novoAmigo);

        DefaultListModel<String> modelSugestao = (DefaultListModel<String>) lstSugestao.getModel();

        modelSugestao.removeElement(lstSugestao.getSelectedValue());
        atualizarAmigos();
        atualizarSugestoes();
        
        
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
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

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazerActionPerformed
        
        if(lstAmigos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Selecione um amigo para desfazer a amizade", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String title = getTitle();
        String nome = title.substring(title.lastIndexOf("--->") + 5).trim();

        Usuario usuario = grafo.getVertice(nome).getDado();
        Usuario amigo = grafo.getVertice(lstAmigos.getSelectedValue()).getDado();

        grafo.removerAresta(usuario, amigo);

        DefaultListModel<String> modelAmigo = (DefaultListModel<String>) lstAmigos.getModel();
        lstAmigos.setModel(modelAmigo);

        modelAmigo.removeElement(amigo.getNome());
        atualizarAmigos();

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JComboBox<String> cboUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblAmigos2;
    private javax.swing.JLabel lblProcurar;
    private javax.swing.JLabel lblQntAmigos;
    private javax.swing.JLabel lblRecomenda;
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
