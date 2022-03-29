// UML

package aula8ex1;

public class Passagem {

    private float valor;
    private String origem;
    private String destino;
    
    // Construtor
    public Passagem(){
        setValor(0);
        setOrigem("");
        setDestino("");
    } // Da os valores padrao no construtor ao inves de onde sao declaradas
    
    // Metodos acessores
    public float getValor(){
        return this.valor;
    }
    public String getOrigem(){
        return this.origem;
    }
    public String getDestino(){
        return this.destino;
    }
    
    // Metodos mutadores
    public void setValor(float valor){
        this.valor = valor;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    
    public String toString(){
        return "Valor:" + this.valor+
                "\nOrigem:" + this.origem+
                "\nDestino:" + this.destino;
    }
}
