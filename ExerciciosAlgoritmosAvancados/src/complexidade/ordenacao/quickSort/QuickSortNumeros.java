package complexidade.ordenacao.quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(64, 34, 25, 12, 22, 11, 90));
		
		QuickSortGenerics.quickSort(numeros, 0, numeros.size() - 1);
		
		System.out.println(numeros);
	}
}