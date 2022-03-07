package cadeira;

/**
 *
 * @author a2207184
 */
public class Cadeira {

    private String cor;
    public void imprimir(){
        System.out.println("Cadeira");
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
}
