package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class ContarLetras {

    public void ejer21() {

        String cadena = JOptionPane.showInputDialog("Por favor ingrese una cadena ");
        if (!cadena.isEmpty()) {
            String letraIngresada = JOptionPane.showInputDialog("Por favor ingresa la letra que quieres contar ");
            int cantidadLetras = 0;
            cadena = cadena.toLowerCase();
            char letra = letraIngresada.charAt(0);

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == letra) {
                    cantidadLetras++;
                }
            }
            JOptionPane.showMessageDialog(null, "La letra '" + letra + "' se repite " + cantidadLetras + " veces en la cadena de texto ");

        } else {
            JOptionPane.showMessageDialog(null, "No ha introducido una cadena de texto.");
        }
    }
}
