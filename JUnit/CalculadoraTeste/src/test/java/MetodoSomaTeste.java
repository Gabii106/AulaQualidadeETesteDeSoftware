import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(TestInstance.Lifecycle.PER_CLASS)
class MetodoSomaTeste {
	
	static Calculadora calc;
	
	@BeforeAll
	static void setup() {
		calc = new Calculadora();
	}

	@Order(1)
	@Test
	@DisplayName("Testa a soma de 2 números na classe calculadora no método calc.soma")
	@RepeatedTest(3)
	void testeSoma() {
		int resultado = calc.soma(2, 3);
		assertEquals(5, resultado);
	}
	
	@Order(2)
	@Test
	@DisplayName("Testa a subtração de 2 números na classe calculadora no método calc.subtrai")
	void testeSubtrai() {
		int expected = 0;
		int actual = calc.subtrai(3, 3);
		assertEquals(expected, actual, "Esperava "+expected+" e retornado: "+actual);
	}
	
	@Order(3)
	@Test
	@DisplayName("Testa a multiplicação de 2 números na classe calculadora no método calc.multiplica")
	void testeMultiplica() {
		int expected = 9;
		int actual = calc.multiplica(3, 3);
		assertEquals(expected, actual, "Esperava "+expected+" e retornado: "+actual);
	}
	
	@Order(4)
	@Test
	@DisplayName("Testa a divisão de 2 números na classe calculadora no método calc.divide")
	void testeDivide() {
		int expected = 1;
		int actual = calc.divide(3, 3);
		assertEquals(expected, actual, "Esperava "+expected+" e retornado: "+actual);
	}
	
	@Order(5)
	@Test
	@DisplayName("Testa a divisão por 0 na classe calculadora no método calc.divide")
	void testeDivide0() {
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(10, 0);
		}, "A divisão não pode ser por 0");
	}

}
