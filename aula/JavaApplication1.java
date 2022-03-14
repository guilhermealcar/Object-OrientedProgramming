package javaapplication1;

public class JavaApplication1 {

    // Método da classe
    public static void main(String[] args) {
        
        Flor rosa = new Flor();
        Flor violeta = new Flor("violeta", 10.4f, 5);
        
        System.out.println(rosa.getCor());
        rosa.setCor("vermelha");
        System.out.println(rosa.getCor());
        
        System.out.println(violeta.getCor());
        System.out.println(violeta.getTamanho());
        System.out.println(violeta.getPetalas());
    }
    
}
