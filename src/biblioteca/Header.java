package biblioteca;

import tabelas.TabelaEmprestimo;
import tabelas.TabelaFuncionario;
import tabelas.TabelaLivro;
import tabelas.TabelaUsuario;

/**
 *
 * @author Gabriel Santos
 */
public class Header extends javax.swing.JPanel {

    String nome02;
    String email02;
    String[] dados = new String[8];
   
    /**
     * Creates new form Header
     * @param u
     */
    
    public Header(Usuario u) {
        nome02 = u.getNome();
        email02 = u.getEmail();
        

        initComponents();
        
        dados[0] = u.getId();
        dados[1] = u.getEmail();
        dados[2] = u.getSenha();
        dados[3] = u.getNome();
        dados[4] = u.getEndereco();
        dados[5] = u.getRg();
        dados[6] = u.getCpf();
        dados[7] = u.getTelefone();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new biblioteca.ImageAvatar();
        nome = new javax.swing.JLabel();
        email = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 118, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        imageAvatar1.setBorderSize(3);
        imageAvatar1.setBorderSpace(2);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/perfil.png"))); // NOI18N
        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });

        nome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome.setText(nome02);
        nome.setToolTipText("");
        nome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText(email02);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked

        JPerfil PerfilFrame = new JPerfil(dados);
        PerfilFrame.setVisible(true);
       
    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JPerfil PerfilFrame = new JPerfil(dados);
        PerfilFrame.setVisible(true);
    }//GEN-LAST:event_formMouseClicked

    private void nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeMouseClicked
        JPerfil PerfilFrame = new JPerfil(dados);
        PerfilFrame.setVisible(true);
    }//GEN-LAST:event_nomeMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        JPerfil PerfilFrame = new JPerfil(dados);
        PerfilFrame.setVisible(true);
    }//GEN-LAST:event_emailMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private biblioteca.ImageAvatar imageAvatar1;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
