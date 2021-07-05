package Ex2;

import javax.swing.*;
import java.util.Scanner;


// Inicio da Classe Principal
public class Principal{
	
	// Inicio da main
	public static void main(String[] args) {
		
		Operacoes op;
		
		float n1;
		float n2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		n1 = entrada.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = entrada.nextFloat();
		
		// Criando o objeto da classe Operacoes 
		op = new Operacoes(n1, n2);
		
		// Chamando os metodos contidos na classe Operacoes
		op.soma();
		op.subtracao();
		op.divisao();
		op.multiplicacao();
		
	}// Fim main
}// Fim Principal