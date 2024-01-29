package complexidade.ordenacao.selectionSort;

import java.util.Arrays;

public class SelectionSortArray {
	public static void main(String[] args) {
		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		selectionSortArray(numeros);
		
		System.out.println(Arrays.toString(numeros));
	}
	
	/* Selection Sort: É um algoritmo de ordenação que seleciona o menor elemento a cada iteração e o move para a posição correta no array. 
		1. Iteração Externa: Percorre o array da esquerda para a direita.
		2. Encontrar Mínimo: Para cada posição, encontra o menor elemento na parte não ordenada do array.
		3. Troca: Troca o elemento encontrado na etapa anterior com o elemento na posição atual da iteração externa.
	*/
	public static void selectionSortArray(int[] array) {
		// Complexidade de tempo -> O(n^2) em todos os casos
		// Complexidade de espaço -> O(1)
		
		// Fórmula: For * For 
		// O(n) * O(n) => O(n^2)
		
		// For -> O(n)
		for(int i = 0; i < array.length - 1; i++) {
			int valorMinimo = i;
			// For -> O(n)
			for(int j = i; j < array.length; j++) {
				if(array[valorMinimo] > array[j]) {
					valorMinimo = j;
				}
			}
			
			int valorTemp = array[i];
			array[i] = array[valorMinimo];
			array[valorMinimo] = valorTemp;
		}
	}
}