
public class Desconto{
	public double calcularPrecoComDesconto(double preco, double desconto) {
		if (desconto < 0 || desconto >= 100) {
			throw new ArithmeticException("Desconto inválido!");
		}
		return preco - (preco * (desconto / 100));
	}
}
