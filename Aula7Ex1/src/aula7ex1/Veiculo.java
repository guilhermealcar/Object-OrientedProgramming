package aula7ex1;

public class Veiculo {

    private String placa;
    private int valor;
    private String cor;
    
    public Veiculo(){
        setPlaca("123");
        setValor(0);
        setCor("branco");
    }
    
    public Veiculo(String placa, int valor, String cor){
        setPlaca(placa);
        setValor(valor);
        setCor(cor);
    }
    
    public Veiculo setPlaca(String placa){
        this.placa = placa;
        return this;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public Veiculo setCor(String cor){
        this.cor = cor;
        return this;
    }
}
