package aula12ex1;

public class Conta {
    private int numero;
    
    public Conta(int numConta){
        setNumConta(numConta);
    }
    public void setNumConta(int numConta){
        this.numero = numConta;
    }
    public int getNumConta(){
        return this.numero;
    }
}
