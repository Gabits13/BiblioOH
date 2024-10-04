/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tabelas;

import JanelasModais.AlterarLivro;
import JanelasModais.NovoRegistroLivro;
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
public class TabelaLivro extends javax.swing.JPanel {

    /**
     * Creates new form TabelaLivro
     */
    String codLivro = "";
    String titulo = "";
    String autor = "";
    String dataLacamento = "";
    String genero = "";
    String qtdePag = "";
    String exemplares = "";
    String editora = "";
    String isbn = "";
    String codSetor = "";
    Conexao con_cliente;
    public TabelaLivro() {
        initComponents();
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        
        livro1.setShowHorizontalLines(true);
        livro1.setGridColor(new Color(230, 230, 230));
        livro1.setRowHeight(40);
        livro1.getTableHeader().setReorderingAllowed(false);
        
        con_cliente.executaSQL("select * from livro order by Cod_Livro");
        preencherTabela();
    }
    
    FuncoesBtn event = new FuncoesBtn() {
        @Override
        public void Alterar(int row, int column) {
            String sql;
            String msg = "";
            for (int i = 0; i < 10; i++) {
                switch (i) {
                    case 0:
                        codLivro = livro1.getValueAt(row, i).toString();
                        break;
                    case 1:
                        titulo = livro1.getValueAt(row, i).toString();
                        break;
                    case 2:
                        autor = livro1.getValueAt(row, i).toString();
                        break;
                    case 3:
                        dataLacamento = livro1.getValueAt(row, i).toString();
                        break;
                    case 4:
                        genero = livro1.getValueAt(row, i).toString();
                        break;
                    case 5:
                        qtdePag = livro1.getValueAt(row, i).toString();
                        break;
                    case 6:
                        exemplares = livro1.getValueAt(row, i).toString();
                        break;
                    case 7:
                        editora = livro1.getValueAt(row, i).toString();
                        break;
                    case 8:
                        isbn = livro1.getValueAt(row, i).toString();
                        break;
                    case 9:
                        codSetor = livro1.getValueAt(row, i).toString();
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            AlterarLivro alt = new AlterarLivro(null, true, codLivro, titulo, autor, dataLacamento, genero, qtdePag, exemplares, editora, isbn, codSetor);
            alt.setVisible(true);
            codLivro = alt.getCodLivro();
            titulo = alt.getTitulo();
            autor = alt.getAutor();
            dataLacamento = alt.getDataLacamento();
            genero = alt.getGenero();
            qtdePag = alt.getQtdePag();
            exemplares = alt.getExemplares();
            editora = alt.getEditora();
            isbn = alt.getIsbn();
            codSetor = alt.getCodSetor();
            //Faz sentido mudar o cod setor?
            try {
                if (codLivro.equals("") == false) {
                    sql = "update livro set Titulo='" + titulo + "',Nome_Autor='" + autor + "',Data_Lancamento='" + dataLacamento + "',Genero='" + genero + "',Qtde_Pagina='" + qtdePag + "',Exemplares='" + exemplares + "',Editora='" + editora + "',ISBN='" + isbn + "',Cod_Setor='" + codSetor + "' where Cod_Livro = " + codLivro;
                    msg = "Alteração de registro";
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from livro order by Cod_Livro");
                    preencherTabela();
                }
            } catch (Exception errosql) {
                JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        @Override
        public void Deletar(int row, int column) {
            codLivro = livro1.getValueAt(row, 0).toString();
            String sql="";
            if (livro1.isEditing()) {
                livro1.getCellEditor().stopCellEditing();
            }
            try {
                int opcao;
                Object [] botoes = {"Sim","Não"};
                opcao = JOptionPane.showOptionDialog(null, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
                if(opcao==JOptionPane.YES_OPTION){
                    sql = "delete from livro where Cod_Livro = " + codLivro;
                    int excluir = con_cliente.statement.executeUpdate(sql);
                    if (excluir==1){
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.executaSQL("select * from livro order by Cod_Livro");
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
        livro1.getColumnModel().getColumn(0);
        livro1.getColumnModel().getColumn(1);
        livro1.getColumnModel().getColumn(2);
        livro1.getColumnModel().getColumn(3);
        livro1.getColumnModel().getColumn(4);
        livro1.getColumnModel().getColumn(5);
        livro1.getColumnModel().getColumn(6);
        livro1.getColumnModel().getColumn(7);
        livro1.getColumnModel().getColumn(8);
        livro1.getColumnModel().getColumn(9);
        livro1.getColumnModel().getColumn(10).setCellRenderer(new RenderizaAcao());
        livro1.getColumnModel().getColumn(10).setCellEditor(new RenderizacaoBtnAcao(event));
        
        DefaultTableModel modelo = (DefaultTableModel) livro1.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("Cod_Livro"),
                    con_cliente.resultset.getString("Titulo"),
                    con_cliente.resultset.getString("Nome_Autor"),
                    con_cliente.resultset.getString("Data_Lancamento"),
                    con_cliente.resultset.getString("Genero"),
                    con_cliente.resultset.getString("Qtde_Pagina"),
                    con_cliente.resultset.getString("Exemplares"),
                    con_cliente.resultset.getString("Editora"),
                    con_cliente.resultset.getString("ISBN"),
                    con_cliente.resultset.getString("Cod_Setor")
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
        livro1 = new tabelas.Tabela();
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

        jLabel1.setText("Tabela Livro");

        livro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod_Livro", "Titulo", "Autor", "Data_Lancamento", "Genero", "Qtde_Pagina", "Exemplares", "Editora", "ISBN", "Cod_Setor", "Ação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        livro1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(livro1);
        if (livro1.getColumnModel().getColumnCount() > 0) {
            livro1.getColumnModel().getColumn(0).setPreferredWidth(50);
            livro1.getColumnModel().getColumn(1).setPreferredWidth(140);
            livro1.getColumnModel().getColumn(2).setPreferredWidth(100);
            livro1.getColumnModel().getColumn(6).setPreferredWidth(70);
            livro1.getColumnModel().getColumn(10).setPreferredWidth(110);
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

        jLabel2.setText("Titulo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNovoRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
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
        NovoRegistroLivro nr = new NovoRegistroLivro(null, true);
        nr.setVisible(true);
        codLivro = nr.getCodLivro();
        titulo = nr.getTitulo();
        autor = nr.getAutor();
        dataLacamento = nr.getDataLacamento();
        genero = nr.getGenero();
        qtdePag = nr.getQtdePag();
        exemplares = nr.getExemplares();
        editora = nr.getEditora();
        isbn = nr.getIsbn();
        codSetor = nr.getCodSetor();
        
        try {
            if (titulo != "" && autor !="" && dataLacamento !="" && genero !="" && qtdePag !="" && exemplares !="" && editora !="" && isbn !="" && codSetor !="") {
                String insert_sql = "insert into livro (Titulo,Nome_Autor,Data_Lancamento,Genero,Qtde_Pagina,Exemplares,Editora,ISBN,Cod_Setor) values ('" + titulo + "', '" + autor + "', '" + dataLacamento + "', '" + genero + "', '" + qtdePag + "', '" + exemplares + "', '" + editora + "', '" + isbn + "', '" + codSetor + "')";
                con_cliente.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                con_cliente.executaSQL("select * from livro order by Cod_Livro");
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
        try {
                String pesquisa = "select * from livro where Titulo like '" + barraPesquisa.getText() + "%'";
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private tabelas.Tabela livro1;
    // End of variables declaration//GEN-END:variables
}
