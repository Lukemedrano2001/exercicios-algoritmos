package complexidade.ordenacao.insertionSort;

import java.util.Arrays;

public class InsertionSortMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        insertionSortMatriz(numeros);

        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }
    }

    public static void insertionSortMatriz(int[][] matriz) {
        // Complexidade de tempo: O(n^3)
        
    	// Fórmula: For * insertionSortArray O(n^2) + For * For * For + For * For
        // O(n) * O(n^2) + O(n) * O(n) * O(n) + O(n) * O(n)
        // O(n^3) + O(n^3) + O(n^2) -> O(n^3)
    	
        // Complexidade de espaço: O(1)

        // For -> O(n)
        for (int i = 0; i < matriz.length; i++) {
        	// insertionSortArray -> O(n^2)
            InsertionSortArray.insertionSortArray(matriz[i]);
        }

        // Organiza as colunas da matriz
        // For -> O(n)
        for (int j = 0; j < matriz[0].length; j++) {
        	// For -> O(n)
            for (int k = 0; k < matriz.length - 1; k++) {
            	// For -> O(n)
                for (int l = k + 1; l > 0; l--) {
                    if (matriz[l][j] < matriz[l - 1][j]) {
                        int temp = matriz[l][j];
                        matriz[l][j] = matriz[l - 1][j];
                        matriz[l - 1][j] = temp;
                    } else {
                        break;
                    }
                }
            }
        }

        // Organiza as linhas da matriz
        // For -> O(n)
        for (int i = 1; i < matriz.length; i++) {
            int[] chave = matriz[i];
            int j = i - 1;

            // While -> O(n)
            while (j >= 0 && matriz[j][0] > chave[0]) {
                matriz[j + 1] = matriz[j];
                j--;
            }

            matriz[j + 1] = chave;
        }
    }
}