package aula11ex3;

public class Carro implements IEmissaoCarbono {
    
    private int qtdRodas;
    private float emissaoCarbono;
    
    public Carro(float emissaoCarbono){
        setEmissaoCarbono(emissaoCarbono);
    }
    
    public float getEmissaoCarbono(){
        return this.emissaoCarbono;
    }
    public void setEmissaoCarbono(float emissaoCarbono){
        this.emissaoCarbono = emissaoCarbono;
    }
    
    public String toString(){
        return "\nCARRO:" + getEmissaoCarbono();
    }
}
