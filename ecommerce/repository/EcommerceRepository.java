package ecommerce.repository;

import ecommerce.model.Livro;

public interface EcommerceRepository {
	void adicionarItem(Livro livro, int quantidade);
    float calcularTotal(); 
}
