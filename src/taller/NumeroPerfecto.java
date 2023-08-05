
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NumeroPerfecto {
    
    public void ejer14() {

        int numero, suma = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == numero) {
            JOptionPane.showMessageDialog(null, "¡El número " + numero + " es un numero PERFECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " NO es un numero Perfecto");

        }
    }
}
