package ecommerce.repository;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import ecommerce.model.Livro;

public class CarrinhoDeCompras implements EcommerceRepository{
	private final Map<String, Integer> itens;

    CarrinhoDeCompras() {
        this.itens = new HashMap<>();
}

	@Override
	public void adicionarItem(Livro livro, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calcularTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
    public void adicionarItem(Livro livro, int quantidade) {
        itens.merge(livro.nome, quantidade, Integer::sum);
    }

    @Override
    public float calcularTotal() {
        float total = 0;
        for (Map.Entry<String, Integer> entry : itens.entrySet()) {
            String nome = entry.getKey();
            int quantidade = entry.getValue();
            AbstractMap<K, V> livro;
			total += livro.get(nome).calcularPreco() * quantidade;
        }
        return total;
    }
}
