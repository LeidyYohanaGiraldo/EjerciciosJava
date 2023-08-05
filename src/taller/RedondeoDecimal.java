package taller;

import java.math.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class RedondeoDecimal {

    public void ejer13() {

        double numero;
        int cantidadDecimales;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese un número decimal"));
        cantidadDecimales = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de decimales a los que desea redondear"));

        BigDecimal redondeo = BigDecimal.valueOf(numero).setScale(cantidadDecimales, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null, "El número redondeado a decimales es: " + redondeo);
    }

}
