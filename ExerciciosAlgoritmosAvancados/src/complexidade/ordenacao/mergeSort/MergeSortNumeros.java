package complexidade.ordenacao.mergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(64, 34, 25, 12, 22, 11, 90));
		 
		MergeSortGenerics.mergeSortNumeros(numeros);
		
		System.out.println(numeros);
	}
}