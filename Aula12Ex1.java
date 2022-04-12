package aula12ex1;

import java.util.Scanner;

public class Aula12Ex1 {

    public static void main(String[] args) {
        
        String menu = 
                "\n1) CAIXA ELETRONICO"+
                "\n2) PIX"+
                "\nEscolha a opcao (X - sair):";
        
        Scanner entradaMenu, entradaCaixa, entradaPIX;
        String entrada;
        CaixaEletronico caixa;
        int numConta, numTerminal;
        String chavePIX;
        float valor;
        PIX pix;
        
        do {
            System.out.println(menu);
            entradaMenu = new Scanner(System.in);
            entrada = entradaMenu.next();
            switch(entrada){
                case "1":
                    entradaCaixa = new Scanner(System.in);
                    
                    System.out.println("Informe o numero da conta: ");
                    numConta = Integer.parseInt(entradaCaixa.next());
                    
                    System.out.println("Informe o numero do terminal: ");
                    numTerminal = Integer.parseInt(entradaCaixa.next());
                    
                    caixa = new CaixaEletronico(numConta, numTerminal);
                    
                    System.out.println("Valor a pagar:");
                    valor = Float.parseFloat(entradaCaixa.next());
                    
                    caixa.pagar(valor);
                    break;
                
                case "2":
                    entradaPIX = new Scanner(System.in);
                    
                    System.out.println("Informe numero da conta:");
                    numConta = Integer.parseInt(entradaPIX.next());
                    
                    System.out.println("Informe numero da chave PIX:");
                    chavePIX = entradaPIX.next();
                    
                    pix = new PIX(chavePIX, numConta);
                    
                    System.out.println("Valor a pagar:");
                    valor = Float.parseFloat(entradaPIX.next());
                    
                    pix.pagar(valor);
                    break;
                    
                case "X":
                    System.out.println("FIM");
                    break;
                    
                default:
                    System.out.println("\nOpcao invalida");
                    break;
            }
        } while (!entrada.equals("X"));
        
        /*
        int numConta = 123;
        int numTerminal = 456;
        
        CaixaEletronico caixa = new CaixaEletronico(numConta, numTerminal);
    */
    }
    
}
