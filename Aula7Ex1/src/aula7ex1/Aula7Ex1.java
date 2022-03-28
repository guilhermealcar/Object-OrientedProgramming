package aula7ex1;

public class Aula7Ex1 {

    public static void main(String[] args) {
        
        Veiculo monza; // Declaracao do obj
        monza = new Veiculo(); // Instanciacao
        
        monza.setPlaca("555").setValor(888);
        
        monza.setPlaca("999").setCor("azul").setValor(123);
    }
}
