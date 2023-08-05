package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class CalculoCirculo {

    public void ejer3() {

        double radio;

        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el tamaño del radio"));
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        JOptionPane.showMessageDialog(null, " El área del círculo es: " + area + "\n"
                + " El perímetro del círculo es: " + perimetro);
    }

}
