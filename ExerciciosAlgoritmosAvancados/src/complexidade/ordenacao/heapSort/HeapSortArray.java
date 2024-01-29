package complexidade.ordenacao.heapSort;

import java.util.Arrays;



public class HeapSortArray {
	public static void main(String[] args) {
		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		heapSortArray(numeros);
		
		System.out.println(Arrays.toString(numeros));
	}
	
	/* Heap Sort: É um algoritmo de ordenação eficiente que utiliza a estrutura de dados chamada heap.
	 
		1-) O primeiro loop percorre o array da metade para o início, chamando a função heapify em cada iteração. A função heapify compara um nó com seus filhos e move o maior deles para a posição do nó, garantindo que a propriedade de heap seja mantida.
		
		2-) O segundo loop extrai os elementos do heap um por um. Ele inicia do final do array e vai até o início, trocando a raiz (maior elemento) com o último elemento. Após cada troca, a função heapify é chamada para ajustar a propriedade de heap no heap reduzido.
		
		3-) A função heapify é responsável por garantir que a propriedade de heap seja mantida em uma subárvore. Ela compara o nó atual com seus filhos e troca com o maior, se necessário. A função é chamada recursivamente em subárvores afetadas pela troca.
	*/
	public static void heapSortArray(int[] array) {
		// Complexidade de tempo -> O(n * log n)
		
		// Fórmula: For(n log n) + For(n log n) 
		// O(n * log n) + O(n log n) -> O(n log n)
		
		// Complexidade de espaço -> O(1), pois todas as operações ocorrem no próprio array de entrada.
		
		int tamanho = array.length;
		
		// Criando o heap para organizar o array
		// For -> O(n * log n), pois cada chamada do heapify tem complexidade O(log n)
		for(int i = tamanho / 2; i >= 0 ; i--) {
			heapify(array, tamanho, i);
		}
		
		// Extrair elementos um por um do heap
		// For -> O(n * log n), pois cada chamada do heapify tem complexidade O(log n)
		for(int i = tamanho - 1; i >= 0; i--) {
			// Mover a raiz atual para o final do array
			int valorTemp = array[0];
			array[0] = array[i];
			array[i] = valorTemp;
			
			// Chamar heapify no heap reduzido
			heapify(array, i, 0);
		}
	}

	public static void heapify(int[] array, int tamanho, int i) {
		// Complexidade de tempo: O(1), quando se tem um único nó na árvore
		// Complexidade de tempo: O(log n), quando se considera a árvore como um todo a altura é log n, logo O(log n)
		// Complexidade de espaço: O(1)
		
		int maior = i;
		int filhoEsquerda = 2 * i + 1;
		int filhoDireita = 2 * i + 2;
		
		// Se o filho da esquerda é maior que a raiz
		if(filhoEsquerda < tamanho && array[filhoEsquerda] > array[maior]) {
			maior = filhoEsquerda;
		}
		
		// Se o filho da direita é maior que a raiz
		if(filhoDireita < tamanho && array[filhoDireita] > array[maior]) {
			maior = filhoDireita;
		}
		
		// Se o maior não é a raiz
		if(maior != i) {
			// Trocar a raiz com o maior
			int valorTemp = array[i];
			array[i] = array[maior];
			array[maior] = valorTemp;
			
			// Recursão -> O(1), pois não existe While, For ou qualquer outra coisa que dependa do tamanho do array
			// Recursivamente heapify a subárvore afetada
			heapify(array, tamanho, maior);
		}
	}
}