package Ex8;

public class Cliente {

	public String nome;
	public Data dataNas;
	
	public Cliente() {
		this.dataNas = new Data(0, 0, 0);
	}
	
	public void setNome(String var) {
		this.nome = var;
	}
	
	public void setData(int d, int m, int a) {
		this.dataNas.setData(d, m, a);
	}
}
