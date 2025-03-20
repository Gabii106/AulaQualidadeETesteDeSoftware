import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestesEstoque {
	
static Estoque est;
	
	@BeforeAll
	static void setup() {
		est = new Estoque();
	}

	@Test
	void testeProdutoDisponivel() {
		est.adicionarProduto("Celular", 2);
		
		boolean estaDisponivel = est.verificarDisponibilidade("Celular", 1);
		assertEquals(true, estaDisponivel, "Produto não disponível");
	}
	
	@Test
	void testeQuantDpsVenda() {
		est.adicionarProduto("Bola", 3);
		
		est.venderProduto("Bola", 2);
		
		int quantRestante = est.getQuantidadeProduto("Bola");
		assertEquals(1, quantRestante, "Quantidade em estoque errada");
	}
	

}
