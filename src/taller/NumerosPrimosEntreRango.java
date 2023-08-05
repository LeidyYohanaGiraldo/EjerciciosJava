package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NumerosPrimosEntreRango {

    public void ejer17() {

        int numeroInicial, numeroFinal;

        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango inicial en el que desea obtener sus numeros primos"));
        numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango final en el que desea obtener sus numeros primos"));

        if (numeroInicial > numeroFinal) {
            JOptionPane.showMessageDialog(null, " El primer numero debe ser menor o igual al segundo numero.");
            return;
        }

        for (int i = numeroInicial; i < numeroFinal; i++) {
            boolean primo = true;
            for (int j = numeroInicial; i > j; j++) {
                if (i % j == 0) {
                    primo = false;

                    break;
                }
            }
            if (primo && i != 1) {

                System.out.println(i);

                //JOptionPane.showMessageDialog(null, "Los números primos en el rango " + numeroInicial + " a " + numeroFinal + ":\n" + i);
            }
        }
    }

}
