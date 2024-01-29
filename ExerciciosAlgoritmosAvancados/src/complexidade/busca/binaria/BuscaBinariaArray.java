package complexidade.busca.binaria;

public class BuscaBinariaArray {
	public static void main(String[] args) {
		int[] numerosArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(buscaBinariaArray(numerosArray, 2));
	}
	
	// Busca Binária: É feita dividindo a estrutura pela metade a cada iteração, com isso torna ela O(log n) ao invés de O(n), a estrutura precisa estar ordenada
	public static String buscaBinariaArray(int[] numeros, int elemento) {
		// Complexidade de tempo ->  O(log n)
		// Complexidade de espaço -> O(1)
		
		int inicio = 0;
		int fim = numeros.length - 1;
		
		// While -> O(log n)
		while(inicio <= fim) {
			int meio = (inicio + fim) / 2;
			
			if(numeros[meio] == elemento) {
				return String.format("Elemento: %d | Índice: %d", elemento, meio);
			} else if(numeros[meio] < elemento) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		
		return String.format("Elemento não encontrado");
	}
}