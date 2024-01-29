package arraysMatrizes.matrizes;

import java.util.ArrayList;
import java.util.List;

public class OperacoesComParesDeIndices {
	public static void main(String[] args) {
		int[][] numeros1 = {
			{ 9, 8, 7 },
			{ 6, 5, 4 }, 
			{ 3, 2, 1 }
		};
		
		int[][] numeros2 = {
			{ 15, 15, 15 },
			{ 20, 20, 20 }, 
			{ 25, 25, 25 }
		};
		
		System.out.println(somaParesDeIndice(numeros1, numeros2));
		System.out.println(subtracaoParesDeIndice(numeros1, numeros2));
		System.out.println(multiplicacaoParesDeIndice(numeros1, numeros2));
		System.out.println(divisaoParesDeIndice(numeros1, numeros2));
		System.out.println(mediaParesDeIndice(numeros1, numeros2));
	}
	
	public static List<Integer> somaParesDeIndice(int[][] numeros1, int[][] numeros2) {
		int resultadoTemp = 0;
		List<Integer> resultado = new ArrayList<Integer>();
		
		for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
            	resultadoTemp = numeros1[i][j] + numeros2[i][j];
            	
            	resultado.add(resultadoTemp);
            }
        }
		
		return resultado;
	}
	
	public static List<Integer> subtracaoParesDeIndice(int[][] numeros1, int[][] numeros2) {
		int resultadoTemp = 0;
		List<Integer> resultado = new ArrayList<Integer>();
		
		for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
            	resultadoTemp = numeros1[i][j] - numeros2[i][j];
            	
            	resultado.add(resultadoTemp);
            }
        }
		
		return resultado;
	}
	
	public static List<Integer> multiplicacaoParesDeIndice(int[][] numeros1, int[][] numeros2) {
		int resultadoTemp = 0;
		List<Integer> resultado = new ArrayList<Integer>();
		
		for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
            	resultadoTemp = numeros1[i][j] * numeros2[i][j];
            	
            	resultado.add(resultadoTemp);
            }
        }
		
		return resultado;
	}
	
	public static List<Double> divisaoParesDeIndice(int[][] numeros1, int[][] numeros2) {
		List<Double> resultado = new ArrayList<Double>();

		for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
            	if(numeros2[i][j] != 0) {
            		resultado.add((double) numeros1[i][j] / numeros2[i][j]);
            	} else {
            		resultado.add(Double.NaN);
            	}
            	
            }
        }
		
		return resultado;
	}
	
	public static List<Double> mediaParesDeIndice(int[][] numeros1, int[][] numeros2) {
		List<Double> resultado = new ArrayList<Double>();

		for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
            	resultado.add((double) (numeros1[i][j] + numeros2[i][j]) / 2);
            }
        }
		
		return resultado;
	}
}