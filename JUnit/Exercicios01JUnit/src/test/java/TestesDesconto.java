import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesDesconto {

	@Test
	void testeCalcularPrecoComDesconto() {
		Desconto desc = new Desconto();
		
		double valorComDesconto = desc.calcularPrecoComDesconto(100, 10);
		assertEquals(90, valorComDesconto, "Desconto errado");
	}
	
	@Test
	void testeCalcularPrecoComDesconto100() {
		//Fazer essa logica
	}

}
