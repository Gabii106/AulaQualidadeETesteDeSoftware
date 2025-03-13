import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<String> itens = new ArrayList<>();
	
	public void adicionarItem(String item) {
		itens.add(item);
	}
	
	public int getQuantidadeItens() {
		return itens.size();
	}
}

