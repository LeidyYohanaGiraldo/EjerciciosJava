package taller;

/**
 *
 * @author Leidy Giraldo
 */
public class SerieFibonacci {

    public void ejer10() {
        int cantidadNumeros = 20, numero1 = 0, numero2 = 1, suma;
        System.out.println("Los primeros 20 numeros de la serie Fibonacci son: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(numero1);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;

        }
    }
}
