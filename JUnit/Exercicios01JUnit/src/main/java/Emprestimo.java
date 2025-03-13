
public class Emprestimo {
	public boolean aprovarEmprestimo(double rendaMensal, double valorSolicitado) {
		return valorSolicitado <= rendaMensal * 5;
	}
}
