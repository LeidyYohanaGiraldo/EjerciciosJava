package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class DeterminarMayor {

    public void ejer5() {

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(" Por favor ingrese el segundo numero"));

        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " y el numero " + numero2 + " Son iguales");
        } else {
            if (numero1 > numero2) {
                JOptionPane.showMessageDialog(null, " El numero " + numero1 + " es mayor que el numero " + numero2);
            } else {
                JOptionPane.showMessageDialog(null, " El numero " + numero2 + " es mayor que el numero " + numero1);
            }
        }

    }

}
