package taller;

import java.util.Arrays;

/**
 *
 * @author Leidy Giraldo
 */
public class OrdenarElementos {

    public void ejer31() {

        int longitudArreglo = 15;
        int[] arregloNumeros = new int[longitudArreglo];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Numeros en el arreglo " + Arrays.toString(arregloNumeros));
        Arrays.sort(arregloNumeros);

        System.out.println("\nNumeros ordenados: " );
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println( arregloNumeros[i]);
        }

    }

}
