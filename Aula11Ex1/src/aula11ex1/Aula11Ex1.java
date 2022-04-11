package aula11ex1;

public class Aula11Ex1 {

    public static void main(String[] args) {

        CoelhoPardo coelhoPardo = new CoelhoPardo();
        coelhoPardo.imprimir();
        coelhoPardo.imprimirTipo();
        System.out.print("\n");
        
        Sapo sapo = new Sapo();
        sapo.imprimirTipo();
        sapo.imprimir();
        System.out.print("\n");
        
        Peixe peixe = new Peixe();
        peixe.imprimir();
    }
    
}
