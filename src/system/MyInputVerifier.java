package system;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Clase verificadora, es una clase abstracta a la hay que implementarle el metodo verify
public class MyInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            //System.out.println("Formato erroneo");
            JOptionPane.showMessageDialog(new JFrame(), "Los datos deben de ser numericos"); //joption pane es un cuadro de dialogo que se va a desplegar cada vez que se pongan datos no enteros
            return false;
        }
    }

}
