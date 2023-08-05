package taller;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class PalabraSeparada {

    public void ejer25() {

        String fraseOriginal = JOptionPane.showInputDialog(null, " Por favor ingrese una frase:");
        if (!fraseOriginal.isEmpty()) {

            String[] fraseSeparada = fraseOriginal.split("\\s");
            StringBuilder resultado = new StringBuilder();

            for (String palabras : fraseSeparada) {
                resultado.append(palabras).append("\n");

                JOptionPane.showMessageDialog(null, "Las palabras en la frase " + fraseOriginal + ", son: " + "\n" + resultado);
                System.out.println(palabras);
            }
            /*for(int i = 0 ; i < fraseSeparada.length; i++){
               System.out.println(fraseSeparada[i]);
               }*/

        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado una frase.");
        }
    }

}
