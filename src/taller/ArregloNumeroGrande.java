package taller;

import java.util.Arrays;

/**
 *
 * @author Leidy Giraldo
 */
public class ArregloNumeroGrande {

    public void ejer29() {

        int longitudArreglo = 30;
        int[] arregloNumeros = new int[longitudArreglo];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Numeros en el arreglo \n" + Arrays.toString(arregloNumeros));

        int numeroGrande = arregloNumeros[0];

        for (int i = 0; i < arregloNumeros.length; i++) {
            for (int j = 0; j < arregloNumeros.length; j++) {
                if (arregloNumeros[i] > arregloNumeros[j] && arregloNumeros[i] > numeroGrande) {
                    numeroGrande = arregloNumeros[i];
                }
            }
        }
        System.out.println("El numero mas grande en el arreglo es :  \n" + numeroGrande);
    }
}
