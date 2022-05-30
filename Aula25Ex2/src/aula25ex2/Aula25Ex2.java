package aula25ex2;

import java.util.ArrayList;
import java.util.List;

public class Aula25Ex2 {

    public class Papelaria{
        List <Integer> listaCadernos;
        List <Integer> listaCanetas;
        List <Integer> listaLapis;
        List <Integer> listaBorracha;
        
        public void iniciar(){
        
            iniciarCadernos();
            iniciarCanetas();
            iniciarLapis();
            iniciarBorracha();
        }
        
        private void iniciarCadernos(){ this.listaCadernos = new ArrayList<>();}
        private void iniciarCanetas(){ this.listaCanetas = new ArrayList<>();}
        private void iniciarLapis(){ this.listaLapis = new ArrayList<>();}
        private void iniciarBorracha(){ this.listaBorracha = new ArrayList<>();}
        
    }
    
    public Aula25Ex2(){
        
        Papelaria papelaria = new Papelaria();
        papelaria.iniciar();
    }
    
    public static void main(String[] args) {
        
        new Aula25Ex2();
    }
    
}
