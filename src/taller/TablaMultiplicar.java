package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class TablaMultiplicar {

    public void ejer7() {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero entero"));
        if (numero > 0) {
            for (int i = 1; i <= 10; i++) {
                JOptionPane.showMessageDialog(null, numero + " * " + i + " = " + numero * i);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero  mayor a 0");
        }
    }

}
