package complexidade.ordenacao.bubbleSort;

import java.util.Arrays;

public class BubbleSortMatriz {

    public static void main(String[] args) {
        int[][] numeros = {
            { 9, 8, 7 },
            { 6, 5, 4 },
            { 3, 2, 1 }
        };

        bubbleSortMatriz(numeros);

        for (int[] array : numeros) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void bubbleSortMatriz(int[][] matriz) {
        // Complexidade de tempo -> O(n^2)
        
    	// Fórmula: For * bubbleSortArray + For * For * For
        // O(n) * O(n) + O(n) * O(n) * O(n)
    	// O(n^2) + O(n^3) -> O(n^3)

    	// Complexidade de espaço -> O(1)
    	
        // Ordena as linhas
        // For -> O(n)
        for (int i = 0; i < matriz.length; i++) {
        	// bubbleSortArray -> O(n^2)
            BubbleSortArray.bubbleSortArray(matriz[i]);
        }

        // Ordena as colunas
        // For -> O(n)
        for (int j = 0; j < matriz[0].length; j++) {
            // For -> O(n)
            for (int i = 0; i < matriz.length - 1; i++) {
                // For -> O(n)
                for (int k = 0; k < matriz.length - i - 1; k++) {
                    if (matriz[k][j] > matriz[k + 1][j]) {
                        int valorTemp = matriz[k][j];
                        matriz[k][j] = matriz[k + 1][j];
                        matriz[k + 1][j] = valorTemp;
                    }
                }
            }
        }
    }
}