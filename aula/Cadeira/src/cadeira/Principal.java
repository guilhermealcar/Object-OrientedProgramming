package cadeira;

/**
 *
 * @author a2207184
 */
public class Principal {

    public static void main(String[] args){
        Cadeira obj = new Cadeira();
        obj.imprimir();
        obj.setCor("AZUL");
        System.out.println(obj.getCor());
    }
    
}
