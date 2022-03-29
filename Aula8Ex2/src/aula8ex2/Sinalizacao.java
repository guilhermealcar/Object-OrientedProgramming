package aula8ex2;

public class Sinalizacao {

    private String nome;
    private String data;
    private String local;
    
    // Construtor
    public Sinalizacao(){
        setNome("");
        setData("");
        setLocal("");
    }
    
    public Sinalizacao(String nome, String data, String local){
        setNome(nome);
        setData(data);
        setLocal(local);
    }
    
    // Metodos acessores
    public String getNome(){
        return this.nome;
    }
    public String getData(){
        return this.data;
    }
    public String getLocal(){
        return this.local;
    }
    
    // Metodos mutadores
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setLocal(String local){
        this.local = local;
    }
    
    
    
}
