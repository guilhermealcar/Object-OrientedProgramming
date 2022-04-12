package aula12ex1;

public class PIX extends SistemaPagamento implements IPagamento {
    private String chavePIX;
    
    public PIX(String chavePIX, int numConta){
        super(numConta);
        setChavePIX(chavePIX);
    }
    
    
    public void setChavePIX(String chavePIX){
        this.chavePIX = chavePIX;
    }
    public String getChavePIX(){
        return this.chavePIX;
    }
    
    public String getTipo(){        //Metodo abstrato que foi implementado
        return "PIX";
    }
    
    public void pagar(float valor){
        System.out.println(valor+(valor*0.1));
    }
}
