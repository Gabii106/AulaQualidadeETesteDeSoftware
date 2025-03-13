import java.util.HashMap;
import java.util.Map;

public class Frequencia {
	private Map<String, Boolean> presencas = new HashMap<>();
	
	public void registrarPresenca(String aluno, boolean presente) {
		presencas.put(aluno, presente);
	}
	
	public boolean verificarPresenca(String aluno) {
		return presencas.getOrDefault(aluno, false);
	}
}