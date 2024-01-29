package arraysMatrizes.matrizes;

public class ValorMaximoMinimo {
	public static void main(String[] args) {
		int[][] numeros = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};
		
		System.out.println(maiorValor(numeros));
		System.out.println(menorValor(numeros));
	}
	
	public static int maiorValor(int[][] matriz) {
		int maior = matriz[0][0];
		
		for(int[] array: matriz) {
			for(Integer numero: array) {
				if(numero > maior) {
					maior = numero;
				}
			}
		}
		
		return maior;
	}
	
	public static int menorValor(int[][] matriz) {
		int menor = matriz[0][0];
		
		for(int[] array: matriz) {
			for(Integer numero: array) {
				if(numero < menor) {
					menor = numero;
				}
			}
		}
		
		return menor;
	}
}