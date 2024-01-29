package complexidade.busca.binaria;

import java.util.ArrayList;
import java.util.List;

public class BuscaBinariaString {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		
		System.out.println(BuscaBinariaGenerics.buscaBinariaArray(nomes, "Roberto"));
	}
}