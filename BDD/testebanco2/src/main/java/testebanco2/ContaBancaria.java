package testebanco2;

public class ContaBancaria {
	public boolean numeroValido(String numeroConta) {
		return numeroConta.matches("\\d{8}");
	}
}
