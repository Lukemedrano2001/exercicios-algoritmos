package complexidade.busca.linear;

import java.util.ArrayList;
import java.util.List;

public class BuscaLinearStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		
		System.out.println(BuscaLinearGenerics.buscaLinear(nomes, "Roberto"));
	}
}