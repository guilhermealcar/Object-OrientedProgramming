package Ex2;

// Inicio da Classe Operacoes
public class Operacoes {
	float n1, n2;
	
	public Operacoes(float n1, float n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void soma() {
		System.out.println(n1 + n2);
    }
	
	public void subtracao() {
		System.out.println(n1 - n2);
	}
	
	public void divisao() {
		System.out.println(n1 / n2);
	}
	
	public void multiplicacao() {
		System.out.println(n1 * n2);
	}
}
