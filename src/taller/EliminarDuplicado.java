package taller;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author Leidy Giraldo
 */
public class EliminarDuplicado {

    public void ejer30() {

        int[] numerosDuplicados = {1, 46, 0, 9, 56, 74, 18, 77, 36, 66, 77, 89, 77, 88, 56,0 , 33};

        LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
        for (int i = 0; i < numerosDuplicados.length; i++) {
            for (int j = 0; j < numerosDuplicados.length; j++) {
                if (i != j && numerosDuplicados[i] != numerosDuplicados[j]) {
                    conjunto.add(numerosDuplicados[i]);
                }
            }
        }

        int[] resultado = new int[conjunto.size()];
        int indice = 0;

        System.out.println("Estos son sus numeros despues de eliminar los duplicados: ");
        for (int elemento : conjunto) {
            resultado[indice++] = elemento;
            System.out.println(elemento);
        }
    }
}
