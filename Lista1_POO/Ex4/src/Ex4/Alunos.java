package Ex4;

public class Alunos {

	public double[][] alunos = new double[4][4];
	
	public Alunos() {
		this.aleatorio();
	}
	
	public void aleatorio() {
		for(int l=0; l<4; l++) {
			for(int c=0; c<4; c++) {
				this.alunos[l][c] = (Math.random() * 10);
			}
		}
	}
	
	public void menor() {
		// Menor valor tem que ser o primeiro para entao ser substituido
		double menor = this.alunos[0][0];
		int menorAluno = 0;
		
		for(int l=0; l<4; l++) {
			for(int c=0; c<4; c++) {
				if(this.alunos[l][c] < menor) {
					menor = this.alunos[l][c];
					menorAluno = l;
				}
			}
		}
		
		System.out.println("Menor nota: " + menor);
		System.out.println("Aluno: " + menorAluno);
		System.out.printf("\n\n");
	}
	
	public void maior() {
		// Maior valor tem que ser o primeiro para entao ser substituido
		double maior = this.alunos[0][0];
		int maiorAluno = 0;
		
		for(int l=0; l<4; l++) {
			for(int c=0; c<4; c++) {
				if(this.alunos[l][c] > maior) {
					maior = this.alunos[l][c];
					maiorAluno = l;
				}
			}
		}
		
		System.out.println("Maior nota: " + maior);
		System.out.println("Aluno: " + maiorAluno);
		System.out.printf("\n\n");
	}
	
	public void media() {
		double media;
		double soma;
		
		for(int l=0; l<4; l++) {
			// Inicializa media inicial como 0
			media = 0;
			soma = 0;
			for(int c=0; c<4; c++) {
				soma += this.alunos[l][c];
			}
			media = soma / 4;
			System.out.println("Média do aluno " + l + ": " + media);
		}
	}
	
	
}
