package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class ContarCaracteres {

    public void ejer26() {

        String cadenaOriginal = JOptionPane.showInputDialog("Por favor ingrese una cadena ");
        if (!cadenaOriginal.isEmpty()) {

            String cadenaNueva = cadenaOriginal.replace(" ", "");

            int numeroCaracteres = cadenaNueva.length();

            JOptionPane.showMessageDialog(null, "La cantidad de de caracteres que contiene la cadena ingresada " + cadenaOriginal + " es: " + numeroCaracteres);

        } else {
            JOptionPane.showMessageDialog(null, "No ha introducido una cadena de texto.");
        }

    }

}
