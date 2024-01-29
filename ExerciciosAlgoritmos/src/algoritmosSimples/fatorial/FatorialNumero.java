package algoritmosSimples.fatorial;

public class FatorialNumero {
	public static void main(String[] args) {
		System.out.println(fatorialIterativo(5));
		System.out.println(fatorialRecursivo(5));
	}
	
	public static double fatorialIterativo(int numero) {
		// Complexidade de algoritmo -> O(n)
		if(numero < 0) {
			return Double.NaN;
		}
		
		double resultado = 1;
		// For -> O(n)
		for(int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		
		return resultado;
	}
	
	public static double fatorialRecursivo(int numero) {
		// Complexidade de algoritmo -> O(n)
		if(numero < 0) {
			return Double.NaN;
		}
		
		if (numero == 0 || numero == 1) {
            return 1;
        } else {
        	// O(n), pois a complexidade cresce de acordo com o input
            double resultado = numero * fatorialRecursivo(numero - 1);
            return resultado;
        }
	}
}