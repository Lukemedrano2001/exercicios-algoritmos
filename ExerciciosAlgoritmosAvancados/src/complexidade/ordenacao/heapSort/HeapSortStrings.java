package complexidade.ordenacao.heapSort;

import java.util.ArrayList;
import java.util.List;

public class HeapSortStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		 
		HeapSortGenerics.heapSort(nomes);
		
		System.out.println(nomes);
	}
}