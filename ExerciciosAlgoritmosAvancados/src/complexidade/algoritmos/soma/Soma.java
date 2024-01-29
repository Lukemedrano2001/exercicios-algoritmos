package complexidade.algoritmos.soma;

public class Soma {
	public static void main(String[] args) {
		System.out.println(soma1(20));
		System.out.println(soma2(20));
	}
	
	// O(n)
	// Se n = 1000, 
	// Cada iteração do algoritmo conta como um passo, ou seja, O(1000)
	public static int soma1(int numero) {
		int resultado = 0;
		for(int i = 0; i <= numero; i++) {
			resultado += i;
		}
		
		return resultado;
	}
	
	// O(1)
	// Se n = 1000, então o algoritmo so vai executar 3 vezes
	// Cada operação matemática conta como um passo, ou seja, O(3)
	public static int soma2(int numero) {
		int resultado = numero * (numero + 1) / 2;
		
		return resultado;
	}
}