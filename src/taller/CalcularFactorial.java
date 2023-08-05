package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class CalcularFactorial {

    public void ejer9() {

        int numero;
        int factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero para calcular su factorial"));

        if (numero >=0) {
            for (int i = numero; i > 0; i--) {
                factorial = factorial * i;
            }
            JOptionPane.showMessageDialog(null, "El factorial del numero  " + numero + " es : " + factorial);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero  mayor a 0");
        }
    }
}
