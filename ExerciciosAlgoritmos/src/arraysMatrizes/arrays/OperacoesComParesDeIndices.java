package arraysMatrizes.arrays;

import java.util.ArrayList;
import java.util.List;

public class OperacoesComParesDeIndices {
	public static void main(String[] args) {
		int[] numeros1 = { 1, 2, 3, 4, 5 };
		int[] numeros2 = { 6, 7, 8, 9, 10 };
		
		System.out.println(somaParesDeIndice(numeros1, numeros2));
		System.out.println(subtracaoParesDeIndice(numeros1, numeros2));
		System.out.println(multiplicacaoParesDeIndice(numeros1, numeros2));
		System.out.println(divisaoParesDeIndice(numeros1, numeros2));
		System.out.println(mediaParesDeIndice(numeros1, numeros2));
	}
	
	public static List<Integer> somaParesDeIndice(int[] numeros1, int[] numeros2) {
		List<Integer> resultado = new ArrayList<Integer>();
		int resultadoTemp = 0;
		
		for(int i = 0; i < numeros1.length; i++) {
			resultadoTemp = numeros1[i] + numeros2[i];
			
			resultado.add(resultadoTemp);
		}
		
		return resultado;
	}
	
	public static List<Integer> subtracaoParesDeIndice(int[] numeros1, int[] numeros2) {
		List<Integer> resultado = new ArrayList<Integer>();
		int resultadoTemp = 0;
		
		for(int i = 0; i < numeros1.length; i++) {
			resultadoTemp = numeros1[i] - numeros2[i];
			
			resultado.add(resultadoTemp);
		}
		
		return resultado;
	}
	
	public static List<Integer> multiplicacaoParesDeIndice(int[] numeros1, int[] numeros2) {
		List<Integer> resultado = new ArrayList<Integer>();
		int resultadoTemp = 0;
		
		for(int i = 0; i < numeros1.length; i++) {
			resultadoTemp = numeros1[i] * numeros2[i];
			
			resultado.add(resultadoTemp);
		}
		
		return resultado;
	}
	
	public static List<Double> divisaoParesDeIndice(int[] numeros1, int[] numeros2) {
	    List<Double> resultado = new ArrayList<Double>();
	    
	    for(int i = 0; i < numeros1.length; i++) {
	        if (numeros2[i] != 0) {
	            resultado.add((double) numeros1[i] / numeros2[i]);
	        } else {
	            resultado.add(Double.NaN);
	        }
	    }
	    
	    return resultado;
	}

	public static List<Double> mediaParesDeIndice(int[] numeros1, int[] numeros2) {
	    List<Double> resultado = new ArrayList<Double>();
	    
	    for (int i = 0; i < numeros1.length; i++) {
            resultado.add((double) (numeros1[i] + numeros2[i]) / 2);
        }
	    
	    return resultado;
	}
}