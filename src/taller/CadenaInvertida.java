
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class CadenaInvertida {

    public void ejer20() {

        String cadena = JOptionPane.showInputDialog("Por favor ingrese una cadena ");
        String cadenaInvertida = "";
        if (!cadena.isEmpty()) {

            for (int i = cadena.length() - 1; i >= 0; i--) {
                cadenaInvertida += cadena.charAt(i);
            }
            JOptionPane.showMessageDialog(null, "Aquí esta su cadena invertida: " + cadenaInvertida);
        } else {
            JOptionPane.showMessageDialog(null, "No ha introducido una cadena de texto.");
        }
    }
}
    

