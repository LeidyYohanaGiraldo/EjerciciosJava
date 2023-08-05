package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class ReemplazoLetra {

    public void ejer24() {

        String fraseOriginal = JOptionPane.showInputDialog(null, " Por favor ingrese una frase:");

        if (!fraseOriginal.isEmpty()) {
            String letraOriginal = JOptionPane.showInputDialog(null, " Por favor ingrese el caracter que quieres cambiar");
            String letraNueva = JOptionPane.showInputDialog(null, " Por favor ingrese el nuevo caracter:");
            String fraseNueva = fraseOriginal.replaceAll(letraOriginal, letraNueva).toLowerCase();

            JOptionPane.showMessageDialog(null, "La frase " + fraseOriginal + ", ha sido cambiada por: " + fraseNueva);
        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado una frase.");
        }

    }
}
