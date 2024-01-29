package complexidade.busca.interpolacao;

public class BuscaInterpolacaoMatriz {
	public static void main(String[] args) {
		int[][] numerosMatriz2D = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }
		};

		
		System.out.println(buscaInterpolacaoMatriz(numerosMatriz2D, 5));
	}
	
	public static String buscaInterpolacaoMatriz(int[][] matriz, int elemento) {
		// Busca por Interpolação: Algoritmo que utiliza da interpolação para estimar a posição do elemento em um array ordenado
		// Complexidade de tempo ->  O(n), se a matriz estiver desordenada
		// Complexidade de espaço -> O(1)
		
	    int linhas = matriz.length;
	    int colunas = matriz[0].length;
	    int linhasColunas = linhas * colunas;
	    	    
	    int inicio = 0;
	    int fim = linhas * colunas - 1;
	    
	    int elementoInicial = matriz[inicio / colunas][inicio % colunas];
	    int elementoFinal = matriz[fim / colunas][fim % colunas];

	    // Elemento está dentro dos limites da matriz e inicio precisa ser menor ou igual ao fim para que continue ocorrendo a iteração
	    // While -> O(n)
	    while (elemento >= elementoInicial && elemento <= elementoFinal && inicio <= fim) {
	        int numerador1 = elemento - elementoInicial;
	        int denominador1 = elementoFinal - elementoInicial;

	        int numerador2 = elemento - elementoInicial;
	        int denominador2 = elementoFinal - elementoInicial;
	        
	        // Cálculo da estimativa de posição do elemento no array usando a fórmula de interpolação, uma para cada dimensão da matriz
	        int estimativa1 = inicio + (fim - inicio) * numerador1 / denominador1;
	        // Cálculo da estimativa de posição do elemento no array usando a fórmula de interpolação, uma para cada dimensão da matriz
	        int estimativa2 = inicio + (fim - inicio) * numerador2 / denominador2;
	        
	        if (estimativa1 >= 0 && estimativa1 < linhasColunas && estimativa2 >= 0 && estimativa2 < linhasColunas) {
	            int valor = matriz[estimativa1 / colunas][estimativa2 % colunas];

	            if (valor == elemento) {
	            	int linha = estimativa1 / colunas;
	            	int coluna = estimativa2 % colunas;
	            	
	                return String.format("Valor: %d | Linha: %d | Coluna: %d", valor, linha, coluna);
	            } else if (valor < elemento) {
	                inicio = ++estimativa1;
	            } else {
	                fim = --estimativa2;
	            }
	        } else {
	            break;
	        }
	    }

	    return String.format("Elemento não encontrado");
	}
}