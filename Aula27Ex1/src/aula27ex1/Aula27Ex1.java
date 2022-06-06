// Design Pattern: Papelaria

package aula27ex1;

public class Aula27Ex1 {

    public interface IMaterialEscolar{
        @Override
        public abstract String toString();
    }
    public class Caderno implements IMaterialEscolar{
        @Override
        public String toString(){return "CADERNO";}
    }
    public class Borracha implements IMaterialEscolar{
        @Override
        public String toString(){return "BORRACHA";}
    }
    //-------
    public interface IFiltro{
        public abstract void toString(IMaterialEscolar material);
    }
    public class FiltroCaderno implements IFiltro{
        @Override
        public void toString(IMaterialEscolar material){
            System.out.println("Filtro Caderno: " + material.toString());
        }
    }
    public class FiltroBorracha implements IFiltro{
        @Override
        public void toString(IMaterialEscolar material){
            System.out.println("Filtro Borracha: " + material.toString());
        }
    }
    
    public void imprimir(IFiltro filtro, IMaterialEscolar material){
        filtro.toString(material);
    }
    
    public Aula27Ex1(){
        IFiltro filtro = new FiltroCaderno();
        IMaterialEscolar material = new Caderno();
        imprimir(filtro, material); //CADERNO
        
        material = new Borracha();
        imprimir(filtro, material); //BORRACHA
        
        filtro = new FiltroBorracha();
        imprimir(filtro, material); //BORRACHA
        
        filtro = new FiltroCaderno();
        imprimir(filtro, material); //BORRACHA
    }
    
    public static void main(String[] args) {
        new Aula27Ex1();
    }
    
}
