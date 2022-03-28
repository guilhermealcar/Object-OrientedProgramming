// ***HERANÇA ***

package aula7ex2;

public class Sapo extends Anfibio {

    private String cor;
    
    public Sapo(String nome, int qtdeEscamas){
        super(nome, qtdeEscamas); // Chamada explicita do construtor da superclasse
        
    }
    
    public Sapo(){
        setCor("amarelo");
    }
    
    public Sapo(String nome, String cor, int qtdeEscamas){
        super(nome, qtdeEscamas);
        setCor(cor);
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String toString(){
        return getNome() + " " + this.cor + " " + getQtdeEscamas();
    }
}
