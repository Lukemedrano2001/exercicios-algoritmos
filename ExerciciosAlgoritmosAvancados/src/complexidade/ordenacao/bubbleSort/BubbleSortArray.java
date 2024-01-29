package complexidade.ordenacao.bubbleSort;

import java.util.Arrays;

public class BubbleSortArray {
	public static void main(String[] args) {
		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		bubbleSortArray(numeros);
		
		System.out.println(Arrays.toString(numeros));
	}
	
	/* Bubble Sort: O Bubble Sort é um algoritmo de ordenação que compara e troca repetidamente os elementos adjacentes até que o array esteja ordenado. 
		1. Iteração Externa: Percorre o array da esquerda para a direita.
		2. Comparação e Troca: Compara elementos adjacentes e os troca se estiverem na ordem errada.
		3. Repetição: Repete as etapas 1 e 2 até que nenhum elemento precise ser trocado.
	*/
	public static void bubbleSortArray(int[] array){
		// Complexidade de tempo -> O(n^2) no pior e médio caso
		// Complexidade de tempo -> O(n) no melhor caso
		// Complexidade de espaço -> O(1)
		// Fórmula: For * For 
		// O(n) * O(n) => O(n^2)
		
		// For -> O(n)
		for(int i = 0; i < array.length - 1; i++) {
			// For -> O(n)
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					int valorTemp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = valorTemp;
				}
			}
		}
	}
}