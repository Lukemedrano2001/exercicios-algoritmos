package complexidade.ordenacao.bubbleSort;

import java.util.List;

public class BubbleSortGenerics {
	public static <TIPO extends Comparable<TIPO>> void bubbleSort(List<TIPO> lista){
		// Complexidade de algoritmo-> O(n^2)
		// Complexidade de espaço => O(1)
		
		// For -> O(n)
		for(int i = 0; i < lista.size() - 1; i++) {
			// For -> O(n)
			for(int j = 0; j < lista.size() - i - 1; j++) {
				if(lista.get(j).compareTo(lista.get(j + 1)) > 0) {
					TIPO valorTemp = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, valorTemp);
				}
			}
		}
	}
}