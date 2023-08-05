package taller;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class CantidadPalabras {

    public void ejer23() {

        String oracion = JOptionPane.showInputDialog("Por favor ingrese una oracion para contar sus palabras ");

        if (!oracion.isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(oracion);

            JOptionPane.showMessageDialog(null, "El numero de palabras en la oracion ingresada " + "''" + oracion + " '' " + " es: " + stringTokenizer.countTokens());

        } else {
            JOptionPane.showMessageDialog(null, "No ha introducido una oración.");
        }
    }
}
