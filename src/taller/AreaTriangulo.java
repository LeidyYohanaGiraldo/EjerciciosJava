package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class AreaTriangulo {

    public void ejer11() {

        double lado1, lado2, lado3;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer lado"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo lado"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del tercer lado"));

        double semiperimetro = ((lado1 + lado2 + lado3) / 2);
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        JOptionPane.showMessageDialog(null, " El área del triangulo es: " + area);
    }

}
