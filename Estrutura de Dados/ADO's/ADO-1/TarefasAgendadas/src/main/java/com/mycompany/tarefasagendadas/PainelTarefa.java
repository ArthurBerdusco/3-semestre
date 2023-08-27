package com.mycompany.tarefasagendadas;

import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.tarefasagendadas.Tarefa;
import java.util.Locale;
import javax.swing.JOptionPane;

public class PainelTarefa extends javax.swing.JPanel {

    TelaPrincipal jf;
    Tarefa tarefa;

    public PainelTarefa() {
        initComponents();
    }

    public PainelTarefa(TelaPrincipal jf) {
        initComponents();
        this.jf = jf;
    }

    public boolean camposValidos() throws Exception {
        if (txtTitulo.getText().trim().isEmpty()) {
            new Exception("Campo título não pode ser nulo");
            return false;
        }
        if (dtcData.getDate() == null) {
            new Exception("Campo data não pode ser nulo");
            return false;
        }
        if (spnInicio.getValue() == null) {
            new Exception("Campo hora início não pode ser nulo");
            return false;
        }
        if (spnInicio.getValue() == null) {
            new Exception("Campo hora fim não pode ser nulo");
            return false;
        }
        return true;
    }

    public PainelTarefa(TelaPrincipal jf, Tarefa tarefa) {
        this.jf = jf;
        this.tarefa = tarefa;
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = df.parse(tarefa.getData());
            txtTitulo.setText(tarefa.getTitulo());
            dtcData.setDate(data);

            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

            Date horaInicio = timeFormat.parse(tarefa.getHoraInicio());
            spnInicio.setValue(horaInicio);

            Date horaFim = timeFormat.parse(tarefa.getHoraFim());
            spnFim.setValue(horaFim);

            txtDescricao.setText(tarefa.getDescricao());
            
            cboStatus.setSelectedItem(tarefa.getStatus());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spnInicio = new javax.swing.JSpinner(sm);
        dtcData = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        SpinnerDateModel sm2 = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spnFim = new javax.swing.JSpinner(sm2);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnSalvar1 = new javax.swing.JButton();
        cboStatus = new javax.swing.JComboBox<>();

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Título:");

        txtTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Descrição:");

        JSpinner.DateEditor de = new JSpinner.DateEditor(spnInicio, "HH:mm");
        spnInicio.setEditor(de);
        spnInicio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        dtcData.setLocale(new Locale("pt", "BR"));
        dtcData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dtcData.setDate(Calendar.getInstance().getTime());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setText("Data da tarefa:");

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(spnFim, "HH:mm");
        spnFim.setEditor(de2);
        spnFim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Horário de início:");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Horário de fim:");

        btnSalvar.setBackground(new java.awt.Color(51, 102, 255));
        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar e fechar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        btnSalvar1.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar1.setText("Fechar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        cboStatus.setEditable(true);
        cboStatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDENTE", "EM_ANDAMENTO", "CONCLUIDO", "ATRASADO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dtcData, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(spnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(spnFim, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtcData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnFim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {

            if (camposValidos()) {

                if (this.tarefa == null) {
                    this.tarefa = new Tarefa();
                }

                this.tarefa.setTitulo(txtTitulo.getText()); //OK
                this.tarefa.setDescricao(txtDescricao.getText()); // OK

                //DATA TAREFA: OK
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String data = df.format(dtcData.getDate());
                this.tarefa.setData(data);

                SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm");
                Date dateInicio = inputFormat.parse(spnInicio.getValue().toString());
                String horaInicioFormatada = outputFormat.format(dateInicio);
                this.tarefa.setHoraInicio(horaInicioFormatada);

                Date dateFim = inputFormat.parse(spnFim.getValue().toString());
                String horaFimFormatada = outputFormat.format(dateFim);
                this.tarefa.setHoraFim(horaFimFormatada);
                        
                if(cboStatus.getSelectedIndex() == 2){
                    tarefa.concluirStatus();
                }
                
                this.jf.fecharTarefa(this, tarefa);
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Revise os campos e tente novamente");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        this.jf.fecharTarefa(this);
    }//GEN-LAST:event_btnSalvar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cboStatus;
    private com.toedter.calendar.JDateChooser dtcData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnFim;
    private javax.swing.JSpinner spnInicio;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
