package operacoesMatematicas.exponencial;

public class Exponenciacao {
	public static void main(String[] args) {
		// Exponencia��o = Potencia��o
		
		System.out.println(exponenciacaoMathPow(2, 3));
		System.out.println(exponenciacaoIterativa(2, 3));
		System.out.println(exponenciacaoRecursiva(2, 3));
		System.out.println(exponenciacaoRapida(2, 3));
	}
	
	// O(1) de tempo
	// O(1) de espaço
	public static double exponenciacaoMathPow(double base, double expoente) {
		double resultado = Math.pow(base, expoente);
		return resultado;
	}
	
	// O(n) de tempo
	// O(1) de espaço
	public static double exponenciacaoIterativa(double base, double expoente) {
		if(expoente == 0) {
			return 1;
		}
		
		double resultado = 1;
		for(int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}
	
	// O(n) de tempo
	// O(n) de espaço
	public static double exponenciacaoRecursiva(double base, double expoente) {
		if(expoente == 0) {
			return 1;
		}
		
		double resultado = base * exponenciacaoRecursiva(base, expoente - 1);
		
		return resultado;
	}
	
	// O(log n) de tempo
	// O(log n) de espaço
	public static double exponenciacaoRapida(double base, double expoente) {
		if(expoente == 0) {
			return 1;
		}
		
		double metade = exponenciacaoRapida(base, Math.floor(expoente / 2));
		
		if(expoente % 2 == 0) {
			return metade * metade;
		} else {
			return base * metade * metade;
		}
	}
}