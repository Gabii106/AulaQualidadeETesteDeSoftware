package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testebanco2.ContaBancaria;

public class AbreContaSteps {
	public ContaBancaria conta;
	public boolean resultado ;

	@Given("Eu desejo abrir uma nova conta")
	public void euDesejoAbrirUmaNovaConta() {
	    conta = new ContaBancaria();
	}
	@When("O número da conta é {string}")
	public void oNúmeroDaContaÉ1234abcd(String nroconta) {
	    resultado = conta.numeroValido(nroconta);
	}
	@Then("O resultado esperado deve ser {string}")
	public void oResultadoEsperadoDeveSerTrue(String esperado) {
	    assertEquals(Boolean.parseBoolean(esperado), resultado);
	}
	
	/*@When("O número da conta é 1234abcd")
	public void oNúmeroDaContaÉ1234abcd(String nroconta) {
		resultado = conta.numeroValido(nroconta);
	}
	@Then("O resultado esperado deve ser false")
	public void oResultadoEsperadoDeveSerFalse(String esperado) {
		assertEquals(Boolean.parseBoolean(esperado), resultado);
	}*/
}
