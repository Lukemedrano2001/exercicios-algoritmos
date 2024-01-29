package complexidade.ordenacao.insertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(64, 34, 25, 12, 22, 11, 90));
		
		 InsertionSortGenerics.insertionSort(numeros);
		
		System.out.println(numeros);
	}
}