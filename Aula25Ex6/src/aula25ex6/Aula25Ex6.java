package aula25ex6;

public class Aula25Ex6 {
    public interface IMaterialEscolar {
        @Override
        public abstract String toString();
    }
    public class Caderno implements IMaterialEscolar {
        @Override
        public String toString(){return this.getClass().getSimpleName(); }
    }
    public class Caneta implements IMaterialEscolar {
        @Override
        public String toString(){return this.getClass().getSimpleName(); }
    }
    public class Lapis implements IMaterialEscolar {
        @Override
        public String toString(){return this.getClass().getSimpleName(); }
    }
    public class Borracha implements IMaterialEscolar {
        @Override
        public String toString(){return this.getClass().getSimpleName(); }
    }

    public class Prateleira {
        private IMaterialEscolar interfaceMaterial;
        public Prateleira(IMaterialEscolar interfaceMaterial) {
            setMaterialEscolar(interfaceMaterial);
        }
        public void setMaterialEscolar(IMaterialEscolar interfaceMaterial) {
            this.interfaceMaterial = interfaceMaterial;
        }
        @Override
        public String toString(){ return this.interfaceMaterial.toString(); }
    }


    public Aula25Ex6(){

        Prateleira  prateleira = new Prateleira( new Caderno() );
        System.out.println( prateleira );

        Prateleira prateleira2 = new Prateleira( new Caneta() );
        System.out.println( prateleira2 );

        prateleira.setMaterialEscolar(new Lapis() );
        System.out.println(prateleira );
    }


      public static void main(String [] args ){

            new Aula25Ex6();
     }

}
