package principal;

public class Principal {

    public static void main(String[] args) {
        LojaDeCalcados obj = new LojaDeCalcados();
        
        Calcados chinelo = new Calcados("chinelo");
        
        obj.cadastrar(chinelo);
    }
    
}
