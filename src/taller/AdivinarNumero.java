package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class AdivinarNumero {

    public void ejer8() {

        int numAleatorio, numUsuario;

        numAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println(numAleatorio);

        while (true) {
            numUsuario = Integer.parseInt(JOptionPane.showInputDialog("¿Puedes divinar el numero? Ingresalo aquí:"));
            if (numUsuario > numAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Intentalo de nuevo! el numero es menor que " + numUsuario);

            } else if (numUsuario < numAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Intentalo de nuevo! el número es mayor que " + numUsuario);

            } else {
                JOptionPane.showMessageDialog(null, "¡Felicitaciones! has acertado el numero correcto es " + numUsuario);
                break;
            }
        }

    }

}
