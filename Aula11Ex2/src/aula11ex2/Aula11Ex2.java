package aula11ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula11Ex2 {

    public static void main(String[] args) {
        
        // Empregado []lista = new Empregado[5]; // Vetor fixo com 5 posicoes.
        
        ArrayList <Empregado> lista = new ArrayList<>();
        
        Data dataChefe = new Data();
        Chefe joao = new Chefe(dataChefe);
        
        Data dataBalconista = new Data();
        Balconista maria = new Balconista(dataBalconista);
        
        lista.add(joao);
        lista.add(maria);
        
        Iterator i= lista.iterator();   // Adquire um iterator sobre os obj
        while (i.hasNext())     // Tem mais obj?
            System.out.println(i.next());
    }
    
}
