package arraysMatrizes.arrays;

public class ValorMaximoMinimo {
	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println(maiorValor(numeros));
		System.out.println(menorValor(numeros));
	}
	
	public static int maiorValor(int[] array) {
		int maior = array[0];
		
		for(Integer numero: array) {
			if(numero > maior) {
				maior = numero;
			}
		}
		
		return maior;
	}
	
	public static int menorValor(int[] array) {
		int menor = array[0];
		
		for(Integer numero: array) {
			if(numero < menor) {
				menor = numero;
			}
		}
		
		return menor;
	}
}