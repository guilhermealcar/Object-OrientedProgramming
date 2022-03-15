package principal;

import java.util.ArrayList;

public class LojaDeCalcados {
    
    ArrayList listaCalcados;
    
    public LojaDeCalcados(){
        listaCalcados = new ArrayList();
    }
    
    public void cadastrar(Calcados calcados){
        this.listaCalcados.add(calcados);
    }
    
    public void vender(Calcados calcados){
        this.listaCalcados.remove(calcados);
    }
    
    public void listarTodos(){
        // Para cada item do tipo Calcados de listaCalcados
        //imprima esse item
        Iterator lista = listaCalcados.iterator();
        for(Calcados item : lista)
            System.out.println(item);
    }
}
