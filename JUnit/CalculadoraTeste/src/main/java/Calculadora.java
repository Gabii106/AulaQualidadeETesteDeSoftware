
public class Calculadora {
	public int soma(int numeroA, int numeroB) {
		return numeroA+numeroB;
	}
	
	public int subtrai(int numeroA, int numeroB) {
		return numeroA-numeroB;
	}
	
	public int multiplica(int numeroA, int numeroB) {
		return numeroA*numeroB;
	}
	
	public int divide(int numeroA, int numeroB) {
		if(numeroB == 0) {
			throw new ArithmeticException("A divisão não pode ser por zero");
		}
		return numeroA/numeroB;
	}
}
