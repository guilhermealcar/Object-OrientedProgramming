package aula 31;

public class Aula31 {
	
	public interface Verifica {
		public abstract void validar();
	}
	
	public abstract class MaterialEscolar implements Verifica {
		private int numero = 0;
		private String nome = " ";
		private Fornecedor fornecedor = new Fornecedor();
		
		public abstract void verificaMaterialEscolar ();
		
		public int getNumero() throws NumException {
			return numero;
		}
		
		public void setNumero(int numero) throws NumException {
			this.numero = numero;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Fornecedor getFornecedor() {
			return fornecedor;
		}
		
		public void setFornecedor(Fornecedor fornecedor) {
			this.fornecedor = fornecedor;
		}
		
		public void validar() {
			if(numero % 2 == 0) {
				System.out.println("Numero eh par");
			} else {
				System.out.println("Numero eh impar");
			}
		}
		
		public String toString() {
			return "MaterialEscolar{"+
					"numero=" + numero+
					", nome=" + nome+
					", fornecedor=" + fornecedor+
					"}";
		}
	}
	
	public final class Fornecedor {
		private int numero = 0;
		private String rua = " ";
		
		public int getNumero() {
			return numero;
		}
		
		public void setNumeroO(int numero) {
			this.numero = numero;
		}
		
		public String getRua() {
			return rua;
		}
		
		public void setRua(String rua) {
			this.rua = rua;
		}
		
		public String toString() {
			return "Fornecedor{"+
					"numero=" + numero+
					", rua=" + rua+
					"}";
		}
	}
	
	public final class Etiqueta extends MaterialEscolar {
		private int qrcode = 0;
		
		publilc int getQrcode() {
			return qrcode;
		}
		
		public void setQrcode(int qrcode) {
			this.qrcode = qrcode;
		}
		
		public void verificaMaterialEscolar() {
			if(qrcode >= 10 && qrcode <= 50) {
				System.out.println("Etiqueta valida");
			} else {
				System.out.println("Etiqueta invalida");
			}
		}
		
		public String toString() {
			return "Etiqueta{"+
					"qrcode=" + qrcode+
					"}";
		}
	}
	
	public final class Livros extends MaterialEscolar {
		private int ISBN = 0;
		private Etiqueta etiqueta = new Etiqueta();
		
		public int getISBN() {
			return ISBN;
		}
		
		public void setISBN(int ISBN) {
			this.ISBN = ISBN;
		}
		
		public Etiqueta getEtiqueta() {
			return etiqueta;
		}
		
		public void setEtiqueta(Etiqueta etiqueta) {
			this.etiqueta = etiqueta;
		}
		
		public void verificaMaterialEscolar() {
			if(getEtiqueta().getNome().length() > 20) {
				System.out.println("Nome invalido");
			} else {
				System.out.println("Nome valido");
			}
		}
		
		public String toString() {
			return "Livros{"+
					"ISBN=" + ISBN+
					"etiqueta=" + etiqueta+
					"}";
		}
	}
	
	public class NumException extends Exception {
		public void imprimirExcecao() throws Exception {
			System.out.println("ERRO: numero negativo");
		}
	}
	
	public Aula31() throws Exception {
		Livros livro = new Livros();
		
		// Entradas
		try {
			livro.setNumero(-5);	// setNumero vem por heranca da classe MaterialEscolar
		} catch(NumException objeto) {
			if(livro.getNumero() < 0) {
				objeto.imprimirExcecao();
			}
		}
		livro.setISBN(456);	// setISBN vem da classe Livros
		livro.getFornecedor().setRua("789");	// setRua vem da classe Fornecedor
		livro.getEtiqueta().setQrcode(40);	// numero da etiqueta instanciado na classe Livros
		livro.getEtiqueta().setNome("nome");	// nome instanciado na classe MaterialEscolar que etiquetas recebe por heranca e esta instanciado em Livros
		
		// Saidas
		livro.getNumero();	// mostra o numero
		livro.validar();	// par ou impar
		livro.getISBN();	// mostra o ISBN
		livro.getFornecedor().getRua();	// mostra a rua
		livro.getFornecedor().getNumero();	// numero endereco
		livro.getEtiqueta().getQrcode();	// numero da etiqueta
		livro.getEtiqueta().verificaMaterialEscolar();	// se o n da etiqueta é valido ou nao
		livro.getEtiqueta().getNome();	// nome da etiqueta
		livro.verificaMaterialEscolar();	// verifica se o nome é valido ou nao
	}
	
	public static void main(String[] args) throws Exception {
		new Aula31();
	}
}