package complexidade.ordenacao.mergeSort;

import java.util.Arrays;

public class MergeSortMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        mergeSortMatriz(numeros);

        for (int[] array: numeros) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void mergeSortMatriz(int[][] matriz) {
    	// Complexidade de tempo: O(n^2 log n)
    	// Complexidade de espaço: O(n)
    	
    	// Fórmula: For * mergeSortArray O(n log n) + mergeMatriz O(n^2)
    	// O(n) * O(n log n) + O(n^2)
    	// O(n^2 log n) + O(n^2) -> O(n^2 log n)    	
    	
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        // For -> O(n)
        for (int i = 0; i < linhas; i++) {
        	// Complexidade: O(n log n) de tempo, O(n) de espaço
        	MergeSortArray.mergeSortArray(matriz[i]);
        }

        int[][] matrizAuxiliar = new int[linhas][colunas];
        mergeSortMatrizRecursivo(matriz, matrizAuxiliar, 0, linhas - 1);
    }

    public static void mergeSortMatrizRecursivo(int[][] matriz, int[][] matrizAuxiliar, int inicio, int fim) {
    	// Complexidade de tempo: O(n^2)
    	// Fórmula: Recursão + For + mergeMatriz O(n^2)
    	// O(log n) + O(n) + O(n^2) -> O(n^2)
    	// Complexidade de espaço: O(n)
    	
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Recursão -> O(log n), vai criando as sub-matrizes a cada chamada chamada recursiva
            mergeSortMatrizRecursivo(matriz, matrizAuxiliar, inicio, meio);
            // Recursão -> O(n), vai criando as sub-matrizes a cada chamada chamada recursiva
            mergeSortMatrizRecursivo(matriz, matrizAuxiliar, meio + 1, fim);

            // Complexidade: O(n^2) de tempo, O(n) de espaço
            mergeMatriz(matriz, matrizAuxiliar, inicio, meio, fim);
        }
    }

    public static void mergeMatriz(int[][] matriz, int[][] matrizAuxiliar, int inicio, int meio, int fim) {
    	// Complexidade de tempo: O(n^2)
    	// Fórmula: While * (For + For) + While * For + While * For + For * For
    	// O(n) * (O(n) + O(n)) + O(n) * O(n) + O(n) * O(n) + O(n) * O(n)
    	// O(n) * O(2n) + O(n^2) + O(n^2) + O(n^2)
    	// O(n^2) + O(n^2) + O(n^2) + O(n^2) -> O(n^2)
    	
    	// Complexidade de espaço: O(n)
    	
        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        // While -> O(n)
        while (i <= meio && j <= fim) {
            if (matriz[i][0] <= matriz[j][0]) {
            	// For -> O(n)
                for (int coluna = 0; coluna < matriz[i].length; coluna++) {
                    matrizAuxiliar[k][coluna] = matriz[i][coluna];
                }
                i++;
            } else {
            	// For -> O(n)
                for (int coluna = 0; coluna < matriz[j].length; coluna++) {
                    matrizAuxiliar[k][coluna] = matriz[j][coluna];
                }
                j++;
            }
            k++;
        }

        // While -> O(n)
        while (i <= meio) {
        	// For -> O(n)
            for (int coluna = 0; coluna < matriz[i].length; coluna++) {
                matrizAuxiliar[k][coluna] = matriz[i][coluna];
            }
            i++;
            k++;
        }

        // While -> O(n)
        while (j <= fim) {
        	// For -> O(n)
            for (int coluna = 0; coluna < matriz[j].length; coluna++) {
                matrizAuxiliar[k][coluna] = matriz[j][coluna];
            }
            j++;
            k++;
        }

        // For -> O(n)
        for (k = inicio; k <= fim; k++) {
        	// For -> O(n)
            for (int coluna = 0; coluna < matriz[k].length; coluna++) {
                matriz[k][coluna] = matrizAuxiliar[k][coluna];
            }
        }
    }
}