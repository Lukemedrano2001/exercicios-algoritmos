package complexidade.busca.linear;

public class BuscaLinearArray {
	public static void main(String[] args) {
		int[] numerosArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		
		System.out.println(buscaLinearArray(numerosArray, 2));
	}
	
	// Busca Linear: Busca elemento por elemento, até encontrar ou não o que se deseja
	public static String buscaLinearArray(int[] numeros, int elemento) {
		// Complexidade de tempo -> O(n)
		// Complexidade de espaço -> O(1)
		
		// For -> O(n)
		for(int i = 0; i < numeros.length; i++) {
			if(elemento == numeros[i]) {
				int valor = elemento;
				int indice = i;
				
				return String.format("Valor: %d | Índice: %d", valor, indice);
			}
		}
		
		return String.format("Elemento não encontrado");
	}
}