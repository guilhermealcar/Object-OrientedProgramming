package aula5ex3;

public class VeiculoEntrega {
    
    private float precoFrete;
    
    public VeiculoEntrega(){
        setPrecoFrete(100);
    }
    public void setPrecoFrete(float precoFrete){
        this.precoFrete = precoFrete;
    }
    public String toString(){
        return this.precoFrete + " ";
    }
}
