package biblioteca;

import conexao.Conexao;

/**
 *
 * @author Gabriel Santos
 */
public class Biblioteca {

     Conexao con_cliente;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        
    }
    
}
