/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ControllerCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;

/**
 *
 * @author fcorr
 */
public class ViewCliente extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList();
    String salvarAlterar;

    /**
     * Creates new form ViewCliente
     */
    public ViewCliente() {
        initComponents();
        carregarCliente();
        setLocationRelativeTo(null);
        habilitarDesabilitarCampos(false);
        limparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtfEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtfBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtfCidade = new javax.swing.JTextField();
        JbcUF = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JtfTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtCliente = new javax.swing.JTable();
        JbCancelar = new javax.swing.JButton();
        JbNovo = new javax.swing.JButton();
        JbSalvar = new javax.swing.JButton();
        JbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        JtfCEP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jLabel1.setText("Código:");

        JtfCodigo.setEnabled(false);
        JtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Bairro:");

        jLabel5.setText("Cidade:");

        JbcUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AM", "AP", "MG", "SP", "DF", "GO", "MT", "MS", "RR", "RO", "TO", "SE", "PE", "PB", "AL", "SE", "RS", "SC", "PR", "ES", "RN", "CE", "MA" }));

        jLabel6.setText("CEP:");

        jLabel7.setText("Telefone:");

        JtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JtCliente);
        if (JtCliente.getColumnModel().getColumnCount() > 0) {
            JtCliente.getColumnModel().getColumn(0).setMinWidth(20);
            JtCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        JbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/icons8-cancelar-18.png"))); // NOI18N
        JbCancelar.setText("Cancelar");
        JbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCancelarActionPerformed(evt);
            }
        });

        JbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/icons8-novo-arquivo-18.png"))); // NOI18N
        JbNovo.setText("Novo");
        JbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbNovoActionPerformed(evt);
            }
        });

        JbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/icons8-salvar-18.png"))); // NOI18N
        JbSalvar.setText("Salvar");
        JbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalvarActionPerformed(evt);
            }
        });

        JbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/icons8-atualizações-disponíveis-18.png"))); // NOI18N
        JbAlterar.setText("Alterar");
        JbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/icons8-excluir-18.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        try {
            JtfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtfCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfCEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JtfNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(JtfBairro)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JtfCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JbcUF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(JtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbCancelar)
                    .addComponent(JbSalvar)
                    .addComponent(JbAlterar)
                    .addComponent(JbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfCodigoActionPerformed

    private void JbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalvarActionPerformed
        if (salvarAlterar.equals("salvar")) {
            this.salvarCliente();
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarCliente();
        }
    }//GEN-LAST:event_JbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        //EXCLUIR UM CLIENTE DO BANCO
        int linha = JtCliente.getSelectedRow();
        int codigoCliente = (int) JtCliente.getValueAt(linha, 0);

        if (controllerCliente.excluirClienteController(codigoCliente)) {
            JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.carregarCliente();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void JbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlterarActionPerformed
        // TODO add your handling code here:
        salvarAlterar = "alterar";
        habilitarDesabilitarCampos(true);
        int linha = this.JtCliente.getSelectedRow();
        try {
            int codigoCliente = (int) JtCliente.getValueAt(linha, 0);
            modelCliente = controllerCliente.getClienteController(codigoCliente);
            JtfCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
            JtfNome.setText(modelCliente.getCliNome());
            JtfEndereco.setText(modelCliente.getCliEndereco());
            JtfBairro.setText(modelCliente.getCliBairro());
            JtfCidade.setText(modelCliente.getCliBairro());
            JbcUF.setSelectedItem(modelCliente.getCliUf());
            JtfCEP.setText(modelCliente.getCliCep());
            JtfTelefone.setText(modelCliente.getCliTelefone());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JbAlterarActionPerformed

    private void JbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbNovoActionPerformed
        // TODO add your handling code here:
        this.limparCampos();
        habilitarDesabilitarCampos(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_JbNovoActionPerformed

    private void JbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCancelarActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_JbCancelarActionPerformed

    private void JtfCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfCEPActionPerformed

    private void carregarCliente() {
        listaModelCliente = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) JtCliente.getModel();
        modelo.setNumRows(0);
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getIdCliente(),
                listaModelCliente.get(i).getCliNome(),
                listaModelCliente.get(i).getCliCidade(),
                listaModelCliente.get(i).getCliTelefone()
            });

        }

    }

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    //Habilita ou desabilita campos e botões
    private void habilitarDesabilitarCampos(boolean condicao) {
        JtfNome.setEnabled(condicao);
        JtfEndereco.setEnabled(condicao);
        JtfBairro.setEnabled(condicao);
        JtfCidade.setEnabled(condicao);
        JbcUF.setEnabled(condicao);
        JtfCEP.setEnabled(condicao);
        JtfTelefone.setEnabled(condicao);
        JbSalvar.setEnabled(condicao);
    }

    //limpar campos do formulário
    private void limparCampos() {
        JtfNome.setText("");
        JtfEndereco.setText("");
        JtfBairro.setText("");
        JtfCidade.setText("");
        JtfCEP.setText("");
        JtfTelefone.setText("");
    }

    private void salvarCliente() {
        //SALVA UM NOVO CLIENTE NO VANCO
        modelCliente.setCliNome(this.JtfNome.getText());
        modelCliente.setCliEndereco(this.JtfEndereco.getText());
        modelCliente.setCliBairro(this.JtfBairro.getText());
        modelCliente.setCliCidade(this.JtfCidade.getText());
        modelCliente.setCliUf(this.JbcUF.getSelectedItem().toString());
        modelCliente.setCliCep(this.JtfCEP.getText());
        modelCliente.setCliTelefone(this.JtfTelefone.getText());

        if (controllerCliente.salvarClienteController(modelCliente) > 0) {
            JOptionPane.showMessageDialog(this, "Cliente Cadastrado com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            // carregar os clientes na tabela
            this.carregarCliente();
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarCliente() {

        modelCliente.setCliNome(this.JtfNome.getText());
        modelCliente.setCliEndereco(this.JtfEndereco.getText());
        modelCliente.setCliBairro(this.JtfBairro.getText());
        modelCliente.setCliCidade(this.JtfCidade.getText());
        modelCliente.setCliUf(this.JbcUF.getSelectedItem().toString());
        modelCliente.setCliCep(this.JtfCEP.getText());
        modelCliente.setCliTelefone(this.JtfTelefone.getText());

        if (controllerCliente.atualizarClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, "Cliente alterado com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            // carregar os clientes na tabela
            carregarCliente();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAlterar;
    private javax.swing.JButton JbCancelar;
    private javax.swing.JButton JbNovo;
    private javax.swing.JButton JbSalvar;
    private javax.swing.JComboBox<String> JbcUF;
    private javax.swing.JTable JtCliente;
    private javax.swing.JTextField JtfBairro;
    private javax.swing.JFormattedTextField JtfCEP;
    private javax.swing.JTextField JtfCidade;
    private javax.swing.JTextField JtfCodigo;
    private javax.swing.JTextField JtfEndereco;
    private javax.swing.JTextField JtfNome;
    private javax.swing.JTextField JtfTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExcluir;
    // End of variables declaration//GEN-END:variables
}
