
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class DeterminarPositivoNegativoCero {

    public void ejer6() {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "El " + numero + " es cero");
        } else if (numero > 0) {
                JOptionPane.showMessageDialog(null, " El numero " + numero + " es positivo ");
            } else {
                JOptionPane.showMessageDialog(null, " El numero " + numero + " es negativo ");
            }
        }

    }
