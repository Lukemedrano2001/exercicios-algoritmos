package complexidade.ordenacao.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));
		
		BubbleSortGenerics.bubbleSort(nomes);
		 
		System.out.println(nomes);
	}
}