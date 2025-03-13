import java.util.HashMap;
import java.util.Map;

public class Estoque {
	private Map<String, Integer> produtos = new HashMap<>();
	
	public void adicionarProduto(String nome, int quantidade) {
		produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
	}
	
	public boolean verificarDisponibilidade(String nome, int quantidade) {
		return produtos.getOrDefault(nome, 0) >= quantidade;
	}
	
	public void venderProduto(String nome, int quantidade) {
		if (verificarDisponibilidade(nome, quantidade)) {
			produtos.put(nome, produtos.get(nome) - quantidade);
		} else {
			throw new IllegalArgumentException("Estoque insuficiente");
		}
	}
	
	public int getQuantidadeProduto(String nome) {
		return produtos.getOrDefault(nome, 0);
	}
}