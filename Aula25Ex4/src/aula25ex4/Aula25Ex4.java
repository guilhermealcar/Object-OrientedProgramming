package aula25ex4;

public class Aula25Ex4 {

    public class ObjetosDaPapelaria{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    public class Caderno extends ObjetosDaPapelaria{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    public class Caneta extends ObjetosDaPapelaria{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    public class Lapis extends ObjetosDaPapelaria{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    public class Borracha extends ObjetosDaPapelaria{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    
    public class Bancada{
        private ObjetosDaPapelaria obj;
        public Bancada(ObjetosDaPapelaria obj){
            setObjetosDaPapelaria(obj);
        }
        public void setObjetosDaPapelaria(ObjetosDaPapelaria obj){
            this.obj = obj;
        }
        @Override
        public String toString(){return this.obj.toString();}
    }
    
    public class Prateleira{
        private ObjetosDaPapelaria obj;
        public Prateleira(ObjetosDaPapelaria obj){
            setObjetosDaPapelaria(obj);
        }
        public void setObjetosDaPapelaria(ObjetosDaPapelaria obj){
            this.obj = obj;
        }
        @Override
        public String toString(){return this.obj.toString();}
    }
    
    public Aula25Ex4(){
        
        Bancada bancada = new Bancada(new Lapis());
        System.out.println(bancada);
        
        Prateleira prateleira = new Prateleira(new Caderno());
        System.out.println(prateleira);
    }
    
    public static void main(String[] args) {
        
        new Aula25Ex4();
    }
    
}
