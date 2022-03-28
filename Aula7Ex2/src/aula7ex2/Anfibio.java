// ***HERANÇA ***

package aula7ex2;

public class Anfibio extends Animal {

    protected int qtdeEscamas;
    
    public Anfibio(){
        setQtdeEscamas(32);
    }
    
    public Anfibio(String nome, int qtdeEscamas){
        super(nome);
        setQtdeEscamas(qtdeEscamas);
    }
    
    public void setQtdeEscamas(int qtdeEscamas){
        this.qtdeEscamas = qtdeEscamas;
    }
    public int getQtdeEscamas(){
        return this.qtdeEscamas;
    }
}
