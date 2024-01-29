package complexidade.busca.acessoDireto;

public class BuscaAcessoDiretoMatriz {
	public static void main(String[] args) {
		int[][] numerosMatriz2D = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};
		
		System.out.println(buscaAcessoDiretoMatriz(numerosMatriz2D, 1, 1));
	}
	
	// Busca por Acesso Direto: Essa busca é melhor quando você sabe exatamente a posição do elemento desejado
	public static String buscaAcessoDiretoMatriz(int[][] matriz, int linha, int coluna) {
		int valor = matriz[linha][coluna];
		return String.format("Linha: %d | Coluna: %d | Valor: %d", linha, coluna, valor);
	}
}