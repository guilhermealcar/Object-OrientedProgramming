package aula5ex3;

public class Aula5Ex3 {

    public static void main(String[] args) {
        
        Construtora construtora = new Construtora();
        
        VeiculoCarga vc = new VeiculoCarga();
        VeiculoEntrega ve = new VeiculoEntrega();
        
        construtora.inserirVeiculoCarga(vc);
        construtora.inserirVeiculoEntrega(ve);
        
        System.out.println(construtora);
    }
    
}
