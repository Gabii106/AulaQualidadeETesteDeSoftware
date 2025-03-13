import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarrinho {

	@Test
	void testeGetQuantidadeItens() {
		Carrinho car = new Carrinho();
		
		car.adicionarItem("Celular");
		int totalItems = car.getQuantidadeItens();
		
		assertEquals(1, totalItems, "Quantidade de itens errada");
	}

}
