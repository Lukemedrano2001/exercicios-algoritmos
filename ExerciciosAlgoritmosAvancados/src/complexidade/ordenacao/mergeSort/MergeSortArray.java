package complexidade.ordenacao.mergeSort;

import java.util.Arrays;

public class MergeSortArray {
	public static void main(String[] args) {
		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		mergeSortArray(numeros);
		
		System.out.println(Arrays.toString(numeros));
	}
	
	/* Merge Sort: É um algoritmo de ordenação "dividir para conquistar". 
		1. Divisão: Array dividido recursivamente até cada sub-array ter um elemento (caso base).
		2. Conquista: Cada sub-array é ordenado por chamadas recursivas.
		3. Combinação (Merge): Sub-arrays mesclados para criar um array ordenado.
	*/
	public static void mergeSortArray(int[] array) {
		// Complexidade de tempo -> O(n log n) em todos os casos
		// Complexidade de espaço -> O(n) devido à criação de sub-arrays durante as chamadas recursivas.
		
		// Fórmula: For * Recursão + While + (While + While +  While)
		// O(n) * O(log n) + O(n) + (O(n) + O(n) + O(n))
		// O(n log n) + O(4n) => O(n log n)
		
		int tamanho = array.length;
		if(tamanho <= 1) {
			return;	// Caso base
		}
		
		int meio = tamanho / 2;
		int[] arrayEsquerdo = new int[meio];
		int[] arrayDireito = new int[tamanho - meio];
		
		// For -> O(n)
		for(int i = 0; i < tamanho; i++) {
			if(i < meio) {
				arrayEsquerdo[i] = array[i];
			} else {
				arrayDireito[i - meio] = array[i];
			}
		}
		
		// Recursão -> O(log n), vai criando os sub-arrays a cada chamada chamada recursiva
		mergeSortArray(arrayEsquerdo);
		// Recursão -> O(n), vai criando os sub-arrays a cada chamada chamada recursiva
		mergeSortArray(arrayDireito);
		// For -> O(n)
		merge(arrayEsquerdo, arrayDireito, array);
 	}
	
	public static void merge(int[] arrayEsquerdo, int[] arrayDireito, int[] array) {
		int ladoEsquerdo = arrayEsquerdo.length;
		int ladoDireito = arrayDireito.length;
		int i = 0, l = 0, r = 0;	// Indices
		
		// Checando as condições para dar merge
		// While -> O(n)
		while(l < ladoEsquerdo && r < ladoDireito) {
			if(arrayEsquerdo[l] < arrayDireito[r]) {
				array[i] = arrayEsquerdo[l];
				l++;
			} else {
				array[i] = arrayDireito[r];
				r++;
			}
			
			i++;
		}
		
		// While -> O(n)
		while(l < ladoEsquerdo) {
			array[i] = arrayEsquerdo[l];
			i++;
			l++;
		}
		
		// While -> O(n)
		while(r < ladoDireito) {
			array[i] = arrayDireito[r];
			i++;
			r++;
		}
	}
}