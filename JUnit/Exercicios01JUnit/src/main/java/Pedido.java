import java.util.HashMap;
import java.util.Map;

public class Pedido {
	private Map<String, Double> produtos = new HashMap<>();
	private Map<String, Integer> carrinho = new HashMap<>();
	
	public void adicionarProduto(String nome, double preco) {
		produtos.put(nome, preco);
	}
	
	public void adicionarAoCarrinho(String nome, int quantidade) {
		if (!produtos.containsKey(nome)) {
			throw new IllegalArgumentException("Produto não encontrado");
		}
		carrinho.put(nome, carrinho.getOrDefault(nome, 0) + quantidade);
	}
	
	public double calcularTotal() {
		double total = 0.0;
		for (String produto : carrinho.keySet()) {
			total += produtos.get(produto) * carrinho.get(produto);
		}
		return total;
	}
}