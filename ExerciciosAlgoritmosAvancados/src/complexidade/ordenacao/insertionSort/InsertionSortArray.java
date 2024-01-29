package complexidade.ordenacao.insertionSort;

import java.util.Arrays;

public class InsertionSortArray {
	public static void main(String[] args) {
		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		insertionSortArray(numeros);
		
		System.out.println(Arrays.toString(numeros));
	}
	
	/* Insertion Sort: É um algoritmo de ordenação que constrói uma sequência ordenada de elementos um por um, movendo elementos desordenados para a posição correta.
		1. Iteração Externa: Percorre o array da esquerda para a direita.
		2. Inserir Elemento: Para cada posição, insere o elemento na posição correta na parte ordenada do array.
		3. Deslocamento: Move os elementos maiores para abrir espaço para o novo elemento inserido.
	*/
	public static void insertionSortArray(int[] array) {
		// Complexidade de tempo -> O(n^2) em todos os casos
		// Complexidade de espaço -> O(1)
		// Fórmula: For * While 
		// O(n) * O(n) => O(n^2)
		
		// For -> O(n)
		for(int i = 1; i < array.length; i++) {
			int valorTemp = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > valorTemp) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = valorTemp;
		}
	}
}