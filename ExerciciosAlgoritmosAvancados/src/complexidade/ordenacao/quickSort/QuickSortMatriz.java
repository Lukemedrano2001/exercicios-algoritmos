package complexidade.ordenacao.quickSort;

import java.util.Arrays;

public class QuickSortMatriz {
	public static void main(String[] args) {
		int[][] numeros = {
			{ 9, 8, 7 },
			{ 6, 5, 4 },
			{ 3, 2, 1 }
		};
		
		quickSortMatriz(numeros, 0, numeros.length - 1);
		
		for (int[] array: numeros) {
			System.out.println(Arrays.toString(array));
		}
	}

	public static void quickSortMatriz(int[][] matriz, int inicio, int fim) {
		// Complexidade de tempo no melhor e médio caso: O(n^2 log n)
		// Complexidade de tempo no pior caso: O(n^3) 
		
		// Fórmula no melhor e médio caso: Particao O(n^2 log n) + Recursão O(n) + Recursão O(log n)
		// O(n^2 log n) + O(n) + O(log n) -> O(n^2 log n)
		
		// Fórmula no pior caso: Particao O(n^3) + Recursão O(n) + Recursão O(n)
		// O(n^3) + O(n) + O(n)
		// O(n^3) + O(2n) -> O(n^3)
		
		// Complexidade de espaço: O(log n)
		
		if (inicio < fim) {
			// Complexidade: O(n^2 log n) no melhor e médio caso, O(n^3) no pior caso, O(log n) espaço
            int pivoIndice = particao(matriz, inicio, fim);
            // Recursão -> O(n)
            quickSortMatriz(matriz, inicio, pivoIndice - 1);	// Partição à esquerda
            // Recursão -> O(n) no pior caso
    		// Recursão -> O(log n) no melhor e médio caso
            quickSortMatriz(matriz, pivoIndice + 1, fim);	// Partição à direita
        }
	}

	public static int particao(int[][] matriz, int inicio, int fim) {
		// Complexidade de tempo -> O(n^2 log n) no melhor caso e médio caso
		// Complexidade de tempo -> O(n^3) no pior caso (array ordenado) e escolha do pivô for errada
		
		// Fórmula no melhor e médio caso: For * Compare (O(n)) + For * quickSortArray (O(n log n))
		// O(n) * O(n) + O(n) * O(n log n)
		// O(n^2) + O(n^2 log n) -> O(n^2 log n)
		
		// Fórmula no pior caso: For * Compare (O(n)) + For * quickSortArray (O(n^2))
		// O(n) * O(n) + O(n) * O(n^2)
		// O(n^2) + O(n^3) -> O(n^3)
		
		// Complexidade de espaço: O(log n), devido a pilha de chamadas recursivas
		
		int pivoIndice = inicio;
	    int[] pivo = matriz[fim];

	    // For -> O(n)
	    for (int i = inicio; i < fim; i++) {
	    	// Complexidade: O(n) de tempo, O(1) de espaço
	        if (compare(matriz[i], pivo) < 0) {
	        	trocar(matriz, i, pivoIndice);
	            pivoIndice++;
	        }
	    }

	    trocar(matriz, pivoIndice, fim);

	    // For -> O(n)
	    for (int linha = inicio; linha <= fim; linha++) {
	    	// Complexidade de tempo -> O(n log n) no melhor caso e médio caso
			// Complexidade de tempo -> O(n^2) no pior caso (array ordenado) e escolha do pivô for errada
			// Complexidade de espaço -> O(log n), devido a pilha de chamadas recursivas
	        QuickSortArray.quickSortArray(matriz[linha], 0, matriz[linha].length - 1);
	    }

	    return pivoIndice;
	}

	public static int compare(int[] array1, int[] array2) {
		// Complexidade de tempo: O(n), pois é um método da própria linguagem
		// Complexidade de espaço: O(1), pois é um método da própria linguagem		
		
        // Retorna negativo se array1 < array2, Retorna 0 se array1 == array2, Retorna positivo se array1 > array2
        return Arrays.compare(array1, array2);
	}
	
	public static void trocar(int[][] matriz, int i, int j) {
		// Complexidade de tempo: O(1)
		// Complexidade de espaço: O(1)
		
		int[] valorTemp = matriz[i];
		matriz[i] = matriz[j];
		matriz[j] = valorTemp;
	}
}