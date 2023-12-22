package ecommerce.model;

public abstract class Ecommerce {
	private  String nome;
	private  float preco;

    

    public Ecommerce(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void calcularPreco() {
		
	}
	
}

