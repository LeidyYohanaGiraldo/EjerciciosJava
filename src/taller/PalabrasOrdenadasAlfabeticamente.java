package taller;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class PalabrasOrdenadasAlfabeticamente {

    public void ejer27() {

        String fraseOriginal = JOptionPane.showInputDialog("Por favor ingrese una oracion para ordenar sus palabras alfabeticamente ");

        if (!fraseOriginal.isEmpty()) {

            String[] fraseSeparada = fraseOriginal.split("\\s");
            Arrays.sort(fraseSeparada);
            String informacion = "Estas son las palabras ordenadas alfabéticamente:\n";
            for (int i = 0; i < fraseSeparada.length; i++) {
                informacion += fraseSeparada[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, informacion);

        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado una frase.");

        }
    }
}
