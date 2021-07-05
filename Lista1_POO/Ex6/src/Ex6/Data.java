package Ex6;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	// Data inicial tem que ser 0
	public Data() {
		setDia(0, 0, 0);
	}
	
	public void setDia(int d, int m, int a) {
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 9 || m == 10 || m == 12) {
			this.mes = m;
			if(d >= 1 && d <= 31) {
				this.dia = d;
			}
			else {
				System.out.println("Esse dia não existe nesse mês.");
			}
			this.ano = a;
		}
		if(m == 2) {
			this.mes = m;
			if(d >= 1 && d <= 28) {
				this.dia = d;
			}
			else {
				System.out.println("Esse dia não existe nesse mês.");
			}
			this.ano = a;
		}
		if(m == 4 || m == 6 || m == 8 || m == 11) {
			this.mes = m;
			if(d >= 1 && d <= 30) {
				this.dia = d;
			}
			else {
				System.out.println("Esse dia não existe nesse mês.");
			}
			this.ano = a;
		}
	}
}
