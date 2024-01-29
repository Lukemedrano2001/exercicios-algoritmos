package algoritmos.caixeiroViajante;

public class GreedyTSP {
	
	// Complexidade de tempo: O(n^2)
	// Fórmula: For * For
	// O(n) * O(n) => O(n^2)
	// Complexidade de espaço: O(n)
	public static void greddyTSP(int[][] grafo) {
		int tamanho = grafo.length;
		boolean[] visitado = new boolean[tamanho];
		int atual = 0;
		visitado[atual] = true;
		int custoTotal = 0;
		
		// For -> O(n)
		for(int i = 0; i < tamanho - 1; i++) {
			int proximaCidade = encontraCidadeMaisProxima(grafo, atual, visitado);
			custoTotal += grafo[atual][proximaCidade];
			atual = proximaCidade;
			visitado[atual] = true;
		}
		
		// Retorna a cidade inicial
		custoTotal += grafo[atual][0];
		System.out.println("Greedy - Menor custo: " + custoTotal);
	}
	
	public static int encontraCidadeMaisProxima(int[][] grafo, int cidade, boolean[] visitado) {
		int tamanho = grafo.length;
		int menorCusto = Integer.MAX_VALUE;
		int cidadeMaisProxima = -1;
		
		// For -> O(n)
		for(int i = 0; i < tamanho; i++) {
			if(!visitado[i] && grafo[cidade][i] < menorCusto) {
				menorCusto = grafo[cidade][i];
				cidadeMaisProxima = i;
			}
		}
		
		return cidadeMaisProxima;
	}
}