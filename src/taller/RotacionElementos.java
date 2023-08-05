package taller;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class RotacionElementos {

    public void ejer34() {

        int posiciones;
        int k = 0;
        int longitudArreglo;
        String direccionRotacion;
        
        longitudArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        posiciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en que modificara el arreglo"));

        direccionRotacion = JOptionPane.showInputDialog("¿Hacia que lado desea mover el arreglo?, Izquierda o Derecha").toUpperCase();
        int[] arreglo = new int[longitudArreglo];
        int[] arregloDerecha = new int[longitudArreglo];
        int[] arregloIzquierda = new int[longitudArreglo];

       
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100 + 1);
        } System.out.println("Arreglo original: \n" + Arrays.toString(arreglo));
        
        if (direccionRotacion.equals("Izquierda".toUpperCase())) {
            for (int i = posiciones; i >= 0; i--) {
                arregloIzquierda[k] = arreglo[i];
                k++;
                        }
            int posicionFinal = arreglo.length - 1;
            for (int i = posicionFinal; i > posiciones; i--) {
                arregloIzquierda[k] = arreglo[i];
                k++;
                       }
            System.out.println("Arreglo modificado a la izquierda: \n" +Arrays.toString(arregloIzquierda));
            
        } else {for (int i = posiciones; i < arreglo.length; i++) {
                         arregloDerecha[k] = arreglo[i];
                k++;
                          }
            int posicionFinal = arreglo.length - posiciones;
            for (int i = 0; i < posiciones; i++) {
                arregloDerecha[posicionFinal] = arreglo[i];
                posicionFinal++;

            }
            System.out.println("Arreglo modificado a la derecha: \n" + Arrays.toString(arregloDerecha));
            
        }
    }

}
