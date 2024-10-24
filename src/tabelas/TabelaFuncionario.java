/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tabelas;

import JanelasModais.AlterarFuncionario;
import JanelasModais.NovoRegistroFuncionario;
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
public class TabelaFuncionario extends javax.swing.JPanel {

    /**
     * Creates new form TabelaLivro
     */
    String id = "";
    String nome = "";
    String rg = "";
    String cpf = "";
    String dataNascimento = "";
    String dataAdmissao = "";
    String endereco = "";
    String telefone = "";
    String email = "";
    String codPeriodo = "";
    String codCargo = "";
    Conexao con_cliente;
    public TabelaFuncionario() {
        initComponents();
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        
        funcionario1.setShowHorizontalLines(true);
        funcionario1.setGridColor(new Color(230, 230, 230));
        funcionario1.setRowHeight(40);
        funcionario1.getTableHeader().setReorderingAllowed(false);
        
        con_cliente.executaSQL("select * from funcionario order by Id_Funcionario");
        preencherTabela();
    }
    
    FuncoesBtn event = new FuncoesBtn() {
        @Override
        public void Alterar(int row, int column) {
            String sql;
            String msg = "";
            for (int i = 0; i < 11; i++) {
                switch (i) {
                    case 0:
                        id = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 1:
                        nome = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 2:
                        rg = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 3:
                        cpf = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 4:
                        dataNascimento = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 5:
                        dataAdmissao = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 6:
                        endereco = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 7:
                        telefone = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 8:
                        email = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 9:
                        codPeriodo = funcionario1.getValueAt(row, i).toString();
                        break;
                    case 10:
                        codCargo = funcionario1.getValueAt(row, i).toString();
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            AlterarFuncionario alt = new AlterarFuncionario(null, true, id, nome, rg, cpf, dataNascimento, dataAdmissao, endereco, telefone, email, codPeriodo, codCargo);
            alt.setVisible(true);
            id = alt.getId();
            nome = alt.getNome();
            rg = alt.getRg();
            cpf = alt.getCpf();
            dataNascimento = alt.getDataNascimento();
            dataAdmissao = alt.getDataAdmissao();
            endereco = alt.getEndereco();
            telefone = alt.getTelefone();
            email = alt.getEmail();
            codPeriodo = alt.getCodPeriodo();
            codCargo = alt.getCodCargo();
            //
            try {
                if (id.equals("") == false) {
                    sql = "update funcionario set Nome='" + nome + "',RG='" + rg + "',CPF='" + cpf + "',Data_Nasc='" + dataNascimento + "',Data_Admissao='" + dataAdmissao + "',Endereco='" + endereco + "',Telefone='" + telefone + "',Email='" + email + "',Cod_Periodo='" + codPeriodo + "',Cod_Cargo='" + codCargo + "' where Id_Funcionario = " + id;
                    msg = "Alteração de registro";
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from funcionario order by Id_Funcionario");
                    preencherTabela();
                }
            } catch (Exception errosql) {
                JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        @Override
        public void Deletar(int row, int column) {
            id = funcionario1.getValueAt(row, 0).toString();
            String sql="";
            if (funcionario1.isEditing()) {
                funcionario1.getCellEditor().stopCellEditing();
            }
            try {
                int opcao;
                Object [] botoes = {"Sim","Não"};
                opcao = JOptionPane.showOptionDialog(null, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
                if(opcao==JOptionPane.YES_OPTION){
                    sql = "delete from funcionario where Id_Funcionario = " + id;
                    int excluir = con_cliente.statement.executeUpdate(sql);
                    if (excluir==1){
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.executaSQL("select * from funcionario order by Id_Funcionario");
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
        funcionario1.getColumnModel().getColumn(0);
        funcionario1.getColumnModel().getColumn(1);
        funcionario1.getColumnModel().getColumn(2);
        funcionario1.getColumnModel().getColumn(3);
        funcionario1.getColumnModel().getColumn(4);
        funcionario1.getColumnModel().getColumn(5);
        funcionario1.getColumnModel().getColumn(6);
        funcionario1.getColumnModel().getColumn(7);
        funcionario1.getColumnModel().getColumn(8);
        funcionario1.getColumnModel().getColumn(9);
        funcionario1.getColumnModel().getColumn(10);
        funcionario1.getColumnModel().getColumn(11).setCellRenderer(new RenderizaAcao());
        funcionario1.getColumnModel().getColumn(11).setCellEditor(new RenderizacaoBtnAcao(event));
        
        DefaultTableModel modelo = (DefaultTableModel) funcionario1.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("Id_Funcionario"),
                    con_cliente.resultset.getString("Nome"),
                    con_cliente.resultset.getString("RG"),
                    con_cliente.resultset.getString("CPF"),
                    con_cliente.resultset.getString("Data_Nasc"),
                    con_cliente.resultset.getString("Data_Admissao"),
                    con_cliente.resultset.getString("Endereco"),
                    con_cliente.resultset.getString("Telefone"),
                    con_cliente.resultset.getString("Email"),
                    con_cliente.resultset.getString("Cod_Periodo"),
                    con_cliente.resultset.getString("Cod_Cargo")
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
        funcionario1 = new tabelas.Tabela();
        btnNovoRegistro = new javax.swing.JButton();
        barraPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(923, 529));

        jLabel1.setText("Nome:");

        funcionario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "RG", "CPF", "Data_Nasc", "Data_Admissao", "Endereço", "Telefone", "Email", "Cod_Periodo", "Cod_Cargo", "Ação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        funcionario1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(funcionario1);
        if (funcionario1.getColumnModel().getColumnCount() > 0) {
            funcionario1.getColumnModel().getColumn(0).setPreferredWidth(50);
            funcionario1.getColumnModel().getColumn(1).setPreferredWidth(120);
            funcionario1.getColumnModel().getColumn(2).setPreferredWidth(100);
            funcionario1.getColumnModel().getColumn(3).setPreferredWidth(120);
            funcionario1.getColumnModel().getColumn(4).setPreferredWidth(100);
            funcionario1.getColumnModel().getColumn(5).setPreferredWidth(100);
            funcionario1.getColumnModel().getColumn(6).setPreferredWidth(100);
            funcionario1.getColumnModel().getColumn(7).setPreferredWidth(130);
            funcionario1.getColumnModel().getColumn(8).setPreferredWidth(147);
            funcionario1.getColumnModel().getColumn(11).setPreferredWidth(150);
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

        jLabel2.setText("Tabela Funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoRegistro)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa)
                        .addGap(0, 381, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(767, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoRegistro)
                    .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2)
                    .addContainerGap(497, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoRegistroActionPerformed
        // TODO add your handling code here:
        NovoRegistroFuncionario nr = new NovoRegistroFuncionario(null, true);
        nr.setVisible(true);
        id = nr.getId();
        nome = nr.getNome();
        rg = nr.getRg();
        cpf = nr.getCpf();
        dataNascimento = nr.getDataNascimento();
        dataAdmissao = nr.getDataAdmissao();
        endereco = nr.getEndereco();
        telefone = nr.getTelefone();
        email = nr.getEmail();
        codPeriodo = nr.getCodPeriodo();
        codCargo = nr.getCodCargo();
        
        try {
            if (nome != "" && rg !="" && cpf !="" && dataNascimento !="" && dataAdmissao !="" && endereco !="" && telefone !="" && email !="" && codPeriodo !="" && codCargo !="") {
                String insert_sql = "insert into funcionario (Nome,RG,CPF,Data_Nasc,Data_Admissao,Endereco,Telefone,Email,Cod_Periodo, Cod_Cargo) values ('" + nome + "', '" + rg + "', '" + cpf + "', '" + dataNascimento + "', '" + dataAdmissao + "', '" + endereco + "', '" + telefone + "', '" + email + "', '" + codPeriodo + "', '" + codCargo + "')";
                con_cliente.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                con_cliente.executaSQL("select * from funcionario order by Id_Funcionario");
                preencherTabela();
            };
            
        } catch (Exception errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNovoRegistroActionPerformed

    private void barraPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraPesquisaActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        if (funcionario1.isEditing()) {
                funcionario1.getCellEditor().stopCellEditing();
        }
        try {
                String pesquisa = "select * from funcionario where Nome like '" + barraPesquisa.getText() + "%'";
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
    private tabelas.Tabela funcionario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
