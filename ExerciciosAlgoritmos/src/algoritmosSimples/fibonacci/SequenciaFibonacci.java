package algoritmosSimples.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		System.out.println("Iterativo: " + geraSequenciaFibonacciIterativo(10));
		System.out.println("Recursivo: " + geraSequenciaFibonacciRecursivo(10));
		System.out.println("Memoization: " + geraSequenciaFibonacciMemoization(10));
		System.out.println("Fibonet: " + geraSequenciaFibonacciFibonet(10));
	}
	
	
	// Iterativo
	public static List<Integer> geraSequenciaFibonacciIterativo(int quantidade) {
		// Complexidade de tempo: O(n^2)
		// Complexidade de espaço: O(n)
	    // Complexidade de algoritmo -> For * While
	    // O(n) * O(n) => O(n^2)
	    
	    List<Integer> sequenciaFibonacci = new ArrayList<Integer>();

	    // For -> O(n)
	    for (int i = 0; i < quantidade; i++) {
	        sequenciaFibonacci.add(fibonacciIterativo(i));
	    }

	    return sequenciaFibonacci;
	}

	public static int fibonacciIterativo(int numero) {
		// O(n) de tempo 
		// O(1) de espaço
		if (numero <= 1) {
	        return numero;
	    }
		
		int numero1 = 0;
        int numero2 = 1;
        int fibonacciAtual = 0;
		
		// For -> O(n)
        for (int i = 2; i <= numero; i++) {
            fibonacciAtual = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacciAtual;
        }
		
		return fibonacciAtual;
	}
	
	
	// Recursivo
	public static List<Integer> geraSequenciaFibonacciRecursivo(int quantidade){
		// Complexidade de tempo: O(n*2^n)
		// Complexidade de espaço: O(n)
		// Complexidade de algoritmo -> For * Primeira recursão * Segunda recursão 
		// O(n) * O(2^n) => O(n*2^n)
		
		List<Integer> sequenciaFibonacci = new ArrayList<Integer>();
		
		// For -> O(n)
		for (int i = 0; i < quantidade; i++) {
			sequenciaFibonacci.add(fibonacciRecursivo(i));
	    }
		
		return sequenciaFibonacci;
	}
	
	public static int fibonacciRecursivo(int numero) {
		// O(2^n) de tempo 
		// O(n) de espaço
	    if(numero <= 0) {
	        return 0;
	    } else if(numero == 1 || numero == 2) {
	        return 1;
	    } else {
	    	// Primeira chamada recursiva: O(n)
	    	// Segunda chamada recursiva: O(n)	    
	    	// Complexidade total: O(n) * O(n) => O(2^n)
	        return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
	    }
	}
	
	
	// Memoization
	public static List<Integer> geraSequenciaFibonacciMemoization(int quantidade){
		// Complexidade de tempo: O(n^2)
		// Complexidade de espaço: O(n)
		// Complexidade de algoritmo -> For * For 
		// O(n) * O(n) => O(n^2)
		
		List<Integer> sequenciaFibonacci = new ArrayList<Integer>();

		// For -> O(n)
	    for (int i = 0; i < quantidade; i++) {
	    	sequenciaFibonacci.add(fibonacciMemoization(i));
	    }
		
		return sequenciaFibonacci;
	}
	
	public static int fibonacciMemoization(int numero) {		
		// O(n) de tempo
		// O(n) de espaço
	    if (numero <= 0) {
	        return 0;
	    }

	    int[] memoization = new int[numero + 1];
	    memoization[0] = 0;
	    memoization[1] = 1;

	    // For -> O(n)
	    for (int i = 2; i <= numero; i++) {
	        memoization[i] = memoization[i - 1] + memoization[i - 2];
	    }

	    return memoization[numero];
	}
	
	
	// Fibonet
	public static List<Integer> geraSequenciaFibonacciFibonet(int quantidade){
		// Complexidade de tempo: O(n)
		// Complexidade de espaço: O(n)
		// Complexidade de algoritmo -> For * Constante
		// O(n) * O(1) => O(n)
		
		List<Integer> sequenciaFibonacci = new ArrayList<Integer>();

		// For -> O(n)
	    for (int i = 0; i < quantidade; i++) {
	    	// O(1)
	    	sequenciaFibonacci.add(fibonacciFormulaBinet(i + 1));
	    }
		
		return sequenciaFibonacci;
	}
	
	public static int fibonacciFormulaBinet(int numero) {
		// O(1) de tempo
		// O(1) de espaço
		
		numero -= 1;
			
		// Definindo a proporção áurea
		double phi = (1 + Math.sqrt(5)) / 2;

		// Parte 1: phi^numero
		double parte1 = Math.pow(phi, numero);

		// Parte 2: (-phi)^(-numero)
		double parte2 = Math.pow(-phi, -numero);

		// Resultado: (phi^numero - (-phi)^(-numero)) / Math.sqrt(5)
		int fibonacci = (int) Math.floor((parte1 - parte2) / Math.sqrt(5));

		return fibonacci;
	}
}