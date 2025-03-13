import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestesFrquencia {
	
	static Frequencia freq;
	
	@BeforeAll
	static void setup() {
		freq = new Frequencia();
	}
	
	@Test
	void testeVerificarPresenca() {
		freq.registrarPresenca("Gabi", true);
		boolean presencaVerificada = freq.verificarPresenca("Gabi");
		assertEquals(true, presencaVerificada, "Aluno(a) não está presente");
	}

}
