package aula9ex2;

public class Administrador extends Faculdade {
        
    public Administrador(){
        
    }
    
    
    public String toString(){
        
        // Sobrecarga
        return this.getClass().getCanonicalName() + "" + this.getNome();
    }
}
