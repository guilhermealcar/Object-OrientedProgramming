// UML

package aula8ex1;

public class SistemaPassagem {
        
    private String nome;
    private String CNPJ;
    private int qtdeFuncionarios;
    
    private Passagem [] lista;
    
    public SistemaPassagem(){
        
        lista = new Passagem[6];
        for(int i=0; i<lista.length; i++){
            lista[i] = new Passagem();
        }
    }
        
    // Metodos acessores
    public String getNome(){
        return this.nome;
    }
    public String getCNPJ(){
        return this.CNPJ;
    }
    public int getQtdeFuncionarios(){
        return this.qtdeFuncionarios;
    }
    public Passagem getPassagem(int i){
        return this.lista[i];
    }
    public int getTamLista(){
        return this.lista.length;
    }
    
    // Metodos mutadores
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }
    public void setQtdeFuncionarios(int qtdeFuncionarios){
        this.qtdeFuncionarios = qtdeFuncionarios;
    }
    public void setPassagem(int i, float valor, String origem, String destino){
        this.lista[i].setValor(valor);
        this.lista[i].setOrigem(origem);
        this.lista[i].setDestino(destino);
    }
}
