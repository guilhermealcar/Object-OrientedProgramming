package aula25ex3;

public class Aula25Ex3 {

    public class Fruta{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    public class Maca extends Fruta{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    public class Abacate extends Fruta{
        @Override
        public String toString(){ return this.getClass().getSimpleName();}
    }
    
    public class Prateleira{
        private Fruta fruta;
        public Prateleira(Fruta fruta){
            setFruta(fruta);
        }
        public void setFruta(Fruta fruta){
            this.fruta = fruta;
        }
        @Override
        public String toString(){return this.fruta.toString();}
    }
    
    public Aula25Ex3(){
        
        Prateleira prateleira = new Prateleira(new Maca());
        System.out.println(prateleira);
        
        Prateleira prateleira2 = new Prateleira(new Abacate());
        System.out.println(prateleira2);
        
        prateleira.setFruta(new Abacate());
        System.out.println(prateleira);
    }
    
    public static void main(String[] args) {
        
        new Aula25Ex3();
    }
    
}
