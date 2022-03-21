package aula5ex3;

public class VeiculoCarga {

    private int cargaLimite;
    private float precoCarga;
    private float precoFrete;
    
    public VeiculoCarga(){
        setCargaLimite(100);
        setPrecoCarga(200);
        setPrecoFrete(300);
    }
    
    public void setCargaLimite(int cargaLimite){
        this.cargaLimite = cargaLimite;
    }
    public void setPrecoCarga(float precoCarga){
        this.precoCarga = precoCarga;
    }
    public void setPrecoFrete(float precoFrete){
        this.precoFrete = precoFrete;
    }
    public String toString(){
        return this.cargaLimite + " " +
                this.precoCarga + " " +
                this.precoFrete;
    }
}
