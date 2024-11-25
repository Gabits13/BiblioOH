/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tabelas;

import JanelasModais.AlterarCargo;
import JanelasModais.NovoRegistroCargo;
import conexao.Conexao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Oliveira
 */
public class TabelaCargo extends javax.swing.JPanel {

    /**
     * Creates new form TabelaCargo
     */
    String codCargo = "";
    String descricao = "";
    String nome = "";
    String salario = "";
    String [] listaCod;
    Conexao con_cliente;
    public TabelaCargo() {
        initComponents();
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        
        cargo1.setShowHorizontalLines(true);
        cargo1.setGridColor(new Color(230, 230, 230));
        cargo1.setRowHeight(40);
        cargo1.getTableHeader().setReorderingAllowed(false);
        
        con_cliente.executaSQL("select * from cargo order by Cod_Cargo");
        preencherTabela();
        listaCod = new String [cargo1.getRowCount()];
        setListaCod(ListarCod(listaCod));
    }
    
    FuncoesBtn event = new FuncoesBtn() {
        @Override
        public void Alterar(int row, int column) {
            String sql;
            String msg = "";
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0:
                        codCargo = cargo1.getValueAt(row, i).toString();
                        break;
                    case 1:
                        descricao = cargo1.getValueAt(row, i).toString();
                        break;
                    case 2:
                        nome = cargo1.getValueAt(row, i).toString();
                        break;
                    case 3:
                        salario = cargo1.getValueAt(row, i).toString();
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            AlterarCargo alt = new AlterarCargo(null, true, codCargo, descricao, nome, salario);
            alt.setVisible(true);
            codCargo = alt.getCodCargo();
            descricao = alt.getDescricao();
            nome = alt.getNomeCargo();
            salario = alt.getSalario();
            //
            try {
                if (codCargo.equals("") == false) {
                    sql = "update cargo set Descricao='" + descricao + "',Nome_Cargo='" + nome + "',Salario ='" + salario + "' where Cod_Cargo= " + codCargo;
                    msg = "Alteração de registro";
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from cargo order by Cod_Cargo");
                    preencherTabela();
                }
            } catch (Exception errosql) {
                JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        @Override
        public void Deletar(int row, int column) {
            codCargo = cargo1.getValueAt(row, 0).toString();
            String sql="";
            if (cargo1.isEditing()) {
                cargo1.getCellEditor().stopCellEditing();
            }
            try {
                int opcao;
                Object [] botoes = {"Sim","Não"};
                opcao = JOptionPane.showOptionDialog(null, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
                if(opcao==JOptionPane.YES_OPTION){
                    sql = "delete from cargo where Cod_Cargo = " + codCargo;
                    int excluir = con_cliente.statement.executeUpdate(sql);
                    if (excluir==1){
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.executaSQL("select * from cargo order by Cod_Cargo");
                        preencherTabela();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (Exception excecao) {
                JOptionPane.showMessageDialog(null, "Erro na exclusão: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    };
    
    public String[] ListarCod (String cod[]) {
        for (int cont = 0; cont < cargo1.getRowCount(); cont++) {
            cod[cont] = cargo1.getValueAt(cont, 0).toString();
        }
        return cod;
    }

    public String[] getListaCod() {
        return listaCod;
    }

    public void setListaCod(String[] listaCod) {
        this.listaCod = listaCod;
    }
    
    private void preencherTabela() {
        
        cargo1.getColumnModel().getColumn(0);
        cargo1.getColumnModel().getColumn(1);
        cargo1.getColumnModel().getColumn(2);
        cargo1.getColumnModel().getColumn(3);
        cargo1.getColumnModel().getColumn(4).setCellRenderer(new RenderizaAcao());
        cargo1.getColumnModel().getColumn(4).setCellEditor(new RenderizacaoBtnAcao(event));
        
        DefaultTableModel modelo = (DefaultTableModel) cargo1.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("Cod_Cargo"),
                    con_cliente.resultset.getString("Descricao"),
                    con_cliente.resultset.getString("Nome_Cargo"),
                    con_cliente.resultset.getString("Salario")
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!!:\n" + erro,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargo1 = new tabelas.Tabela();
        btnNovoRegistro = new javax.swing.JButton();
        barraPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(923, 529));

        jLabel1.setText("Tabela cargo");

        cargo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod_Cargo", "Descricao", "Nome_Cargo", "Salario", "Ação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cargo1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(cargo1);
        if (cargo1.getColumnModel().getColumnCount() > 0) {
            cargo1.getColumnModel().getColumn(0).setPreferredWidth(50);
            cargo1.getColumnModel().getColumn(1).setPreferredWidth(140);
            cargo1.getColumnModel().getColumn(2).setPreferredWidth(100);
            cargo1.getColumnModel().getColumn(4).setPreferredWidth(110);
        }

        btnNovoRegistro.setText("Novo Registro");
        btnNovoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoRegistroActionPerformed(evt);
            }
        });

        barraPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraPesquisaActionPerformed(evt);
            }
        });

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovoRegistro)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisa)))
                        .addGap(0, 446, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoRegistro)
                    .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoRegistroActionPerformed
        // TODO add your handling code here:
        NovoRegistroCargo nr = new NovoRegistroCargo(null, true);
        nr.setVisible(true);
        codCargo = nr.getCodCargo();
        descricao = nr.getDescricao();
        nome = nr.getNomeCargo();
        salario = nr.getSalario();
        
        try {
            if (descricao != "" && nome !="" && salario !="") {
                String insert_sql = "insert into cargo (Descricao,Nome_Cargo,Salario) values ('" + descricao + "', '" + nome + "', '" + salario + "')";
                con_cliente.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                con_cliente.executaSQL("select * from cargo order by Cod_Cargo");
                preencherTabela();
            }
            
        } catch (Exception errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNovoRegistroActionPerformed

    private void barraPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraPesquisaActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        if (cargo1.isEditing()) {
                cargo1.getCellEditor().stopCellEditing();
        }
        try {
                String pesquisa = "select * from Cargo where Nome_Cargo like '" + barraPesquisa.getText() + "%'";
                con_cliente.executaSQL(pesquisa);

                if (con_cliente.resultset.first()) {
                    preencherTabela();
                }
                else {
                    JOptionPane.showMessageDialog(null, "\n Não existe dados com este paramêtro!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (Exception errosql) {
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraPesquisa;
    private javax.swing.JButton btnNovoRegistro;
    private javax.swing.JButton btnPesquisa;
    private tabelas.Tabela cargo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
