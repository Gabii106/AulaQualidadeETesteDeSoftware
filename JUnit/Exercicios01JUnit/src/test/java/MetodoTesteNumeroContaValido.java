import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetodoTesteNumeroContaValido {

	@Test
	void testeNumeroContaValido() {
		ContaBancaria conta = new ContaBancaria();
		boolean contaValida = conta.numeroContaValido("12345678");
		assertEquals(true, contaValida, "Numero de caracteres inválido");
	}

}
