package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Edad {

    public void ejer4() {

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog(" Por favor ingrese su edad"));
        String esMayor = (edad >= 18) ? "Usted es mayor de edad" : "Usted es menor de edad";
        JOptionPane.showMessageDialog(null, esMayor);
    }
}
