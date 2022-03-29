package aula8ex2;

public class Principal {
    // Composicao
    // tem um
    public static void main(String[] args){
        
        Placa placa = new Placa();
        placa.setTipo("Vire a direita");
        System.out.println(placa);
        System.out.print("\n");
        
        Placa aviso = new Placa("aviso", "29/03", "UTFPR", "vermelho");
        System.out.println(aviso);
        System.out.print("\n");
        
        Semaforo sf = new Semaforo();
        System.out.println(sf);
        System.out.print("\n");
        
        Semaforo praca = new Semaforo("praca", "29/03", "Jd. Paraiso", 10.0f);
        System.out.println(praca);
    }
        
}
