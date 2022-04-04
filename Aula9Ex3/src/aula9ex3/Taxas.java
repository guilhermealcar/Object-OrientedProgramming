package aula9ex3;

public class Taxas {

    private float taxa;
    private String tipo;
    
    public Taxas(){
        setTaxas(0);
    }
    
    public void setTaxas(float taxa){
        this.taxa = taxa;
    }
    
    public void setTaxas(String tpo, float taxa){
        this.tipo = tipo;
        this.taxa = taxa;
    }
    
    public float getTaxas(){
        return this.taxa;
    }
}
