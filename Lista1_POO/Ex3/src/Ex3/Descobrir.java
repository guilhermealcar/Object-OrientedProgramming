package Ex3;

public class Descobrir {

	private int aleatorio;
	
	public Descobrir() {
		this.aleatorio = (int)(1 + Math.random() * 10);
	}
	
	public String descobrir(int n) {
		String result = "Acertou!";
		
		if(n > this.aleatorio)
			result = "Muito alto";
		else
			if(n < this.aleatorio)
				result = "O número é maior que isso...";
		
		System.out.println(result);
		return result;
	}
	
	public int getDescobrir() {
		return this.aleatorio;
	}
}
