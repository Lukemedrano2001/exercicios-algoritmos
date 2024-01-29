package complexidade.busca.binaria;

public class BuscaBinariaMatriz {
	public static void main(String[] args) {
		int[][] numerosMatriz2D = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};

		System.out.println(buscaBinariaMatriz(numerosMatriz2D, 5)); 
	}

	public static String buscaBinariaMatriz(int[][] numeros, int elemento) {
		// Complexidade de tempo ->  O(log n)
		// Complexidade de espaço -> O(1)
		
		int linhas = numeros.length;
        int colunas = numeros[0].length;
        int inicio = 0;
        int fim = linhas * colunas - 1;
        
        // While -> O(log n)
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int linha = meio / colunas;
            int coluna = meio % colunas;
            
            if (numeros[linha][coluna] == elemento) {
                return String.format("Elemento: %d | Linha: %d | Coluna: %d", elemento, linha, coluna);
            } else if (numeros[linha][coluna] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
		
		return String.format("Elemento não encontrado");
	}
}