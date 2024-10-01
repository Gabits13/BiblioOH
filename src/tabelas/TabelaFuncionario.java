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
    
    private void preencherTabela() {
        FuncoesBtn event = new FuncoesBtn() {
            @Override
            public void Alterar(int row, int column) {
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
            }

            @Override
            public void Deletar(int row, int column) {
                System.out.println("Linha: " + row + " Deletada");
            }
        };
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
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(923, 529));

        jLabel1.setText("Tabela Funcionário");

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

        btnPesquisa.setText("P");

        btnProximo.setText("Próximo");

        btnAnterior.setText("Anterior");

        btnPrimeiro.setText("Primeiro");

        btnUltimo.setText("Ultimo");

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
                        .addGap(157, 157, 157)
                        .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
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
                    .addComponent(btnUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoRegistroActionPerformed
        // TODO add your handling code here:
        NovoRegistroFuncionario nr = new NovoRegistroFuncionario(null, true);
        nr.setVisible(true);
    }//GEN-LAST:event_btnNovoRegistroActionPerformed

    private void barraPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraPesquisa;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnNovoRegistro;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private tabelas.Tabela funcionario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
