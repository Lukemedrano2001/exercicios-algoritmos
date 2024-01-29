package complexidade.algoritmos.buscaPorElemento;

public class BuscaPorElementoMatriz {
	// Pode ser feita uma busca binária, linear ou usando o acesso direto ao elemento
	// Essa busca é melhor quando você sabe exatamente a posição do elemento desejado
	
	public static void main(String[] args) {
		int[][] numerosMatriz2D = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};
		
		System.out.println(getElemento(numerosMatriz2D, 1, 1));
	}
	
	// Complexidade de algoritmo -> O(1)
	public static int getElemento(int[][] numeros, int linha, int coluna) {
		return numeros[linha][coluna];
	}
}
