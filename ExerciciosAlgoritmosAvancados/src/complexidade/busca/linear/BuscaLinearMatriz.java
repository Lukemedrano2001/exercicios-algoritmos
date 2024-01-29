package complexidade.busca.linear;

public class BuscaLinearMatriz {
	public static void main(String[] args) {		
		int[][] numerosMatriz2D = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};

		
		System.out.println(buscaLinearMatriz(numerosMatriz2D, 5)); 
	}
	
	// Busca Linear: Busca elemento por elemento, até encontrar ou não o que se deseja
	public static String buscaLinearMatriz(int[][] matriz, int elemento) {
		// Complexidade de tempo -> O(n^2)
		// O(n) * O(n) => O(n^2)
		// Complexidade de espaço: O(1)
		
		// For -> O(n)
    	for (int i = 0; i < matriz.length; i++) {
    		// For -> O(n)
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elemento) {
                    return String.format("Elemento: %d | Linha: %d | Coluna: %d", elemento, i, j);
                }
            }
        }
        return String.format("Elemento não encontrado");
    }
}