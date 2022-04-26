package aula16ex1;

import java.util.ArrayList;
import java.util.Iterator;
    
public class Aula16Ex1 {
    
    public class Embarcados {
        public String getTensao(){
            return "0";
        }
        public String toString(){
            return getTensao();
        }
    }
    
    public final class Arduino extends Embarcados {
        public String getTensao(){
            return "220";
        }
    }
    
    public final class RaspBerry extends Embarcados {
        public String getTensao(){
            return "110";
        }
    }
    
    public final class Esp extends Embarcados {
        public String getTensao() {
            return "127";
        }
    }

    public Aula16Ex1() {
        
        ArrayList<Embarcados> lista = new ArrayList<>();
                                //Arduino obj = new Arduino();
        lista.add(new Arduino()); //lista.add(obj)
        lista.add(new RaspBerry());
        lista.add(new Esp());
        
        Iterator i = lista.iterator();
        while(i.hasNext())
            //System.out.println(i.next().getTensao());
            System.out.println(i.next());
        
        System.out.print("\n");
    }
    
    public static void main(String [] args){
        new Aula16Ex1();
        
        Aula16Ex1.Arduino arduino = new Aula16Ex1().new Arduino();
    }
    
}
