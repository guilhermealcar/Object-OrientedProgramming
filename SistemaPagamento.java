package aula12ex1;

public abstract class SistemaPagamento {
    private Conta conta;
    
    public SistemaPagamento(int numConta){
        this.conta = new Conta(numConta);
    }
    
    public abstract String getTipo();
}
