package ecommerce.model;

public class Livro extends Ecommerce{

	public Livro(String nome, float preco) {
		private String autor;
 
	    Livro(String nome, float preco, String autor) {
	        super(nome, preco);
	        this.autor = autor;
	    }

	    @Override
	    public void float calcularPreco() {
	        return this.preco * 1.1; // Exemplo de sobrecarga
	    }
} 
