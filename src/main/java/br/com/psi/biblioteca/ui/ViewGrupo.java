/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.psi.biblioteca.ui;

import br.com.psi.biblioteca.exception.DaoException;
import br.com.psi.biblioteca.facade.Facade;
import br.com.psi.biblioteca.model.Grupo;
import br.com.psi.biblioteca.model.Permissao;
import br.com.psi.biblioteca.ui.ViewPermissao;
import br.com.psi.biblioteca.ui.ViewPrincipal;
import br.com.psi.biblioteca.util.SimpleFactoryUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ViewGrupo extends javax.swing.JInternalFrame {

    private Facade facade = new Facade();

    public ViewGrupo() {
        initComponents();
        povoarTabelaGrupos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablePermissao = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrupo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtPermissao = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        tablePermissao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Descrição"
            }
        ));
        tablePermissao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablePermissaoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tablePermissao);

        tblGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Permissão"
            }
        ));
        tblGrupo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblGrupoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGrupoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGrupo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Permissões Cadastradas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Grupos Cadastrados");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cod permissões");

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPermissao.setText("        01-02-03");
        txtPermissao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPermissaoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPermissaoMouseClicked(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPermissao)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void tablePermissaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablePermissaoAncestorAdded
        DefaultTableModel table = (DefaultTableModel) tablePermissao.getModel();

        Facade facade = new Facade();
        List<Permissao> lista;
        try {
            lista = facade.listarPermissoes();
            while (table.getRowCount() > 0) {
                table.removeRow(0);
            }

            for (Permissao p : lista) {
                table.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getDescricao()
                });
            }
        }
        catch (DaoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tablePermissaoAncestorAdded

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (txtNome.getText().toString().equals(null) && txtPermissao.getText().toString().equals(null) && txtId.getText().toString().equals(null)
                || txtNome.getText().toString().equals("") && txtPermissao.getText().toString().equals("") && txtId.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Grupo, Dados inválidos!");
        } else {
            Grupo g = SimpleFactoryUtil.criarGrupo();
            String[] digitado = txtPermissao.getText().split("-");
            for (int i = 0; i < digitado.length; i++) {
                Permissao encontrada = SimpleFactoryUtil.criarPermissao();
                try {
                    encontrada = facade.buscarPermissao(Long.parseLong(digitado[i]));
                    g.getPermissoes().add(encontrada);

                }
                catch (DaoException ex) {
                    Logger.getLogger(ViewGrupo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            g.setNome(txtNome.getText());
            try {
                facade.salvarGrupo(g);
                JOptionPane.showMessageDialog(null, "Grupo Cadastrado com Sucesso!");

            }
            catch (Exception e) {
                Logger.getLogger(ViewGrupo.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Grupo!");

            }
            finally {
                limparCampos();
                povoarTabelaGrupos();

            }

        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtNome.getText().toString().equals(null) && txtPermissao.getText().toString().equals(null) && txtId.getText().toString().equals(null)
                || txtNome.getText().toString().equals("") && txtPermissao.getText().toString().equals("") && txtId.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione quem você deseja Editar!");

        } else {
            Grupo g = SimpleFactoryUtil.criarGrupo();
            try {
                g = facade.buscarGrupo(Long.parseLong(txtId.getText().toString()));
                g.getPermissoes().clear();
                g.setNome(txtNome.getText().toString());

                String[] digitado = txtPermissao.getText().split("-");
                for (int i = 0; i < digitado.length; i++) {
                    Permissao encontrada = SimpleFactoryUtil.criarPermissao();
                    try {
                        encontrada = facade.buscarPermissao(Long.parseLong(digitado[i]));
                        g.getPermissoes().add(encontrada);

                    }
                    catch (DaoException ex) {
                        Logger.getLogger(ViewGrupo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                facade.editarGrupo(g);
                JOptionPane.showMessageDialog(null, "Grupo editado com sucesso!");
            }
            catch (DaoException ex) {
                Logger.getLogger(ViewPermissao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possível editar esse Grupo!!");
            }
            finally {
                btnAdicionar.setEnabled(true);
                limparCampos();
                povoarTabelaGrupos();
            }

        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtNome.getText().toString().equals(null) && txtPermissao.getText().toString().equals(null) && txtId.getText().toString().equals(null)
                || txtNome.getText().toString().equals("") && txtPermissao.getText().toString().equals("") && txtId.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione quem você deseja Excluir!");

        } else {
            Grupo g = SimpleFactoryUtil.criarGrupo();
            try {
                g = facade.buscarGrupo(Long.parseLong(txtId.getText().toString()));
                facade.removerGrupo(g, g.getId());
                JOptionPane.showMessageDialog(null, "Permissão Removida com sucesso!");
                povoarTabelaGrupos();

            }
            catch (DaoException ex) {
                Logger.getLogger(ViewPermissao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possível Excluir essa permissão!");
            }
            finally {
                btnAdicionar.setEnabled(true);
                limparCampos();
                povoarTabelaGrupos();
            }

        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPermissaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPermissaoMouseClicked
        txtPermissao.setText("");
        JOptionPane.showMessageDialog(null, "Informe nesse campo os códigos das permissões que deseja inserir no grupo, separado por um hífen conforme o exemplo demonstrou ");
    }//GEN-LAST:event_txtPermissaoMouseClicked

    private void tblGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGrupoMouseClicked
        setarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_tblGrupoMouseClicked

    private void txtPermissaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPermissaoMousePressed
        txtPermissao.setText("");
        JOptionPane.showMessageDialog(null, "Informe nesse campo os códigos das permissões que deseja inserir no grupo, separado por um hífen conforme o exemplo demonstrou ");

    }//GEN-LAST:event_txtPermissaoMousePressed

    private void tblGrupoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblGrupoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGrupoAncestorAdded
    private void limparCampos() {
        txtNome.setText("");
        txtPermissao.setText("");
        txtId.setText("");
    }

    private void povoarTabelaGrupos() {
        DefaultTableModel table = (DefaultTableModel) tblGrupo.getModel();

        Facade facade = new Facade();
        List<Grupo> lista;
        try {
            lista = facade.listarGrupo();
            while (table.getRowCount() > 0) {
                table.removeRow(0);
            }

            for (Grupo g : lista) {
                table.addRow(new Object[]{
                    g.getId(),
                    g.getNome(),
                    g.getPermissoes()
                });
            }
        }
        catch (DaoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setarCampos() {
        int setar = tblGrupo.getSelectedRow();//
        txtPermissao.setText(tblGrupo.getModel().getValueAt(setar, 2).toString());
        txtNome.setText(tblGrupo.getModel().getValueAt(setar, 1).toString());
        txtId.setText(tblGrupo.getModel().getValueAt(setar, 0).toString());
        btnAdicionar.setEnabled(false);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePermissao;
    private javax.swing.JTable tblGrupo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPermissao;
    // End of variables declaration//GEN-END:variables
}
