
public class Media{
	public double calcularMedia(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public boolean alunoAprovado(double nota1, double nota2, double nota3) {
		return calcularMedia(nota1, nota2, nota3) >= 7.0;
	}
}
