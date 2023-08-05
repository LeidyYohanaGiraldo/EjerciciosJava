package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class FrasesPalindromas {

    public void ejer22() {

        String fraseOriginal = JOptionPane.showInputDialog(null, " Por favor ingrese una frase:");
        String frase = fraseOriginal.replaceAll("\\s", "").toLowerCase();
        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        if (frase.equals(fraseInvertida)) {

            JOptionPane.showMessageDialog(null, "La frase " + fraseOriginal + ", es palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase " + fraseOriginal +", NO es un palíndromo.");
        }
    }
}
