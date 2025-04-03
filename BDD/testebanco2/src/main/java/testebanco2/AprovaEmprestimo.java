package testebanco2;

public class AprovaEmprestimo {
	public boolean aprovarEmprestimo(double rendaMensal, double valorSolicitado) {
		return valorSolicitado <= rendaMensal * 5;
	}
}

