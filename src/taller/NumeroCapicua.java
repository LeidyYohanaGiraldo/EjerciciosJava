
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NumeroCapicua {

    public void ejer15() {

        int numero, original, inverso = 0, digito;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        original = numero;

        while (original > 0) {
            digito = original % 10;
            inverso = inverso * 10 + digito;
            original = original / 10;
        }
        if (numero == inverso) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es CAPICUA");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " NO es capicua");
        }
    }
}
