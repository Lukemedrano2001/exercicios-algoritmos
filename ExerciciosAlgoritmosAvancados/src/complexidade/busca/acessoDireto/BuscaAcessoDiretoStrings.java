package complexidade.busca.acessoDireto;

import java.util.ArrayList;
import java.util.List;

public class BuscaAcessoDiretoStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		
		System.out.println(BuscaAcessoDiretoGenerics.buscaAcessoDireto(nomes, 2));
	}
}