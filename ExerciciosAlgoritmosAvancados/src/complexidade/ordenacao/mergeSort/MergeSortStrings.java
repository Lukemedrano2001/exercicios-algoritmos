package complexidade.ordenacao.mergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		
		MergeSortGenerics.mergeSortNumeros(nomes);
		
		System.out.println(nomes);
	}
}