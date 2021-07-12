package Ex8;

public class Principal {

	public static void main(String[] args) {
		Cliente[] c;
		
		c = new Cliente[5];
		
		c[0] = new Cliente();
		c[1] = new Cliente();
		c[2] = new Cliente();
		c[3] = new Cliente();
		c[4] = new Cliente();
		
		String[] nome = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
		
		for(int i=0; i<5; i++) {
			c[i].setNome(nome[i]);
			c[i].setData((int)(Math.random()*31), (int)(Math.random()*12), (int)(1900 + Math.random()*121));
		}
		
		System.out.println(c[2].nome);
		System.out.println(c[2].dataNas.toString());
		
		c[0] = null;
		c[1] = null;
		c[2] = null;
		c[3] = null;
		c[4] = null;
		
		System.gc();
	}
}
