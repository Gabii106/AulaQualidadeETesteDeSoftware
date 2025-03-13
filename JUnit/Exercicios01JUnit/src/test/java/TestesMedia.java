import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestesMedia {
	
	static Media media;
	
	@BeforeAll
	static void setup() {
		media = new Media();
	}

	@Test
	void testeCalcularMedia() {
		double nota01 = 10.0;
		double nota02 = 8.0;
		double nota03 = 9.0;
		
		double mediaCalculada = media.calcularMedia(nota01, nota02, nota03);
		
		assertEquals(9.0, mediaCalculada, "Média está incorreta");
	}
	
	@Test
	void testeAlunoAprovado() {
		double nota01 = 10.0;
		double nota02 = 8.0;
		double nota03 = 9.0;
		
		boolean alunoAprovado = media.alunoAprovado(nota01, nota02, nota03);
		
		assertEquals(true, alunoAprovado, "Aluno não aprovado");
	}
	
	

}
