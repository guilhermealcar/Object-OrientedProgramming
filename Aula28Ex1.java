package aula28ex1;

import javax.swing.JOptionPane;

public class Aula28Ex1{

    public Aula28Ex1(){
        
        int numero = 1+((int)Math.random()*10);
        
        JOptionPane.showMessageDialog(null, numero+"", "Titulo", JOptionPane.PLAIN_MESSAGE);
        
        int digitou=0;
        do {
            String digitouString = JOptionPane.showInputDialog(null, "Digite o numero:", "Titulo");
            
            digitou = Integer.parseInt(digitouString);
            String mensagem;
            
            if (digitou > numero)
                mensagem = "MAIOR";
            else
                if (digitou < numero)
                    mensagem = "MENOR";
                else
                    mensagem = "ACERTOU";
            
            JOptionPane.showMessageDialog(null, mensagem, "Titulo", JOptionPane.INFORMATION_MESSAGE);
            
        } while (digitou != numero);
        
    }
    
    public static void main(String[] args) {
        
        new Aula28Ex1();
    }
    
}