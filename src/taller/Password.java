package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Password {

    public void ejer18() {
        
        String password = " ";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitudPassword = 8;

        for (int i = 0; i < longitudPassword; i++) {
            int randomIndex = (int) (Math.random() * chars.length());
            char caracterAleatorio = chars.charAt(randomIndex);
            password = password + caracterAleatorio;

        }
        JOptionPane.showMessageDialog(null, " Su contraseña generada es: " + password);
    }
}
