package algoritmosSimples.fibonacci;

public class EnesimoNumeroFibonacci {
	public static void main(String[] args) {
		System.out.println("Iterativo: " + fibonacciIterativo(10));
		System.out.println("Recursivo: " + fibonacciRecursivo(9));
		System.out.println("Memoization: " + fibonacciMemoization(10));
		System.out.println("Binet: " + fibonacciFormulaBinet(10));
	}
	
	
	// O(n) de tempo 
	// O(1) de espaço
	public static int fibonacciIterativo(int numero) {
		int numero1 = 1;
		int numero2 = 0;
		int contador = 3;
		int fibonacciAtual = 0;
		
		while(contador <= numero) {
			fibonacciAtual = numero1 + numero2;
			numero2 = numero1;
			numero1 = fibonacciAtual;
			
			contador += 1;
		}
		
		return fibonacciAtual;
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
	
	
	// O(n) de tempo
	// O(n) de espaço
	private static int fibonacciMemoization(int numero) {
	    if (numero <= 0) {
	        return 0;
	    }

	    int[] memoization = new int[numero + 1];
	    memoization[0] = 0;
	    memoization[1] = 1;

	    for (int i = 2; i <= numero; i++) {
	        memoization[i] = memoization[i - 1] + memoization[i - 2];
	    }

	    return memoization[numero - 1];
	}
	
	
	// O(1) de tempo
	// O(1) de espaço
	public static int fibonacciFormulaBinet(int numero) {
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