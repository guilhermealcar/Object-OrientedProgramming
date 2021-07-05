package Ex3;

import java.util.Scanner;

public class Principal {

	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n=0;
		
		Descobrir objeto = new Descobrir();
		
		while(!objeto.descobrir(n).equals("Acertou!")) {
			System.out.println("\nDigite o número: ");
			n = entrada.nextInt();
		}
	}
}
