package complexidade.ordenacao.selectionSort;

import java.util.Arrays;

public class SelectionSortMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        selectionSortMatriz(numeros);

        for (int[] array : numeros) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void selectionSortMatriz(int[][] matriz) {
        // Complexidade de tempo: O(n^3)
    	
    	// Fórmula: For * selectionSortArray O(n^2) + For * For * For + For * For
    	// O(n) * O(n^2) + O(n^3) + O(n^2)
    	// O(n^3) + O(n^3) + O(n^2) -> O(n^3)
    	
        // Complexidade de espaço: O(1)

        // For -> O(n)
        for (int i = 0; i < matriz.length; i++) {
        	// selectionSortArray -> O(n^2)
            SelectionSortArray.selectionSortArray(matriz[i]);
        }

        // Organiza as colunas
        // For -> O(n)
        for (int j = 0; j < matriz[0].length; j++) {
        	// For -> O(n)
            for (int k = 0; k < matriz.length - 1; k++) {
            	// For -> O(n)
                for (int l = k + 1; l < matriz.length; l++) {
                    if (matriz[l][j] < matriz[k][j]) {
                        int temp = matriz[l][j];
                        matriz[l][j] = matriz[k][j];
                        matriz[k][j] = temp;
                    }
                }
            }
        }

        // Organiza as linhas
        // For -> O(n)
        for (int i = 0; i < matriz.length - 1; i++) {
            int indiceMinimo = i;
            // For -> O(n)
            for (int k = i + 1; k < matriz.length; k++) {
                if (matriz[k][0] < matriz[indiceMinimo][0]) {
                    indiceMinimo = k;
                }
            }

            // Troca as linhas
            int[] temp = matriz[i];
            matriz[i] = matriz[indiceMinimo];
            matriz[indiceMinimo] = temp;
        }
    }
}