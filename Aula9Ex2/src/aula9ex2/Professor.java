package aula9ex2;

public class Professor extends Faculdade {
    
    public Professor(){
        
    }
    
    public Professor(String nome){
        super(nome);
    }
    
    public Professor(String nome, float salario){
        super(nome, salario);
    }
    
    public String toString(){
        return super.toString() + "" + this.getNome() + "Salario:" + this.getSalario();
    }
}
