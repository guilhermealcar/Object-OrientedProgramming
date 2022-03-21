package aula5ex3;

import java.util.ArrayList;
import java.util.Iterator;

public class Construtora {
    
    ArrayList listaVeiculoCarga;
    ArrayList listaVeiculoEntrega;
    
    public Construtora(){
        listaVeiculoCarga = new ArrayList();
        listaVeiculoEntrega = new ArrayList();
    }
    
    public void inserirVeiculoCarga(VeiculoCarga veiculoCarga){
        listaVeiculoCarga.add(veiculoCarga);
    }
    public void inserirVeiculoEntrega(VeiculoEntrega veiculoEntrega){
        listaVeiculoEntrega.add(veiculoEntrega);
    }
    
    public String toString(){
        
        String retorno = "";
        Iterator i = listaVeiculoCarga.iterator();
        
        while(i.hasNext())
            retorno += i.next();
        
        return retorno;
    }
}
