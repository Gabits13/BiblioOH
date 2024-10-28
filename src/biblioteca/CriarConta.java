package biblioteca;

import conexao.Conexao;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Santos
 */
public class CriarConta extends javax.swing.JFrame {

     Conexao con_cliente;
   
    public CriarConta() {
        initComponents();
        Conexao con_cliente = new Conexao(); // Certifique-se de que isso está configurado corretamente
        con_cliente.conecta();  // Certifique-se de que sua classe Conexao tem um método conectar()
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        Esquerda = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnFazerLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCriar = new javax.swing.JButton();
        txtNomeCompleto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        Esquerda1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        btnFazerLogin1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnCriar1 = new javax.swing.JButton();
        txtNomeCompleto1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG1 = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        Direita = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        JPanel1.setBackground(new java.awt.Color(48, 145, 144));
        JPanel1.setForeground(new java.awt.Color(255, 255, 255));
        JPanel1.setName(""); // NOI18N
        JPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        JPanel1.setLayout(null);

        Esquerda.setBackground(new java.awt.Color(255, 255, 255));
        Esquerda.setMinimumSize(new java.awt.Dimension(400, 500));
        Esquerda.setName(""); // NOI18N
        Esquerda.setPreferredSize(new java.awt.Dimension(400, 500));
        Esquerda.setLayout(null);
        Esquerda.add(txtSenha);
        txtSenha.setBounds(30, 200, 340, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");
        Esquerda.add(jLabel2);
        jLabel2.setBounds(30, 170, 60, 20);

        btnFazerLogin.setBackground(new java.awt.Color(230, 118, 0));
        btnFazerLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFazerLogin.setText("Fazer Login");
        btnFazerLogin.setToolTipText("");
        btnFazerLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFazerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerLoginActionPerformed(evt);
            }
        });
        Esquerda.add(btnFazerLogin);
        btnFazerLogin.setBounds(100, 720, 200, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Já tem uma conta? Acesse aqui!");
        Esquerda.add(jLabel5);
        jLabel5.setBounds(100, 690, 230, 30);

        btnCriar.setBackground(new java.awt.Color(58, 174, 173));
        btnCriar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCriar.setText("Criar");
        btnCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });
        Esquerda.add(btnCriar);
        btnCriar.setBounds(140, 650, 110, 30);

        txtNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompletoActionPerformed(evt);
            }
        });
        Esquerda.add(txtNomeCompleto);
        txtNomeCompleto.setBounds(30, 280, 340, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome Completo:");
        Esquerda.add(jLabel4);
        jLabel4.setBounds(30, 250, 140, 20);

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        Esquerda.add(txtEndereco);
        txtEndereco.setBounds(30, 360, 340, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Endereço:");
        Esquerda.add(jLabel6);
        jLabel6.setBounds(30, 330, 60, 20);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setToolTipText("No final do email use: @blibiooh.com");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        Esquerda.add(txtEmail);
        txtEmail.setBounds(30, 130, 340, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email:");
        Esquerda.add(jLabel9);
        jLabel9.setBounds(30, 100, 60, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("RG:");
        Esquerda.add(jLabel10);
        jLabel10.setBounds(30, 410, 60, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("CPF:");
        Esquerda.add(jLabel11);
        jLabel11.setBounds(30, 480, 60, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Telefone:");
        Esquerda.add(jLabel12);
        jLabel12.setBounds(30, 560, 60, 20);

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });
        Esquerda.add(txtRG);
        txtRG.setBounds(30, 440, 340, 30);

        Esquerda1.setBackground(new java.awt.Color(255, 255, 255));
        Esquerda1.setMinimumSize(new java.awt.Dimension(400, 500));
        Esquerda1.setName(""); // NOI18N
        Esquerda1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("CRIAR CONTA");
        Esquerda1.add(jLabel7);
        jLabel7.setBounds(80, 10, 260, 100);
        Esquerda1.add(txtSenha1);
        txtSenha1.setBounds(30, 200, 340, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Senha:");
        Esquerda1.add(jLabel13);
        jLabel13.setBounds(30, 170, 60, 20);

        btnFazerLogin1.setBackground(new java.awt.Color(230, 118, 0));
        btnFazerLogin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFazerLogin1.setText("Fazer Login");
        btnFazerLogin1.setToolTipText("");
        btnFazerLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerLogin1ActionPerformed(evt);
            }
        });
        Esquerda1.add(btnFazerLogin1);
        btnFazerLogin1.setBounds(100, 720, 200, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Já tem uma conta? Acesse aqui!");
        Esquerda1.add(jLabel14);
        jLabel14.setBounds(100, 690, 230, 30);

        btnCriar1.setBackground(new java.awt.Color(58, 174, 173));
        btnCriar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCriar1.setText("Criar");
        btnCriar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriar1ActionPerformed(evt);
            }
        });
        Esquerda1.add(btnCriar1);
        btnCriar1.setBounds(140, 650, 110, 30);

        txtNomeCompleto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeCompleto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompleto1ActionPerformed(evt);
            }
        });
        Esquerda1.add(txtNomeCompleto1);
        txtNomeCompleto1.setBounds(30, 280, 340, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nome Completo:");
        Esquerda1.add(jLabel15);
        jLabel15.setBounds(30, 250, 140, 20);

        txtEndereco1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndereco1ActionPerformed(evt);
            }
        });
        Esquerda1.add(txtEndereco1);
        txtEndereco1.setBounds(30, 360, 340, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Endereço:");
        Esquerda1.add(jLabel16);
        jLabel16.setBounds(30, 330, 60, 20);

        txtEmail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });
        Esquerda1.add(txtEmail1);
        txtEmail1.setBounds(30, 130, 340, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Email:");
        Esquerda1.add(jLabel17);
        jLabel17.setBounds(30, 100, 60, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("RG:");
        Esquerda1.add(jLabel18);
        jLabel18.setBounds(30, 410, 60, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("CPF:");
        Esquerda1.add(jLabel19);
        jLabel19.setBounds(30, 480, 60, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Telefone:");
        Esquerda1.add(jLabel20);
        jLabel20.setBounds(30, 560, 60, 20);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Esquerda1.add(txtCPF);
        txtCPF.setBounds(30, 510, 340, 30);

        try {
            txtRG1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRG1ActionPerformed(evt);
            }
        });
        Esquerda1.add(txtRG1);
        txtRG1.setBounds(30, 440, 340, 30);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        Esquerda1.add(txtTelefone);
        txtTelefone.setBounds(30, 590, 340, 30);

        Esquerda.add(Esquerda1);
        Esquerda1.setBounds(0, 0, 400, 800);

        JPanel1.add(Esquerda);
        Esquerda.setBounds(0, 0, 400, 800);

        Direita.setBackground(new java.awt.Color(48, 145, 144));
        Direita.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N

        jLabel8.setText("© 2024  BiblioOH®. Todos os direitos reservados");

        javax.swing.GroupLayout DireitaLayout = new javax.swing.GroupLayout(Direita);
        Direita.setLayout(DireitaLayout);
        DireitaLayout.setHorizontalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DireitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DireitaLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1310, Short.MAX_VALUE))
        );
        DireitaLayout.setVerticalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPanel1.add(Direita);
        Direita.setBounds(400, 0, 400, 800);

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
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFazerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerLoginActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnFazerLoginActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
       
     try {
         
        // Coletando os dados do formulário
      
        String nome = txtNomeCompleto.getText();
        String endereco = txtEndereco.getText();
        String rg = txtRG.getText();
        String cpf = txtCPF.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText();
        String senha = new String(txtSenha.getPassword());
        
        // Validação de email: Verificar se termina com "@blibiooh.com"
        if (!email.endsWith("@blibiooh.com")) {
            throw new Exception("O email deve terminar com '@blibiooh.com'.");
        }

        // Validação de nome: Não pode conter números
        if (Pattern.compile("[0-9]").matcher(nome).find()) {
            throw new Exception("O nome completo não pode conter números.");
        }
        // Validação de CPF: Permitir números e os caracteres . - 
        if (!cpf.matches("[0-9.\\-]+")) {
            throw new Exception("O CPF deve conter apenas números e os caracteres '.', '-'");
        }

        // Validação de Telefone: Permitir números e os caracteres ( ) -
        if (!telefone.matches("[0-9 .()\\-]+")) {
            throw new Exception("O Telefone deve conter apenas números e os caracteres '(', ')', '-'");
        }

     
    Conexao con_cliente = new Conexao(); 
    con_cliente.conecta();  

    //  iniciando statement
    con_cliente.statement = con_cliente.conexao.createStatement();

    String insert_sql = "INSERT INTO usuario (Nome, Endereco, RG, CPF, Telefone, Email, Senha) "
        + "VALUES ('" + nome + "', '" + endereco + "', '" + rg + "', '" + cpf + "', '" + telefone + "', '" + email + "', '" + senha + "')";

    //comando SQL de inserção
    con_cliente.statement.executeUpdate(insert_sql); 


    JOptionPane.showMessageDialog(null, "Conta criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

       
        txtEmail.setText("");
        txtSenha.setText("");
        txtNomeCompleto.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtRG.setText("");
        txtCPF.setText("");

    } catch (Exception e) {
        // Exibindo mensagem de erro
        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_btnCriarActionPerformed

    private void txtNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCompletoActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void btnFazerLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFazerLogin1ActionPerformed

    private void btnCriar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriar1ActionPerformed

    private void txtNomeCompleto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompleto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCompleto1ActionPerformed

    private void txtEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndereco1ActionPerformed

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void txtRG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRG1ActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Direita;
    private javax.swing.JPanel Esquerda;
    private javax.swing.JPanel Esquerda1;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnCriar1;
    private javax.swing.JButton btnFazerLogin;
    private javax.swing.JButton btnFazerLogin1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JTextField txtNomeCompleto1;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtRG1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha1;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
