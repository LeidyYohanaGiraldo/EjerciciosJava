package taller;

import java.util.Arrays;

/**
 *
 * @author Leidy Giraldo
 */
public class FrecuenciaElemento {

    public void ejer33() {

        int longitudArreglo = 30;
        int[] arregloNumeros = new int[longitudArreglo];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Numeros en el arreglo \n" + Arrays.toString(arregloNumeros));

        for (int i = 0; i < arregloNumeros.length; i++) {

            int contador = 0;
            for (int j = 0; j < arregloNumeros.length; j++) {
                if (i != j) {
                    contador = arregloNumeros[i] == arregloNumeros[j] ? ++contador : contador;

                }
            }
            System.out.println("El numero " + arregloNumeros[i] + " en la posicion " + i
                    + " del arreglo, se repite " + contador + " veces");
        }

    }

}
