import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetodoTesteAprovarEmprestimo {

	@Test
	void testeAprovarEmprestimo() {
		Emprestimo emprestimo = new Emprestimo();
		boolean emprestimoValido = emprestimo.aprovarEmprestimo(1000, 5000);
		assertEquals(true, emprestimoValido, "Valor do emprestimo ultrapassa o limite");
	}

}
