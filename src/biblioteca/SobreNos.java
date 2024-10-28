
package biblioteca;

/**
 *
 * @author Gabriel Santos
 */
public class SobreNos extends javax.swing.JPanel {


    public SobreNos() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSobre = new javax.swing.JLabel();
        imageAvatar3 = new biblioteca.ImageAvatar();
        imageAvatar4 = new biblioteca.ImageAvatar();
        imageAvatar7 = new biblioteca.ImageAvatar();
        imageAvatar8 = new biblioteca.ImageAvatar();
        imageAvatar9 = new biblioteca.ImageAvatar();
        imageAvatar10 = new biblioteca.ImageAvatar();
        imageAvatar11 = new biblioteca.ImageAvatar();
        imageAvatar12 = new biblioteca.ImageAvatar();
        imageAvatar13 = new biblioteca.ImageAvatar();
        imageAvatar14 = new biblioteca.ImageAvatar();
        lblSobre1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSobre2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSobre3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 800));
        setMinimumSize(new java.awt.Dimension(900, 800));

        lblSobre.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSobre.setForeground(new java.awt.Color(0, 102, 102));
        lblSobre.setText("Gabriel Santos");

        imageAvatar3.setBorderSize(3);
        imageAvatar3.setBorderSpace(2);
        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/foto.jpg"))); // NOI18N
        imageAvatar3.add(imageAvatar4);
        imageAvatar4.setBounds(0, 0, 0, 0);

        imageAvatar7.setBorderSize(3);
        imageAvatar7.setBorderSpace(2);
        imageAvatar7.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/fotoBielOliveira.jpg"))); // NOI18N
        imageAvatar7.add(imageAvatar8);
        imageAvatar8.setBounds(0, 0, 0, 0);

        imageAvatar9.add(imageAvatar10);
        imageAvatar10.setBounds(0, 0, 0, 0);

        imageAvatar7.add(imageAvatar9);
        imageAvatar9.setBounds(0, 0, 0, 0);

        imageAvatar11.setBorderSize(3);
        imageAvatar11.setBorderSpace(2);
        imageAvatar11.setDoubleBuffered(true);
        imageAvatar11.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/fotoGui.jpg"))); // NOI18N
        imageAvatar11.add(imageAvatar12);
        imageAvatar12.setBounds(0, 0, 0, 0);

        imageAvatar13.add(imageAvatar14);
        imageAvatar14.setBounds(0, 0, 0, 0);

        imageAvatar11.add(imageAvatar13);
        imageAvatar13.setBounds(0, 0, 0, 0);

        lblSobre1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSobre1.setForeground(new java.awt.Color(0, 102, 102));
        lblSobre1.setText("Biblioteca Desenvolvida por:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 118, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("gabriel.ps.gs.74@gmail.com");

        lblSobre2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSobre2.setForeground(new java.awt.Color(0, 102, 102));
        lblSobre2.setText("Guilherme Santos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 118, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("guilherme.santos@gmail.com");

        lblSobre3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSobre3.setForeground(new java.awt.Color(0, 102, 102));
        lblSobre3.setText("Gabriel Oliveira");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 118, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("gabriel.ogfs@gmail.com");

        jLabel8.setText("© 2024  BiblioOH®. Todos os direitos reservados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSobre1)
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(imageAvatar11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(lblSobre2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(lblSobre))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(imageAvatar7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(lblSobre3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(264, 264, 264))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSobre1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSobre2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(imageAvatar7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblSobre3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private biblioteca.ImageAvatar imageAvatar10;
    private biblioteca.ImageAvatar imageAvatar11;
    private biblioteca.ImageAvatar imageAvatar12;
    private biblioteca.ImageAvatar imageAvatar13;
    private biblioteca.ImageAvatar imageAvatar14;
    private biblioteca.ImageAvatar imageAvatar3;
    private biblioteca.ImageAvatar imageAvatar4;
    private biblioteca.ImageAvatar imageAvatar7;
    private biblioteca.ImageAvatar imageAvatar8;
    private biblioteca.ImageAvatar imageAvatar9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JLabel lblSobre1;
    private javax.swing.JLabel lblSobre2;
    private javax.swing.JLabel lblSobre3;
    // End of variables declaration//GEN-END:variables
}
