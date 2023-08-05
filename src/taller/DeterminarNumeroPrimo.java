package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class DeterminarNumeroPrimo {

    public void ejer12() {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para determinar si es numero primo"));
        boolean esPrimo = true;
        if (numero == 1) {
            esPrimo = false;
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es primo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero  mayor a 0");
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                esPrimo = numero % i == 0 ? false : true;
                break;
            }
            if (esPrimo) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es primo.");

            } else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " no es primo.");
            }
        }
    }
}
