package aula18ex1;

import java.util.Scanner;

public class Aula18Ex1 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("\nDigite o numerador: ");
        int numerador = obj.nextInt();
        
        System.out.print("\nDigite o denominador: ");
        int denominador = obj.nextInt();
        
        // Aritmetica de inteiros: não é permitida divisão por zero
        float resultado=0;
        
        try {
            /*
            if(denominador <= 0)
                throw new Ex();
            else
                resultado = (float)numerador / (float)denominador;
            */
            // 1) ArithmeticException (excecao nao-verificada)
            resultado = (float)numerador / (float)denominador;
            
            // 2) RuntimeException (excecao nao-verificada)
            //throw new RuntimeException();
            // Linha acima comentada pois só se pode executar esse ou o Exception
            // Não é possível executar ambos
            
            // 3) Exception
            throw new Exception();
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch(Ex e) {
            e.printStackTrace();
            denominador = (int) e.cDenominador(denominador);
            resultado = (float)numerador / (float)denominador;
        } catch (Exception e2) {
            System.out.println("Excecao 1");
        }
        
        
        System.out.println("\nResultado: " + resultado);
    }//fim main
    
}//fim classe