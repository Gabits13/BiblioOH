package biblioteca;

import conexao.Conexao;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
=======
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
import javaswingdev.drawer.Drawer; 
import javaswingdev.drawer.DrawerController; 
import javaswingdev.drawer.DrawerItem; 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
<<<<<<< HEAD
import javax.swing.JOptionPane;
import tabelas.*;
=======
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6



/**
 *
<<<<<<< HEAD
 * @author Gabriel Santos
 */
public class PageInicialAdmin extends javax.swing.JFrame {

         Conexao con_cliente;
        
   private DrawerController drawer;
   
   SobreNos sobreNos = new SobreNos();
   
   TabelaFuncionario tabelaFuncionario = new TabelaFuncionario();
   TabelaLivro tabelaLivro = new TabelaLivro();
   TabelaEmprestimo tabelaEmprestimo = new TabelaEmprestimo();
   TabelaUsuario tabelaUsuario = new TabelaUsuario();
   TabelaPeriodo tabelaPeriodo = new TabelaPeriodo();
   TabelaCargo tabelaCargo = new TabelaCargo();
   TabelaSetor tabelaSetor = new TabelaSetor();
   TabelaAdministrador tabelaAdministrador = new TabelaAdministrador();
   TabelaAdministrarLivro tabelaAdministrarLivro = new TabelaAdministrarLivro();
   
=======
 * @author Admin
 */
public class PageInicialAdmin extends javax.swing.JFrame {

      Conexao con_cliente;
        
