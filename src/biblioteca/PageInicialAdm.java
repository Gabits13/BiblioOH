package biblioteca;

import conexao.Conexao;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javaswingdev.drawer.Drawer; 
import javaswingdev.drawer.DrawerController; 
import javaswingdev.drawer.DrawerItem; 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import tabelas.*;
import JanelasModais.*;


/**
 *
 * @author Gabriel Santos
 */

//pagina para usuario ainda nao concluida
public class PageInicialAdm extends javax.swing.JFrame {
       Conexao con_cliente;
  

        
   private DrawerController drawer;
   
   SobreNos sobreNos = new SobreNos();
   TabelaFuncionario tabelaFuncionario = new TabelaFuncionario();
   TabelaLivro tabelaLivro = new TabelaLivro();
   TabelaEmprestimo tabelaEmprestimo = new TabelaEmprestimo();
   TabelaUsuario tabelaUsuario = new TabelaUsuario();
   
    public PageInicialAdm(Funcionario f) {
      
   
        initComponents();
        ImageIcon icone = new ImageIcon("src/img/logoicon.png");
        setIconImage(icone.getImage());

        drawer=Drawer.newDrawer(this)
                 .header(new HeaderFunc(f))
                .background(new Color(255,255,255))
                .backgroundTransparent(0.0f)
                .drawerBackground(new Color(48,145,144))
                .drawerWidth(300)
                .closeOnPress(false)
                .addChild(home)
                .addChild(usuarios)
                .addChild(livro)
                .addChild(funcionario)
                .addChild(adLivro)
                .addChild(emprestimos)
                .addChild(cargos)
                .addChild(periodo)
                .addChild(setores)
                .addChild(sobrenos)
                .addChild(sair)
                
                .build();  
        
        
        
         drawer.show();
         
   
   
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        
        
        // Pequeno código do JPopupMenu.
        jPanel1.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
                if(e.isPopupTrigger())
                    popup.show(e.getComponent(),e.getX(),e.getY()
                ); 
            }});  
        home02.setText("Tela Inicial");
        livro02.setText("Tabela Livro");
        funcionario02.setText("Tabela Funcionario");
        usuario02.setText("Tabela Usuario");
        sobrenos02.setText("Formulário dos Desenvolvedores");
        emprestimo02.setText("Tabela Emprestimo");
        
        sair02.setText("Sair");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcionario = new javax.swing.JButton();
        periodo = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        livro = new javax.swing.JButton();
        sobrenos = new javax.swing.JButton();
        cargos = new javax.swing.JButton();
        home = new javax.swing.JButton();
        emprestimos = new javax.swing.JButton();
        adLivro = new javax.swing.JButton();
        setores = new javax.swing.JButton();
        administrador = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        popup = new javax.swing.JPopupMenu();
        home02 = new javax.swing.JMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        funcionario02 = new javax.swing.JMenuItem();
        livro02 = new javax.swing.JMenuItem();
        usuario02 = new javax.swing.JMenuItem();
        emprestimo02 = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        sobrenos02 = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        sair02 = new javax.swing.JMenuItem();
        periodo1 = new javax.swing.JButton();
        usuarios1 = new javax.swing.JButton();
        livro1 = new javax.swing.JButton();
        funcionario1 = new javax.swing.JButton();
        sobrenos1 = new javax.swing.JButton();
        cargos1 = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        emprestimos1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();

        funcionario.setBackground(new java.awt.Color(48, 145, 144));
        funcionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcheader.png"))); // NOI18N
        funcionario.setText("Funcionário");
        funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        funcionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });

        periodo.setBackground(new java.awt.Color(48, 145, 144));
        periodo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        periodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/periodoheader.png"))); // NOI18N
        periodo.setText("Período");
        periodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        periodo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoActionPerformed(evt);
            }
        });

        usuarios.setBackground(new java.awt.Color(48, 145, 144));
        usuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userheader.png"))); // NOI18N
        usuarios.setText("Usuarios");
        usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });

        livro.setBackground(new java.awt.Color(48, 145, 144));
        livro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        livro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adlivroheader.png"))); // NOI18N
        livro.setText("Livro");
        livro.setAlignmentY(2.0F);
        livro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        livro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        livro.setName("livro"); // NOI18N
        livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livroActionPerformed(evt);
            }
        });

        sobrenos.setBackground(new java.awt.Color(48, 145, 144));
        sobrenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sobrenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobrenosheader.png"))); // NOI18N
        sobrenos.setText("Sobre Nós");
        sobrenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sobrenos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sobrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenosActionPerformed(evt);
            }
        });

        cargos.setBackground(new java.awt.Color(48, 145, 144));
        cargos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargoheader.png"))); // NOI18N
        cargos.setText("Cargos");
        cargos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargosActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(48, 145, 144));
        home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeheader.png"))); // NOI18N
        home.setText("Tela Inicial");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        emprestimos.setBackground(new java.awt.Color(48, 145, 144));
        emprestimos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emprestimoheader.png"))); // NOI18N
        emprestimos.setText("Empréstimos");
        emprestimos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emprestimos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimosActionPerformed(evt);
            }
        });

        adLivro.setBackground(new java.awt.Color(48, 145, 144));
        adLivro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adlivroheader.png"))); // NOI18N
        adLivro.setText("Administrar Livro");
        adLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adLivroActionPerformed(evt);
            }
        });

        setores.setBackground(new java.awt.Color(48, 145, 144));
        setores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setorheader.png"))); // NOI18N
        setores.setText("Setores");
        setores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setoresActionPerformed(evt);
            }
        });

        administrador.setBackground(new java.awt.Color(48, 145, 144));
        administrador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/periodoheader.png"))); // NOI18N
        administrador.setText("Administradores");
        administrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        administrador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(48, 145, 144));
        sair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sairheader.png"))); // NOI18N
        sair.setText("Sair");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        home02.setText("jMenuItem1");
        home02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home02ActionPerformed(evt);
            }
        });
        popup.add(home02);
        popup.add(separador2);

        funcionario02.setText("jMenuItem1");
        funcionario02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionario02ActionPerformed(evt);
            }
        });
        popup.add(funcionario02);

        livro02.setText("jMenuItem1");
        livro02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livro02ActionPerformed(evt);
            }
        });
        popup.add(livro02);

        usuario02.setText("jMenuItem1");
        usuario02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario02ActionPerformed(evt);
            }
        });
        popup.add(usuario02);

        emprestimo02.setText("jMenuItem1");
        emprestimo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimo02ActionPerformed(evt);
            }
        });
        popup.add(emprestimo02);
        popup.add(separador1);

        sobrenos02.setText("jMenuItem1");
        sobrenos02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenos02ActionPerformed(evt);
            }
        });
        popup.add(sobrenos02);
        popup.add(separador);

        sair02.setText("jMenuItem1");
        sair02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair02ActionPerformed(evt);
            }
        });
        popup.add(sair02);

        periodo1.setBackground(new java.awt.Color(48, 145, 144));
        periodo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        periodo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/periodoheader.png"))); // NOI18N
        periodo1.setText("Período");
        periodo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        periodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodo1ActionPerformed(evt);
            }
        });

        usuarios1.setBackground(new java.awt.Color(48, 145, 144));
        usuarios1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userheader.png"))); // NOI18N
        usuarios1.setText("Usuarios");
        usuarios1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarios1ActionPerformed(evt);
            }
        });

        livro1.setBackground(new java.awt.Color(48, 145, 144));
        livro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        livro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adlivroheader.png"))); // NOI18N
        livro1.setText("Livro");
        livro1.setAlignmentY(2.0F);
        livro1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        livro1.setName("livro"); // NOI18N
        livro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livro1ActionPerformed(evt);
            }
        });

        funcionario1.setBackground(new java.awt.Color(48, 145, 144));
        funcionario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        funcionario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcheader.png"))); // NOI18N
        funcionario1.setText("Funcionário");
        funcionario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        funcionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionario1ActionPerformed(evt);
            }
        });

        sobrenos1.setBackground(new java.awt.Color(48, 145, 144));
        sobrenos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sobrenos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobrenosheader.png"))); // NOI18N
        sobrenos1.setText("Sobre Nós");
        sobrenos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sobrenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenos1ActionPerformed(evt);
            }
        });

        cargos1.setBackground(new java.awt.Color(48, 145, 144));
        cargos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cargos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargoheader.png"))); // NOI18N
        cargos1.setText("Cargos");
        cargos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cargos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargos1ActionPerformed(evt);
            }
        });

        home1.setBackground(new java.awt.Color(48, 145, 144));
        home1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeheader.png"))); // NOI18N
        home1.setText("Tela Inicial");
        home1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        emprestimos1.setBackground(new java.awt.Color(48, 145, 144));
        emprestimos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emprestimos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emprestimoheader.png"))); // NOI18N
        emprestimos1.setText("Empréstimos");
        emprestimos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emprestimos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimos1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Inicial");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 145, 144));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(48, 145, 144));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoheader.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(392, 392, 392))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blibiotecaimg.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 301, Short.MAX_VALUE)
                .addComponent(imgHome))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgHome))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
         tabelaFuncionario.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        
    }//GEN-LAST:event_funcionarioActionPerformed

    private void periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
       tabelaUsuario.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_usuariosActionPerformed

    private void livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livroActionPerformed
         tabelaLivro.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_livroActionPerformed

    private void sobrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenosActionPerformed
         sobreNos.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaFuncionario.setVisible(false);
    }//GEN-LAST:event_sobrenosActionPerformed

    private void cargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargosActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        imgHome.setVisible(true);
        
        tabelaFuncionario.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void emprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimosActionPerformed
          tabelaEmprestimo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false); 
    }//GEN-LAST:event_emprestimosActionPerformed

    private void adLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adLivroActionPerformed

    private void setoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setoresActionPerformed

    private void administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_administradorActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar a janela", "Sair", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_sairActionPerformed

    private void home02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home02ActionPerformed
        imgHome.setVisible(true);

        tabelaFuncionario.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_home02ActionPerformed

    private void funcionario02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionario02ActionPerformed
        tabelaFuncionario.setVisible(true);

        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_funcionario02ActionPerformed

    private void livro02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livro02ActionPerformed
        tabelaLivro.setVisible(true);

        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_livro02ActionPerformed

    private void usuario02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario02ActionPerformed
        tabelaUsuario.setVisible(true);

        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_usuario02ActionPerformed

    private void emprestimo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimo02ActionPerformed
        tabelaEmprestimo.setVisible(true);

        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
    }//GEN-LAST:event_emprestimo02ActionPerformed

    private void sobrenos02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenos02ActionPerformed
        sobreNos.setVisible(true);

        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaFuncionario.setVisible(false);
    }//GEN-LAST:event_sobrenos02ActionPerformed

    private void sair02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair02ActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar a janela", "Sair", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_sair02ActionPerformed

    private void periodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodo1ActionPerformed

    private void usuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarios1ActionPerformed

    private void livro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_livro1ActionPerformed

    private void funcionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionario1ActionPerformed

    private void sobrenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenos1ActionPerformed

    private void cargos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargos1ActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home1ActionPerformed

    private void emprestimos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emprestimos1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adLivro;
    private javax.swing.JButton administrador;
    private javax.swing.JButton cargos;
    private javax.swing.JButton cargos1;
    private javax.swing.JMenuItem emprestimo02;
    private javax.swing.JButton emprestimos;
    private javax.swing.JButton emprestimos1;
    private javax.swing.JButton funcionario;
    private javax.swing.JMenuItem funcionario02;
    private javax.swing.JButton funcionario1;
    private javax.swing.JButton home;
    private javax.swing.JMenuItem home02;
    private javax.swing.JButton home1;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton livro;
    private javax.swing.JMenuItem livro02;
    private javax.swing.JButton livro1;
    private javax.swing.JButton periodo;
    private javax.swing.JButton periodo1;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JButton sair;
    private javax.swing.JMenuItem sair02;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JButton setores;
    private javax.swing.JButton sobrenos;
    private javax.swing.JMenuItem sobrenos02;
    private javax.swing.JButton sobrenos1;
    private javax.swing.JMenuItem usuario02;
    private javax.swing.JButton usuarios;
    private javax.swing.JButton usuarios1;
    // End of variables declaration//GEN-END:variables
}
