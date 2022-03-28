// ***HERANÇA ***

package aula7ex2;

public class Golfinho extends Mamifero {

    public Golfinho(String nome, int qtdeDentes){
        super(nome, qtdeDentes);
    }
    
    public String toString(){
        return getNome() + " " + this.qtdeDentes;
    }
}