   private DrawerController drawer;
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
    public PageInicialAdmin() {
      
       
        
        initComponents();
<<<<<<< HEAD
        ImageIcon icone = new ImageIcon("src/img/logoicon.png");
        setIconImage(icone.getImage());

=======
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
        drawer=Drawer.newDrawer(this)
                .header(new Header())
                .background(new Color(255,255,255))
                .backgroundTransparent(0.0f)
                .drawerBackground(new Color(48,145,144))
<<<<<<< HEAD
                .drawerWidth(280)
                .closeOnPress(false)
                .addChild(home)
                .addChild(usuarios)
                .addChild(livro)
                .addChild(funcionario)
                .addChild(administrador)
                .addChild(adLivro)
                .addChild(emprestimos)
                .addChild(cargos)
                .addChild(periodo)
                .addChild(setores)
                .addChild(sobrenos)
                .addChild(sair)
                
                .build();  
        
        
        
         drawer.show();
         
        main.add(tabelaFuncionario);
        main.add(tabelaLivro);
        main.add(tabelaEmprestimo);
        main.add(tabelaUsuario);
        main.add(tabelaPeriodo);
        main.add(tabelaCargo);
        main.add(tabelaSetor);
        main.add(tabelaAdministrador);
        main.add(tabelaAdministrarLivro);
        main.add(sobreNos);
        
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
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
        periodo02.setText("Tabela Periodo");
        cargos02.setText("Tabela Cargo");
        setores02.setText("Tabela Setor");
        administrador02.setText("Tabela Administrador");
        adLivro02.setText("Tabela administra_livro");
        
        sair02.setText("Sair");
=======
                .drawerWidth(300)
                .closeOnPress(false)
             .addChild(new DrawerItem("Página Inicial").icon(new ImageIcon(getClass().getResource("/img/homeheader.png"))).build())
                .addChild(new DrawerItem("Meu Perfil").icon(new ImageIcon(getClass().getResource("/img/perfilheader.png"))).build())
                .addChild(new DrawerItem("Usuários").icon(new ImageIcon(getClass().getResource("/img/userheader.png"))).build())
                .addChild(new DrawerItem("Funcionários").icon(new ImageIcon(getClass().getResource("/img/funcheader.png"))).build())
                .addChild(new DrawerItem("Livros").icon(new ImageIcon(getClass().getResource("/img/livroheader.png"))).build())
                .addChild(new DrawerItem("Administrar Livros").icon(new ImageIcon(getClass().getResource("/img/adlivroheader.png"))).build())
                .addChild(new DrawerItem("Empréstimos").icon(new ImageIcon(getClass().getResource("/img/emprestimoheader.png"))).build())
                .addChild(new DrawerItem("Cargos").icon(new ImageIcon(getClass().getResource("/img/cargoheader.png"))).build())
                .addChild(new DrawerItem("Período").icon(new ImageIcon(getClass().getResource("/img/periodoheader.png"))).build())
                .addChild(new DrawerItem("Setores").icon(new ImageIcon(getClass().getResource("/img/setorheader.png"))).build())
                .addChild(new DrawerItem("Sobre Nós").icon(new ImageIcon(getClass().getResource("/img/sobrenosheader.png"))).build())
                
                .addFooter(new DrawerItem("Sair").icon(new ImageIcon(getClass().getResource("/img/sairheader.png"))).build())
                
                .build();  
         drawer.show();
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        periodo = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        livro = new javax.swing.JButton();
        funcionario = new javax.swing.JButton();
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
        administrador02 = new javax.swing.JMenuItem();
        livro02 = new javax.swing.JMenuItem();
        usuario02 = new javax.swing.JMenuItem();
        emprestimo02 = new javax.swing.JMenuItem();
        periodo02 = new javax.swing.JMenuItem();
        cargos02 = new javax.swing.JMenuItem();
        setores02 = new javax.swing.JMenuItem();
        adLivro02 = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        sobrenos02 = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        sair02 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main = new javax.swing.JLayeredPane();
        imgHome = new javax.swing.JLabel();

        periodo.setBackground(new java.awt.Color(48, 145, 144));
        periodo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        periodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/periodoheader.png"))); // NOI18N
        periodo.setText("Período");
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
        livro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        livro.setName("livro"); // NOI18N
        livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livroActionPerformed(evt);
            }
        });

        funcionario.setBackground(new java.awt.Color(48, 145, 144));
        funcionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcheader.png"))); // NOI18N
        funcionario.setText("Funcionário");
        funcionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });

        sobrenos.setBackground(new java.awt.Color(48, 145, 144));
        sobrenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sobrenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobrenosheader.png"))); // NOI18N
        sobrenos.setText("Sobre Nós");
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
        setores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setoresActionPerformed(evt);
            }
        });

        administrador.setBackground(new java.awt.Color(48, 145, 144));
        administrador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfilheader.png"))); // NOI18N
        administrador.setText("Administradores");
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

        administrador02.setText("jMenuItem1");
        administrador02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrador02ActionPerformed(evt);
            }
        });
        popup.add(administrador02);

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

        periodo02.setText("jMenuItem1");
        periodo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodo02ActionPerformed(evt);
            }
        });
        popup.add(periodo02);

        cargos02.setText("jMenuItem1");
        cargos02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargos02ActionPerformed(evt);
            }
        });
        popup.add(cargos02);

        setores02.setText("jMenuItem1");
        setores02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setores02ActionPerformed(evt);
            }
        });
        popup.add(setores02);

        adLivro02.setText("jMenuItem1");
        adLivro02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adLivro02ActionPerformed(evt);
            }
        });
        popup.add(adLivro02);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Inicial");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 145, 144));
=======
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Inicial");
        setPreferredSize(new java.awt.Dimension(1200, 900));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6

        jPanel2.setBackground(new java.awt.Color(48, 145, 144));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoheader.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(711, Short.MAX_VALUE)
=======
                .addContainerGap(807, Short.MAX_VALUE)
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
                .addComponent(jLabel1)
                .addGap(405, 405, 405))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

<<<<<<< HEAD
        main.setMaximumSize(new java.awt.Dimension(900, 800));
        main.setMinimumSize(new java.awt.Dimension(900, 800));
        main.setLayout(new java.awt.CardLayout());

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blibiotecaimg.jpg"))); // NOI18N
        main.add(imgHome, "card2");

