package complexidade.ordenacao.heapSort;

import java.util.Arrays;

public class HeapSortMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        heapSortMatriz(numeros);

        for (int[] array: numeros) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void heapSortMatriz(int[][] matriz) {
    	// Complexidade de tempo: O(n^2)
    	
    	// Fórmula: For + For * For + heapSortArray O(n log n) + For * For
    	// O(n) + O(n) * O(n) + O(n log n) + O(n) * O(n)
    	// O(n) + O(n^2) + O(n log n) + O(n^2) -> O(n^2)
    	
    	// Complexidade de espaço: O(n),  tem tamanho proporcional ao número total de elementos na matriz (soma dos comprimentos de todas as linhas)
    	
        int totalElementos = 0;

        // For -> O(n)
        for (int i = 0; i < matriz.length; i++) {
            totalElementos += matriz[i].length;
        }

        int[] arrayUnidimensional = new int[totalElementos];
        int index = 0;

        // For -> O(n)
        for (int i = 0; i < matriz.length; i++) {
        	// For -> O(n)
        	for (int j = 0; j < matriz[i].length; j++) {
                arrayUnidimensional[index++] = matriz[i][j];
            }
        }

        // Complexidade: O(n * log n) de tempo, O(1) de espaço
        HeapSortArray.heapSortArray(arrayUnidimensional);

        index = 0;
        // For -> O(n)
        for (int i = 0; i < matriz.length; i++) {
        	// For -> O(n)
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = arrayUnidimensional[index++];
            }
        }
    }
}