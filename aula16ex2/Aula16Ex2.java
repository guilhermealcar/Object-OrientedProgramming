package aula16ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula16Ex2 {

    public abstract class Embarcados {
        public abstract String getTensao();
    }
    
    public class Esp extends Embarcados {
        public String getTensao(){
            return "8";
        }
    }
    
    public class RaspBerry extends Embarcados {
        public String getTensao(){
            return "8";
        }
    }
    
    public class Arduino extends Embarcados {
        public String getTensao(){
            return "8";
        }
    }
    
    public Aula16Ex2(){
        System.out.println("\n Via array list");
        
        ArrayList<Embarcados> lista = new ArrayList<>();
        lista.add(new Esp());
        lista.add(new RaspBerry());
        lista.add(new Arduino());
        
        Iterator i = lista.iterator();
        
        while(i.hasNext())
            System.out.println(i.next());
    }
    
    public static void main(String[] args) {
        
        new Aula16Ex2();
        Aula16Ex2.Arduino arduino = new Aula16Ex2().new Arduino();
    }
    
}
