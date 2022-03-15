package principal;

public class Calcados {
    private String tipo;
    private String marca;
    private float tamanho;
    private float valor;
    
    public Calcados(String tipo){
        
    }
    
    // Metodo acessor
    public String getTipo(){
        return this.tipo;
    }
    
    // Metodo mutador
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public float getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public String toString(){
        return "Tipo: " + getTipo()+
               "\nMarca: " + getMarca()+
               "\nTamanho: " + getTamanho()+
               "\nValor: " + getValor(); 
    }
}
