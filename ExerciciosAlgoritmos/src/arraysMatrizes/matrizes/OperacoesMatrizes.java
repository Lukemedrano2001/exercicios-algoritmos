package arraysMatrizes.matrizes;

import java.util.Arrays;

public class OperacoesMatrizes {
	public static void main(String[] args) {
		int[][] numeros = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};
		
		System.out.println(somaMatriz(numeros));
		System.out.println(subtracaoMatriz(numeros));
		
		double[][] resultadoMultiplicacao = multiplicacaoMatriz(numeros, 2);
		imprimirMatriz(resultadoMultiplicacao);
		
		double[][] resultadoDivisao = divisaoMatriz(numeros, 2);
		imprimirMatriz(resultadoDivisao);
		
		System.out.println(mediaMatriz(numeros));
	}
	
	private static void imprimirMatriz(double[][] matriz) {
		System.out.println();
        for (double[] array: matriz) {
           System.out.print(Arrays.toString(array));
           System.out.println();
        }
        
        System.out.println();
    }
	
	private static int somaMatriz(int[][] numeros) {
		int soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				soma += numeros[i][j];
			}
		}
		
		return soma;
	}
	
	private static int subtracaoMatriz(int[][] numeros) {
		int subtracao = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				subtracao -= numeros[i][j];
			}
		}
		
		return subtracao;
	}
	
	private static double[][] multiplicacaoMatriz(int[][] numeros, int escalar) {
	    double[][] resultado = new double[numeros.length][numeros[0].length];

	    for (int i = 0; i < numeros.length; i++) {
	        for (int j = 0; j < numeros[i].length; j++) {
	            resultado[i][j] = numeros[i][j] * escalar;
	        }
	    }

	    return resultado;
	}

	private static double[][] divisaoMatriz(int[][] numeros, int escalar) {
	    double[][] resultado = new double[numeros.length][numeros[0].length];

	    for (int i = 0; i < numeros.length; i++) {
	        for (int j = 0; j < numeros[i].length; j++) {
	            resultado[i][j] = (double) numeros[i][j] / escalar;
	        }
	    }

	    return resultado;
	}
	
	private static double mediaMatriz(int[][] numeros) {
		int soma = somaMatriz(numeros);
		// numero.length * numeros[0].length é para garantir o tamanho certo da matriz
		double media = (double) soma / (numeros.length * numeros[0].length);
		
		return media;
	}
}