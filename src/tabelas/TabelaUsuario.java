/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tabelas;

import JanelasModais.AlterarUsuario;
import JanelasModais.NovoRegistroUsuario;
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
public class TabelaUsuario extends javax.swing.JPanel {

    /**
     * Creates new form TabelaUsuario
     */
    String id = "";
    String nome = "";
    String endereco = "";
    String rg = "";
    String cpf = "";
    String telefone = "";
    String email = "";
    String senha = "";
    Conexao con_cliente;
    public TabelaUsuario() {
        initComponents();
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        
        usuario1.setShowHorizontalLines(true);
        usuario1.setGridColor(new Color(230, 230, 230));
        usuario1.setRowHeight(40);
        usuario1.getTableHeader().setReorderingAllowed(false);
        
        con_cliente.executaSQL("select * from usuario order by Id_Usuario");
        preencherTabela();
    }
    
    private void preencherTabela() {
        FuncoesBtn event = new FuncoesBtn() {
            @Override
            public void Alterar(int row, int column) {
                //System.out.println("Linha: " + row + " Editada");
                for (int i = 0; i < 8; i++) {
                    switch (i) {
                        case 0:
                            id = usuario1.getValueAt(row, i).toString();
                            break;
                        case 1:
                            nome = usuario1.getValueAt(row, i).toString();
                            break;
                        case 2:
                            endereco = usuario1.getValueAt(row, i).toString();
                            break;
                        case 3:
                            rg = usuario1.getValueAt(row, i).toString();
                            break;
                        case 4:
                            cpf = usuario1.getValueAt(row, i).toString();
                            break;
                        case 5:
                            telefone = usuario1.getValueAt(row, i).toString();
                            break;
                        case 6:
                            email = usuario1.getValueAt(row, i).toString();
                            break;
                        case 7:
                            senha = usuario1.getValueAt(row, i).toString();
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                AlterarUsuario alt = new AlterarUsuario(null, true, id, nome, endereco, rg, cpf, telefone, email, senha);
                alt.setVisible(true);
            }

            @Override
            public void Deletar(int row, int column) {
                System.out.println("Linha: " + row + " Deletada");
            }
        };
        usuario1.getColumnModel().getColumn(0);
        usuario1.getColumnModel().getColumn(1);
        usuario1.getColumnModel().getColumn(2);
        usuario1.getColumnModel().getColumn(3);
        usuario1.getColumnModel().getColumn(4);
        usuario1.getColumnModel().getColumn(5);
        usuario1.getColumnModel().getColumn(6);
        usuario1.getColumnModel().getColumn(7);
        usuario1.getColumnModel().getColumn(8).setCellRenderer(new RenderizaAcao());
        usuario1.getColumnModel().getColumn(8).setCellEditor(new RenderizacaoBtnAcao(event));
        
        DefaultTableModel modelo = (DefaultTableModel) usuario1.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("Id_Usuario"),
                    con_cliente.resultset.getString("Nome"),
                    con_cliente.resultset.getString("Endereco"),
                    con_cliente.resultset.getString("RG"),
                    con_cliente.resultset.getString("CPF"),
                    con_cliente.resultset.getString("Telefone"),
                    con_cliente.resultset.getString("Email"),
                    con_cliente.resultset.getString("senha")
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
        usuario1 = new tabelas.Tabela();
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

        jLabel1.setText("Nome:");

        usuario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Usuario", "Nome", "Endereco", "RG", "CPF", "Telefone", "Email", "Senha", "Ação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuario1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(usuario1);
        if (usuario1.getColumnModel().getColumnCount() > 0) {
            usuario1.getColumnModel().getColumn(0).setPreferredWidth(50);
            usuario1.getColumnModel().getColumn(1).setPreferredWidth(140);
            usuario1.getColumnModel().getColumn(2).setPreferredWidth(70);
            usuario1.getColumnModel().getColumn(3).setPreferredWidth(100);
            usuario1.getColumnModel().getColumn(5).setPreferredWidth(90);
            usuario1.getColumnModel().getColumn(8).setPreferredWidth(110);
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

        btnProximo.setText("Próximo");

        btnAnterior.setText("Anterior");

        btnPrimeiro.setText("Primeiro");

        btnUltimo.setText("Ultimo");

        jLabel2.setText("Tabela Usuário");

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
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)
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
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
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
        NovoRegistroUsuario nr = new NovoRegistroUsuario(null, true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private tabelas.Tabela usuario1;
    // End of variables declaration//GEN-END:variables
}
