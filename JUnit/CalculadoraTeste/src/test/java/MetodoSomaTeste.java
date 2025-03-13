import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MetodoSomaTeste {
	
	static Calculadora calc;
	
	@BeforeAll
	static void setup() {
		calc = new Calculadora();
	}

	@Test
	@DisplayName("Testa a soma de 2 números na classe calculadora no método calc.soma")
	void testeSoma() {
		int resultado = calc.soma(2, 3);
		assertEquals(5, resultado);
	}
	
	@Test
	@DisplayName("Testa a subtração de 2 números na classe calculadora no método calc.subtrai")
	void testeSubtrai() {
		int expected = 0;
		int actual = calc.subtrai(3, 3);
		assertEquals(expected, actual, "Esperava "+expected+" e retornado: "+actual);
	}
	
	@Test
	@DisplayName("Testa a multiplicação de 2 números na classe calculadora no método calc.multiplica")
	void testeMultiplica() {
		int expected = 9;
		int actual = calc.multiplica(3, 3);
		assertEquals(expected, actual, "Esperava "+expected+" e retornado: "+actual);
	}
	
	@Test
	@DisplayName("Testa a divisão de 2 números na classe calculadora no método calc.divide")
	void testeDivide() {
		int expected = 1;
		int actual = calc.divide(3, 3);
		assertEquals(expected, actual, "Esperava "+expected+" e retornado: "+actual);
	}
	
	@Test
	@DisplayName("Testa a divisão por 0 na classe calculadora no método calc.divide")
	void testeDivide0() {
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(10, 0);
		}, "A divisão não pode ser por 0");
	}

}
