/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;

import conexao.Conexao;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Santos
 */
public class Login extends javax.swing.JFrame {
        Conexao con_cliente;
        Usuario usuario = new Usuario();
  
    public Login() {
        initComponents();
        con_cliente = new Conexao(); 
        con_cliente.conecta(); 
        ImageIcon icone = new ImageIcon("src/img/logoicon.png");
        setIconImage(icone.getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        Esquerda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        Direita = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        JPanel1.setBackground(new java.awt.Color(48, 145, 144));
        JPanel1.setForeground(new java.awt.Color(255, 255, 255));
        JPanel1.setName(""); // NOI18N
        JPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        JPanel1.setLayout(null);

        Esquerda.setBackground(new java.awt.Color(255, 255, 255));
        Esquerda.setMinimumSize(new java.awt.Dimension(400, 500));
        Esquerda.setName(""); // NOI18N
        Esquerda.setPreferredSize(new java.awt.Dimension(400, 500));
        Esquerda.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");
        Esquerda.add(jLabel1);
        jLabel1.setBounds(140, 10, 120, 100);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        Esquerda.add(txtEmail);
        txtEmail.setBounds(30, 150, 340, 30);
        Esquerda.add(txtSenha);
        txtSenha.setBounds(30, 220, 340, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");
        Esquerda.add(jLabel2);
        jLabel2.setBounds(30, 190, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email:");
        Esquerda.add(jLabel3);
        jLabel3.setBounds(30, 120, 60, 20);

        jButton1.setBackground(new java.awt.Color(230, 118, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Crie uma conta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Esquerda.add(jButton1);
        jButton1.setBounds(90, 380, 200, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Não tem uma conta? Faça Já!");
        Esquerda.add(jLabel5);
        jLabel5.setBounds(100, 350, 230, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("É Administrador?  Entre Aqui!");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        Esquerda.add(jLabel4);
        jLabel4.setBounds(70, 450, 250, 25);

        btnLogin.setBackground(new java.awt.Color(58, 174, 173));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        Esquerda.add(btnLogin);
        btnLogin.setBounds(140, 290, 110, 30);

        JPanel1.add(Esquerda);
        Esquerda.setBounds(0, 0, 400, 500);

        Direita.setBackground(new java.awt.Color(48, 145, 144));
        Direita.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N

        jLabel8.setText("© 2024  BlibioOH®. Todos os direitos reservados");

        javax.swing.GroupLayout DireitaLayout = new javax.swing.GroupLayout(Direita);
        Direita.setLayout(DireitaLayout);
        DireitaLayout.setHorizontalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DireitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(72, 72, 72))
            .addGroup(DireitaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DireitaLayout.setVerticalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel1.add(Direita);
        Direita.setBounds(400, 0, 478, 483);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CriarConta CriarContaFrame = new CriarConta();
        CriarContaFrame.setVisible(true);
        CriarContaFrame.pack();
        CriarContaFrame.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    try {
    // Inicializa a conexão com o banco de dados
   
    // Query para buscar o usuário na tabela 'usuario' com base no email e senha
    String pesquisa = "SELECT * FROM usuario "
                    + "WHERE Email = '" + txtEmail.getText() + "' "
                    + "AND Senha = '" + new String(txtSenha.getPassword()) + "'";

    // Executa a query
    con_cliente.executaSQL(pesquisa);

    if (con_cliente.resultset.first()) {
        
       try{
            con_cliente.executaSQL("select * from usuario where Email like '" + txtEmail.getText() + "'");
            con_cliente.resultset.next();

            usuario.setId(con_cliente.resultset.getString("Id_Usuario"));
            usuario.setNome(con_cliente.resultset.getString("Nome"));
            usuario.setEndereco(con_cliente.resultset.getString("Endereco"));
            usuario.setRg(con_cliente.resultset.getString("RG"));
            usuario.setCpf(con_cliente.resultset.getString("CPF"));
            usuario.setTelefone(con_cliente.resultset.getString("Telefone"));
            usuario.setEmail(con_cliente.resultset.getString("Email"));
            usuario.setSenha(con_cliente.resultset.getString("Senha"));
           
            
        } 
        catch (SQLException erroSql) {
            // Exibe mensagem de erro caso haja exceção de SQL
            JOptionPane.showMessageDialog(null, "Erro ao Listar os dados!\n" + erroSql, "Mensagem do Programa", JOptionPane.ERROR_MESSAGE);
        }
        // Acesso permitido: abre a tela do administrador
        PageInicialUser mostra = new PageInicialUser(usuario);
        mostra.setVisible(true);
        dispose(); // Fecha a janela de login     c
    } else {
        // Caso não encontre o usuário ou a senha estejam errados
        JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (SQLException erroSql) {
    // Exibe mensagem de erro caso haja exceção de SQL
    JOptionPane.showMessageDialog(null, "Erro ao acessar os dados!\n" + erroSql, "Mensagem do Programa", JOptionPane.ERROR_MESSAGE);
}



    }//GEN-LAST:event_btnLoginActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        Font font = jLabel4.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel4.setFont(font.deriveFont(attributes));
        jLabel4.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jLabel4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        LoginAdmin LoginAdminFrame = new LoginAdmin();
        LoginAdminFrame.setVisible(true);
        LoginAdminFrame.pack();
        LoginAdminFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Direita;
    private javax.swing.JPanel Esquerda;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
