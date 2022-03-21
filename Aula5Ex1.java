package aula5ex1;

public class Aula5Ex1 {

    public static void main(String[] args) {
        Exercicio1 obj1 = new Exercicio1();
        Exercicio1 obj2 = new Exercicio1("vermelho");
        
        // Imprimir
        System.out.println(obj1); // Chamada implicita => Não informou o metodo toString
        
        // Chamada Explicita
        System.out.println(obj2.toString());
    }
    
}
