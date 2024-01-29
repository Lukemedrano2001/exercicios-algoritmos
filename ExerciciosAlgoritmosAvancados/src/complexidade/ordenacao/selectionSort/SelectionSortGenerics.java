package complexidade.ordenacao.selectionSort;

import java.util.List;

public class SelectionSortGenerics {
	public static<TIPO extends Comparable<TIPO>> void selectionSort(List<TIPO> nomes) {
		// Complexidade de tempo: O(n^2)
		// Complexidade de espaço: O(1)
		
		// For -> O(n)
		for(int i = 0; i < nomes.size(); i++) {
			int valorMinimo = i;
			
			// For -> O(n)
			for(int j = i + 1; j < nomes.size(); j++) {
				if(nomes.get(j).compareTo(nomes.get(valorMinimo)) < 0) {
					valorMinimo = j;
				}
			}
			
			TIPO valorTemp = nomes.get(i);
			nomes.set(i, nomes.get(valorMinimo));
			nomes.set(valorMinimo, valorTemp);
		}
	}
}