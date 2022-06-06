package aula27ex3;
// Superclasse: MaterialEscolar (método X, Y, Z)
// Subclasse: Borracha          (método X, Y, Z)(Heranca) + A, B, C (proprios subclasse)

//MaterialEscolar material = new Borraca();

//((Borracha) material).metodoA();    // Superclasse invoca o metodo da subclasse

public class Aula27Ex3 {

    public interface IMaterialEscolar{
        public abstract String toString();
    }
    
    public abstract class MaterialEscolar implements IMaterialEscolar{
        public MaterialEscolar(){
            imprimirFilho();
        }
        public void imprimirFilho(){
            System.out.println(this);   //this do filho
        }
    }
    
    public class Borracha extends MaterialEscolar{
        public String toString(){return "ESTOU NO FILHO";}
    }
    
    public Aula27Ex3(){
        Borracha borracha = new Borracha();
    }
    
    public static void main(String[] args) {
        
        new Aula27Ex3();
    }
    
}
