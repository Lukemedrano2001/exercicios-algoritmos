package complexidade.ordenacao.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortNumeros {
	public static void main(String[] args) {
		 List<Integer> numeros = new ArrayList<Integer>(List.of(64, 34, 25, 12, 22, 11, 90));
		 
		 BubbleSortGenerics.bubbleSort(numeros);
		 
		 System.out.println(numeros);
	}
}