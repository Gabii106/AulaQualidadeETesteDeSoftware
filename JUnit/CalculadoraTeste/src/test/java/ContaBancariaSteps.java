import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContaBancariaSteps {
	
	ContaBancaria conta;

	
	@Given("Eu desejo criar um novo objeto conta")
	public void euDesejoCriarUmNovoObjetoConta() {
		conta = new ContaBancaria();
	}
	
	@When("É passado o número da conta {int} como argumento")
	public void éPassadoONúmeroDaContaComoArgumento(String nconta) {
	    conta.numeroValido(nconta);
	}
	
	@Then("Se a quantidade de digitos para a abertura da conta for {int} é retorna verdadeiro")
	public void seAQuantidadeDeDigitosParaAAberturaDaContaForÉRetornaVerdadeiro(Integer expected) {
	    
	}


}
