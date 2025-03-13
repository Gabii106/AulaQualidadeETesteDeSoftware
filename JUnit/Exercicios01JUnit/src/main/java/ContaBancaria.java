public class ContaBancaria {
	public boolean numeroContaValido(String numeroConta) {
		return numeroConta.matches("\\d{8}");
	}
}
