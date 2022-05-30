package aula25ex1;

import java.util.ArrayList;
import java.util.List;

public class Aula25Ex1 {

    public class Supermercado{
        List <Integer> listaCaixas;
        List <Integer> listaVendas;
        List <Integer> listaDespesas;
        
        public void iniciar(){
            iniciarCaixas();
            iniciarVendas();
            iniciarDespesas();
        }
        
        private void iniciarCaixas(){ this.listaCaixas = new ArrayList<>(); }
        private void iniciarVendas(){ this.listaVendas = new ArrayList<>(); }
        private void iniciarDespesas(){ this.listaDespesas = new ArrayList<>(); }
    }
    
    public Aula25Ex1(){
        Supermercado supermercado = new Supermercado();
        supermercado.iniciar();
    }
    
    public static void main(String[] args) {
        new Aula25Ex1();
    }
    
}
