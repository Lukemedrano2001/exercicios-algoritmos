package complexidade.ordenacao.quickSort;

import java.util.Arrays;

public class QuickSortArray {
	public static void main(String[] args) {
		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		quickSortArray(numeros, 0, numeros.length - 1);
		
		System.out.println(Arrays.toString(numeros));
	}
	/* Quick Sort: É um algoritmo de ordenação que segue a estratégia "dividir para conquistar". 
		1. Escolha do Pivô: Um elemento é escolhido como pivô do array.
		2. Partição: O array é particionado em duas regiões, à esquerda elementos menores que o pivô e à direita elementos maiores que o pivô.
		3. Recursão: Chamadas recursivas são feitas para ordenar as sub-regiões à esquerda e à direita do pivô.
	*/
	public static void quickSortArray(int[] array, int inicio, int fim) {
		// Complexidade de tempo -> O(n log n) no melhor caso e médio caso
		// Complexidade de tempo -> O(n^2) no pior caso (array ordenado) e escolha do pivô for errada
		
		// Fórmula no melhor e médio caso: For * Recursao + For
		// O(n) * O(log n) + O(n) -> O(n log n)
		
		// Fórmula no pior caso: For * For + For
		// O(n) * O(n) + O(n) -> O(n^2)
		
		// Complexidade de espaço -> O(log n), devido a pilha de chamadas recursivas
		
		if(inicio >= fim) {
			return;	// Caso base
		}
		
		int pivo = particao(array, inicio, fim);
		// Recursão -> O(n)
		quickSortArray(array, inicio, pivo - 1);	// Partição a esquerda
		// Recursão -> O(n) no pior caso
		// Recursão -> O(log n) no melhor e médio caso
		quickSortArray(array, pivo + 1, fim);	// Partição a direita
	}
	
	public static int particao(int[] array, int inicio, int fim) {
		int pivo = array[fim];
		int i = inicio - 1;
		
		// For -> O(n)
		for(int j = inicio; j <= fim - 1; j++) {
			if(array[j] < pivo) {
				i++;
				int valorTemp = array[i];
				array[i] = array[j];
				array[j] = valorTemp;
			}
		}
		
		i++;
		int valorTemp = array[i];
		array[i] = array[fim];
		array[fim] = valorTemp;
		
		return i;
	}
}