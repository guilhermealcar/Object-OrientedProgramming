package aula25ex5;

public class Aula25Ex5 {
     public interface IFruta {
             public abstract String toString();
      }
      public class Maca implements IFruta {
            public String toString(){   return this.getClass().getSimpleName(); }
      }
      public class Abacate implements IFruta {
            public String toString(){   return this.getClass().getSimpleName(); }
      }

      public class Prateleira {
            private IFruta interfaceFruta;
            public Prateleira(IFruta interfaceFruta) {
                     setFruta(interfaceFruta);
            }
            public void setFruta(IFruta interfaceFruta) {
                   this.interfaceFruta = interfaceFruta;
            }
            public String toString(){ return this.interfaceFruta.toString(); }
      }


      public Aula25Ex5(){

             Prateleira  prateleira = new Prateleira( new Maca() );
             System.out.println( prateleira );

            Prateleira prateleira2 = new Prateleira( new Abacate() );
            System.out.println( prateleira2 );

            prateleira.setFruta( new Abacate() );
            System.out.println( prateleira );
      }


      public static void main(String [] args ){

            new Aula25Ex5();
     }

}

