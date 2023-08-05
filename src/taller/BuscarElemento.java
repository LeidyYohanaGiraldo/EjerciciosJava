package taller;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class BuscarElemento {

    public void ejer32() {
        
        int longitudArreglo = 20;
        int[] arregloNumeros = new int[longitudArreglo];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Numeros en el arreglo \n" + Arrays.toString(arregloNumeros));

        int contador = 0;
        int buscarNumero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero que desee buscar"));
        for (int i = 0; i < arregloNumeros.length; i++) {
            if (arregloNumeros[i] == buscarNumero) {
               JOptionPane.showMessageDialog(null,"El numero " + buscarNumero + " se encentra en la posicion "
                        + i + " del arreglo");
                ++contador;
            }
        }
        if (contador == 0) {
           JOptionPane.showMessageDialog(null,"el numero " + buscarNumero + " no se encuentra en el arreglo");
        }

    }

}
