package aula8ex2;

// Heranca
public class Placa extends Sinalizacao {

    private String tipo;
    
    public Placa(){
        //super(); esta implicito -> metodo para a superclasse
        setTipo("");
    }
    // Construtor personalizado
    public Placa(String nome, String data, String local, String tipo){
        super(nome, data, local); // Chamada explicita
        
        setTipo(tipo);
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String toString(){
        return "Nome:" + this.getNome()+
                "\nData:" + this.getData()+
                "\nLocal:" + this.getLocal()+
                "\nTipo:" + this.getTipo();
    }
}
