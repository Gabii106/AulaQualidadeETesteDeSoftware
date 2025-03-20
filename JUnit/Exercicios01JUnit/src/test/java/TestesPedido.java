import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesPedido {

	@Test
	void testeCalcularValor() {
		Pedido ped = new Pedido();
		
		ped.adicionarProduto("Celular", 500);
		ped.adicionarAoCarrinho("Celular", 2);
		
		double valorTotal = ped.calcularTotal();
		assertEquals(1000, valorTotal, "Valor Incorreto");
	}
	
	@Test
	void testeNaoTemProduto() {
		Pedido ped = new Pedido();
		
		ped.adicionarProduto("Celular", 500);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ped.adicionarAoCarrinho("Tablet", 2);
		}, "Produto existe");
	}

}
