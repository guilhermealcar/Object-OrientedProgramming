package aula5ex1;

public class Exercicio1 {

    // Fora dos metodos (como variaveis globais)
    private String cor; //Variavel de instancia
    
    // Construtor
    public Exercicio1(){
        
        //super(); // Explicitamente informando que esta classe
                   //herda da classe java.lang.Object
        
        setCor("azul");
    }
        
    // Construtor (sobrecarga)
    public Exercicio1(String cor){
        setCor(cor);
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // Sobrecarga
    public String toString(){
        return this.cor;
    }
    
}
