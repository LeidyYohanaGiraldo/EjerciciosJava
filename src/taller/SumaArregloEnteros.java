package taller;

import java.util.Arrays;

/**
 *
 * @author Leidy Giraldo
 */
public class SumaArregloEnteros {

    public void ejer28() {

        int longitudArreglo = 5;
        int[] arregloNumeros = new int[longitudArreglo];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Numeros en el arreglo \n" + Arrays.toString(arregloNumeros));
        int sumatoria = 0;

        for (int i = 0; i < arregloNumeros.length; i++) {
            sumatoria = sumatoria + arregloNumeros[i];
        }
        System.out.println(sumatoria);
    }
}
