package complexidade.ordenacao.selectionSort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSortStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));

        SelectionSortGenerics.selectionSort(nomes);

        System.out.println(nomes);
	}
}