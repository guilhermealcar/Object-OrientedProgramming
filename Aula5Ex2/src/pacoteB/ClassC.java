package pacoteB;

import pacoteA.*;
import pacoteA.ClassA;

public class ClassC extends ClassA {
    
    public ClassC(){
        ClassA objA = new ClassA();
        
        System.out.println(objA.quarto); // Nao consegue acessar
    }
}
