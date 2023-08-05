package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NombreMayusculaMinuscula {

    public void ejer19() {

        String nombre = JOptionPane.showInputDialog("Por favor Ingrese su Nombre: ");

        if (nombre != null) {
            String nombreMayuscula = nombre.toUpperCase();
            String nombreMinuscula = nombre.toLowerCase();

            JOptionPane.showMessageDialog(null, "Aquí esta su nombre en mayúscula: " + nombreMayuscula
                    + "\n Aquí esta su nombre en minúscula: " + nombreMinuscula);
        } else {

            JOptionPane.showMessageDialog(null, "Has cancelado la entrada de datos.");
        }

    }

}
