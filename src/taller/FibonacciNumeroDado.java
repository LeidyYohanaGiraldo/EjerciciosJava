
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class FibonacciNumeroDado {
     public void ejer16() {
        int cantidadNumeros, numero1 = 0, numero2 = 1, suma;
        
        cantidadNumeros=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero que desea para obtener su serie fibonacci"));
        System.out.println("Los numeros de esta serie Fibonacci son: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(numero1);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;

        }
    }
    
}
