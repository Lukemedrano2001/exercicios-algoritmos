package complexidade.algoritmos.buscaPorElemento;

public class BuscaPorElementoArray {
	// Pode ser feita uma busca binária, linear ou usando o acesso direto ao elemento
	// Essa busca é melhor quando você sabe exatamente a posição do elemento desejado
	
	public static void main(String[] args) {
		int[] numerosArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println(getElemento(numerosArray, 4));
	}
	
	// Complexidade de algoritmo -> O(1)
	public static int getElemento(int[] numeros, int indice) {
		return numeros[indice];
	}
}