// ***HERANÇA ***

package aula7ex2;

public class Leao extends Mamifero {

    public Leao(String nome, int qtdePelos){
        super(nome, qtdePelos);
    }
    
    public String toString(){
        return getNome() + " " + this.qtdePelos;
    }
}
