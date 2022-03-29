// UML

package aula8ex1;

public class Principal {

    public static void main(String[] args) {
        
        SistemaPassagem sp = new SistemaPassagem();
        
        // Impressao inicial
        for(int i=0; i<sp.getTamLista(); i++){
            System.out.println(sp.getPassagem(i));
        }
        
        System.out.print("\n");
        
        for(int i=0; i<sp.getTamLista(); i++){
            sp.setPassagem(i, 100.0f, "A", "B");
        }
        
        for(int i=0; i<sp.getTamLista(); i++){
            System.out.println(sp.getPassagem(i));
        }
    }
    
}
