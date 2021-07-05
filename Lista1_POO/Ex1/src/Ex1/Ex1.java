package Ex1;


import java.util.Scanner;
import java.lang.Math;

// Inicio da classe
public class Ex1 {
	
	// Inicio da main
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float n1;
		float n2;
		
		System.out.print("Primeiro número: ");
		n1 = entrada.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = entrada.nextFloat();
		
		System.out.println(Math.abs(n1));
		
		System.out.println(Math.ceil(n1));
		
		System.out.println(Math.cos(n1));
		
		System.out.println(Math.exp(n1));
		
		System.out.println(Math.floor(n1));
		
		System.out.println(Math.log(n1));
		
		System.out.println(Math.max(n1, n2));
		
		System.out.println(Math.min(n1, n2));
		
		System.out.println(Math.pow(n1, n2));
		
		System.out.println(Math.sqrt(n1));
	}// Fim da main
}// Fim da classe