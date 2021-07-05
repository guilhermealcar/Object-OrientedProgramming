package Ex6;

public class Computador {

	public String nome;
	public String marca;
	public Data data;
	
	// Cria a classe Data
	public Computador() {
		this.data = new Data();
	}
	
	public Computador setNome(String temp) {
		this.nome = temp;
		return this;
	}
	
	public Computador setMarca(String temp) {
		this.marca = temp;
		return this;
	}
	
	public Computador setData(int d, int m, int a) {
		this.data.setDia(d, m, a);
		return this;
	}
}
