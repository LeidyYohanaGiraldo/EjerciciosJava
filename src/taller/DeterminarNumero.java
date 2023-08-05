
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class DeterminarNumero {
    public void ejer2 (){
    
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, " El numero " + numero + " es par: ");
        } else {
            JOptionPane.showMessageDialog(null, " El numero " + numero + " es impar: ");
        }

    }
}
