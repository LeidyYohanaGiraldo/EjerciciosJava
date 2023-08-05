package taller;

/**
 *
 * @author Leidy Giraldo
 */
public class TablasMultiplicar {

    public void ejer35() {

        int[][] tablaMultiplicar = new int[10][10];

        for (int i = 0; i <10; i++) {
            System.out.println("\n"+"Tabla de multiplicar de el numero " + (i+1));
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (1 + j);
                System.out.print((i + 1) + " x " + (j + 1) + " = " + tablaMultiplicar[i][j] + "\n");
            }
        }
    }
}