=======
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                .addGap(0, 688, Short.MAX_VALUE))
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoActionPerformed
        tabelaPeriodo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_periodoActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        tabelaUsuario.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_usuariosActionPerformed

    private void livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livroActionPerformed
        tabelaLivro.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_livroActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        tabelaFuncionario.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_funcionarioActionPerformed

    private void cargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargosActionPerformed
        tabelaCargo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_cargosActionPerformed

    private void sobrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenosActionPerformed
        sobreNos.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_sobrenosActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        imgHome.setVisible(true);
        
        tabelaFuncionario.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void emprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimosActionPerformed
        tabelaEmprestimo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_emprestimosActionPerformed

    private void adLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adLivroActionPerformed
        tabelaAdministrarLivro.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaSetor.setVisible(false);
    }//GEN-LAST:event_adLivroActionPerformed

    private void setoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setoresActionPerformed
        tabelaSetor.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_setoresActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        int opcao;
        Object [] botoes = {"Sim","Não"};
        opcao = JOptionPane.showOptionDialog(null, "Deseja fechar o programa: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_sairActionPerformed

    // Códificação dos botõe do JPopupMenu.
    private void sair02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair02ActionPerformed
        int opcao;
        Object [] botoes = {"Sim","Não"};
        opcao = JOptionPane.showOptionDialog(null, "Deseja fechar o programa: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_sair02ActionPerformed

    private void funcionario02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionario02ActionPerformed
        tabelaFuncionario.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_funcionario02ActionPerformed

    private void livro02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livro02ActionPerformed
        tabelaLivro.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_livro02ActionPerformed

    private void emprestimo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimo02ActionPerformed
        tabelaEmprestimo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_emprestimo02ActionPerformed

    private void usuario02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario02ActionPerformed
        tabelaUsuario.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_usuario02ActionPerformed

    // Botão do Dashboard.
    private void administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorActionPerformed
        tabelaAdministrador.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_administradorActionPerformed
    
    // De volta pros botões do popUP.
    private void sobrenos02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenos02ActionPerformed
        sobreNos.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_sobrenos02ActionPerformed

    private void home02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home02ActionPerformed
        imgHome.setVisible(true);
        
        tabelaFuncionario.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_home02ActionPerformed

    private void cargos02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargos02ActionPerformed
        tabelaCargo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_cargos02ActionPerformed

    private void periodo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodo02ActionPerformed
        tabelaPeriodo.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        sobreNos.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaUsuario.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_periodo02ActionPerformed

    private void setores02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setores02ActionPerformed
        tabelaSetor.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_setores02ActionPerformed

    private void administrador02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administrador02ActionPerformed
        tabelaAdministrador.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaSetor.setVisible(false);
        tabelaAdministrarLivro.setVisible(false);
    }//GEN-LAST:event_administrador02ActionPerformed

    private void adLivro02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adLivro02ActionPerformed
        tabelaAdministrarLivro.setVisible(true);
        
        imgHome.setVisible(false);
        tabelaFuncionario.setVisible(false);
        tabelaLivro.setVisible(false);
        tabelaUsuario.setVisible(false);
        sobreNos.setVisible(false);
        tabelaPeriodo.setVisible(false);
        tabelaCargo.setVisible(false);
        tabelaEmprestimo.setVisible(false);
        tabelaAdministrador.setVisible(false);
        tabelaSetor.setVisible(false);
    }//GEN-LAST:event_adLivro02ActionPerformed

    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adLivro;
    private javax.swing.JMenuItem adLivro02;
    private javax.swing.JButton administrador;
    private javax.swing.JMenuItem administrador02;
    private javax.swing.JButton cargos;
    private javax.swing.JMenuItem cargos02;
    private javax.swing.JMenuItem emprestimo02;
    private javax.swing.JButton emprestimos;
    private javax.swing.JButton funcionario;
    private javax.swing.JMenuItem funcionario02;
    private javax.swing.JButton home;
    private javax.swing.JMenuItem home02;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton livro;
    private javax.swing.JMenuItem livro02;
    private javax.swing.JLayeredPane main;
    private javax.swing.JButton periodo;
    private javax.swing.JMenuItem periodo02;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JButton sair;
    private javax.swing.JMenuItem sair02;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JButton setores;
    private javax.swing.JMenuItem setores02;
    private javax.swing.JButton sobrenos;
    private javax.swing.JMenuItem sobrenos02;
    private javax.swing.JMenuItem usuario02;
    private javax.swing.JButton usuarios;
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 PageInicialAdmin PageInicialFrame = new PageInicialAdmin();
                 PageInicialFrame.setVisible(true);
                 PageInicialFrame.pack();
                 PageInicialFrame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6
    // End of variables declaration//GEN-END:variables
}
