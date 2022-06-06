package aula27ex2;

import java.util.Observable;
import java.util.Observer;

public class Aula27Ex2 {

    // Observador: implementa a interface do Observer
    //.......(é o objeto que recebe a notificação da mudança)
    
    // Observável: deriva (subclasse) de Observable
    //.......(é aquele que produz a mudança e envia a notificação)
    
    public class Observador implements Observer{
        @Override
        public void update(Observable remoto, Object atributoRemoto){
            System.out.println(this + ": Recebi atualizacao de [" + remoto + "]" +
                                " que mudou o seguinte atributo? " + atributoRemoto);
        }
        public String toString(){return this.getClass().getSimpleName();}
    }
    
    public class Caderno extends Observable{
        private float preco;
        public Caderno(float preco){
            setPreco(preco);
        }
        public void setPreco(float preco){
            this.preco = preco;
            this.setChanged();   // Mudou o estado do objeto
            this.notifyObservers("preco");  // Notifique todos os Observers
        }
    }
    
    public Aula27Ex2(){
        Caderno caderno = new Caderno(1.23f);
        caderno.addObserver(new Observador());
        caderno.setPreco(1.23f);    // Agora o observador é notificado
    }
    
    public static void main(String[] args) {
        new Aula27Ex2();
    }
    
}
