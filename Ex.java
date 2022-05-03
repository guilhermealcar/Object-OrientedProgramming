package aula18ex1;

public class Ex extends Exception { // excecao verificada
                                    //extends RuntimeException: excecao nao-verificada
    public Ex() {
        super("Mensagem de erro");
    }
    
    public float cDenominador(float denominador) {
        return 1.0f;
    }
    
}
