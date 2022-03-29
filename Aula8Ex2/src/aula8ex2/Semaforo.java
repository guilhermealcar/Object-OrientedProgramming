package aula8ex2;

// Heranca
public class Semaforo extends Sinalizacao {

    private float temporizador;
    
    public Semaforo(){
        setTemporizador(0);
    }
    
    // Construtor personalizado
    public Semaforo(String nome, String data, String local, float temporizador){
        super(nome, data, local);
        setTemporizador(temporizador);
    }
    
    public float getTemporizador(){
        return this.temporizador;
    }
    public void setTemporizador(float temporizador){
        this.temporizador = temporizador;
    }
    
    public String toString(){
        return "Nome:" + this.getNome()+
                "\nData:" + this.getData()+
                "\nLocal:" + this.getLocal()+
                "\nTemporizador:" + this.getTemporizador();
    }
}
