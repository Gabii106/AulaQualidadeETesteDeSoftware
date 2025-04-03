package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testebanco2.AprovaEmprestimo;

public class AprovaEmprestimoSteps {
	public AprovaEmprestimo solicitaEmprestimo;
	public boolean aprovado;
	public String rendamensal;
	
	@Given("Eu realizo a solicitação de empréstimo")
	public void euRealizoASolicitaçãoDeEmpréstimo() {
	    solicitaEmprestimo = new AprovaEmprestimo(); 
	}
	@When("E informo o valor da minha renda mensal {string}")
	public void eInformoOValorDaMinhaRendaMensal(String rendainformada) {
		rendamensal = rendainformada;
	}
	@When("E informo o valor do empréstimo {string}")
	public void eInformoOValorDoEmpréstimo(String valorsolicitado) {
		aprovado = solicitaEmprestimo.aprovarEmprestimo(Double.parseDouble(rendamensal), Double.parseDouble(valorsolicitado));
	}
	@Then("O empréstimo é aprovado")
	public void oEmpréstimoÉAprovado() {
	    assertFalse(aprovado);
	}
}
