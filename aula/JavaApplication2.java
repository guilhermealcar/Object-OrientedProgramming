package javaapplication2;

import javax.swing.JOptionPane;

public class JavaApplication2 {

    //Metodo da classe
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("v1: ");
        float v1 = Float.parseFloat(valor1);
        
        String valor2 = JOptionPane.showInputDialog("v2: ");
        float v2 = Float.parseFloat(valor2);
        
        float total = v1 + v2;
        
        JOptionPane.showMessageDialog(null, "Total é: " + total,
                "Titulo", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
