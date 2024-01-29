package arraysMatrizes.arrays;

import java.util.Arrays;

public class InverterArray {
	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5 };
		
		inverterArray(numeros);
		System.out.println(Arrays.toString(numeros));
	}
	
	private static int[] inverterArray(int[] numeros) {
		int tamanhoArray = numeros.length;
		
		for(int i = 0; i < tamanhoArray / 2; i++) {
			int valorTemp = numeros[i];
			numeros[i] = numeros[tamanhoArray - i - 1];
			numeros[tamanhoArray - i - 1] = valorTemp;
		}
		
		return numeros;
	}
}