package pacoteA;

public class Aula5Ex2 {

    public static void main(String[] args) {
        
        ClassA objA = new ClassA();
        
        System.out.println(objA.primeiro); // public
        System.out.println(objA.segundo); // package private
        System.out.println(objA.quarto); // protected: package private + filhos
    }
    
}
