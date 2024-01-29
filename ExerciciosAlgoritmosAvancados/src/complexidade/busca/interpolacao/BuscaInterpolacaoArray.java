package complexidade.busca.interpolacao;

public class BuscaInterpolacaoArray {
	public static void main(String[] args) {
		int[] numerosArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int[] numerosArray2 = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };

		
		System.out.println(buscaInterpolacaoArray(numerosArray1, 8));
		

		System.out.println(buscaInterpolacaoArray(numerosArray2, 256));
	}
	
	// Busca por Interpolação: Algoritmo que utiliza da interpolação para estimar a posição do elemento em um array ordenado
	public static String buscaInterpolacaoArray(int[] array, int elemento) {
		// Complexidade de tempo ->  O(log (log n)), se o array estiver ordenado
		// Complexidade de tempo ->  O(n), se o array estiver desordenado
		// Complexidade de espaço -> O(1)
		
		int inicio = 0;
		int fim = array.length - 1;
		
		// Elemento está dentro dos limites do array e inicio precisa ser menor ou igual ao fim para que continue ocorrendo a iteração
		// While -> O(n)
		while(elemento >= array[inicio] && elemento <= array[fim] && inicio <= fim) {
			// Cálculo da estimativa de posição do elemento no array usando a fórmula de interpolação
			int estimativa = inicio + (fim - inicio) * (elemento - array[inicio]) / (array[fim] - array[inicio]);
			
			if(array[estimativa] == elemento) {
				return String.format("Valor: %d | Índice: %d", array[estimativa], estimativa);
			} else if(array[estimativa] < elemento) {
				inicio = ++estimativa;
			} else {
				fim = --estimativa;
			}
		}
		
		return String.format("Elemento não encontrado");
	}
}