/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tabelas;

import JanelasModais.AlterarEmprestimo;
import JanelasModais.NovoRegistroEmprestimo;
import conexao.Conexao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class TabelaEmprestimo extends javax.swing.JPanel {

    /**
     * Creates new form TabelaLivro
     */
    String idUsuario = "";
    String codLivro = "";
    String emissao = "";
    String devolucao = "";
    Conexao con_cliente;
    public TabelaEmprestimo() {
        initComponents();
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        
        emprestimo1.setShowHorizontalLines(true);
        emprestimo1.setGridColor(new Color(230, 230, 230));
        emprestimo1.setRowHeight(40);
        emprestimo1.getTableHeader().setReorderingAllowed(false);
        
        con_cliente.executaSQL("select * from empresta_livro order by Id_Usuario");
        preencherTabela();
    }
    
    FuncoesBtn event = new FuncoesBtn() {
        @Override
        public void Alterar(int row, int column) {
            String sql;
            String msg = "";
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0:
                        idUsuario = emprestimo1.getValueAt(row, i).toString();
                        break;
                    case 1:
                        codLivro = emprestimo1.getValueAt(row, i).toString();
                        break;
                    case 2:
                        emissao = emprestimo1.getValueAt(row, i).toString();
                        break;
                    case 3:
                        devolucao = emprestimo1.getValueAt(row, i).toString();
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            AlterarEmprestimo alt = new AlterarEmprestimo(null, true, idUsuario, codLivro, emissao, devolucao);
            alt.setVisible(true);
            idUsuario = alt.getIdUsuario();
            codLivro = alt.getCodLivro();
            emissao = alt.getEmissao();
            devolucao = alt.getDevolucao();
            //
            try {
                if (idUsuario.equals("") == false) {
                    sql = "update empresta_livro set Data_Emissao='" + emissao + "',Data_Devolucao='" + devolucao + "' where Id_Usuario = " + idUsuario;
                    msg = "Alteração de registro";
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from empresta_livro order by Id_Usuario");
                    preencherTabela();
                }
            } catch (Exception errosql) {
                JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        @Override
        public void Deletar(int row, int column) {
            idUsuario = emprestimo1.getValueAt(row, 0).toString();
            String sql="";
            if (emprestimo1.isEditing()) {
                emprestimo1.getCellEditor().stopCellEditing();
            }
            try {
                int opcao;
                Object [] botoes = {"Sim","Não"};
                opcao = JOptionPane.showOptionDialog(null, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
                if(opcao==JOptionPane.YES_OPTION){
                    sql = "delete from empresta_livro where Id_Usuario = " + idUsuario;
                    int excluir = con_cliente.statement.executeUpdate(sql);
                    if (excluir==1){
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.executaSQL("select * from empresta_livro order by Id_Usuario");
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
    
    private void preencherTabela() {
        
        emprestimo1.getColumnModel().getColumn(0);
        emprestimo1.getColumnModel().getColumn(1);
        emprestimo1.getColumnModel().getColumn(2);
        emprestimo1.getColumnModel().getColumn(3);
        emprestimo1.getColumnModel().getColumn(4).setCellRenderer(new RenderizaAcao());
        emprestimo1.getColumnModel().getColumn(4).setCellEditor(new RenderizacaoBtnAcao(event));
        
        DefaultTableModel modelo = (DefaultTableModel) emprestimo1.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("Id_Usuario"),
                    con_cliente.resultset.getString("Cod_Livro"),
                    con_cliente.resultset.getString("Data_Emissao"),
                    con_cliente.resultset.getString("Data_Devolucao")
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
        emprestimo1 = new tabelas.Tabela();
        btnNovoRegistro = new javax.swing.JButton();
        barraPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(923, 529));

        jLabel1.setText("Tabela Emprestimo");

        emprestimo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Usuario", "Cod_Livro", "Data_Emissao", "Data_Devolucao", "Ação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emprestimo1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(emprestimo1);
        if (emprestimo1.getColumnModel().getColumnCount() > 0) {
            emprestimo1.getColumnModel().getColumn(0).setPreferredWidth(50);
            emprestimo1.getColumnModel().getColumn(1).setPreferredWidth(140);
            emprestimo1.getColumnModel().getColumn(2).setPreferredWidth(100);
            emprestimo1.getColumnModel().getColumn(4).setPreferredWidth(110);
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

        btnProximo.setText("Próximo");

        btnAnterior.setText("Anterior");

        btnPrimeiro.setText("Primeiro");

        btnUltimo.setText("Ultimo");

        jLabel2.setText("Data de devolução");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoRegistro)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo)))
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
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoRegistroActionPerformed
        // TODO add your handling code here:
        NovoRegistroEmprestimo nr = new NovoRegistroEmprestimo(null, true);
        nr.setVisible(true);
        idUsuario = nr.getIdUsuario();
        codLivro = nr.getCodLivro();
        emissao = nr.getEmissao();
        devolucao = nr.getDevolucao();
        
        try {
            if (idUsuario != "" && codLivro != "" && emissao !="" && devolucao !="") {
                String insert_sql = "insert into empresta_livro (Id_Usuario,Cod_Livro,Data_Emissao,Data_Devolucao) values ('"+ idUsuario +"', '" + codLivro + "', '" + emissao + "', '" + devolucao + "')";
                con_cliente.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                con_cliente.executaSQL("select * from empresta_livro order by Id_Usuario");
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
        try {
                String pesquisa = "select * from empresta_livro where Data_Devolucao like '" + barraPesquisa.getText() + "%'";
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
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnNovoRegistro;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private tabelas.Tabela emprestimo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
