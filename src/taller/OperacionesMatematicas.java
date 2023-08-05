
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class OperacionesMatematicas {
  
    public void ejer1 (){
            
        int numero1, numero2;

 
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt (JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        JOptionPane.showMessageDialog(null, " El resultado de la suma es: " + (numero1 + numero2)+ "\n"
        + " El resultado de la resta es: " + (numero1 - numero2)+ "\n"
        + " El resultado de la multiplicacion es : " + (numero1 * numero2)+ "\n"
        + " El resultado de la division es : " + (numero1 / numero2));
    }
    
}
