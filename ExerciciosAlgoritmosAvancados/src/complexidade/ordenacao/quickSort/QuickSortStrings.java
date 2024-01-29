package complexidade.ordenacao.quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		 
		QuickSortGenerics.quickSort(nomes, 0, nomes.size() - 1);
		
		System.out.println(nomes);
	}
}