package algoritmos.caixeiroViajante;

import java.util.Arrays;

public class DinamicaTSP {
	
	// Complexidade de tempo: O(n^2 * 2^n)
	// Fórmula: For + For(1 << tamanho) * For * For + For
	// O(n) + O(2^n) * O(n) * O(n) + O(n)
	// O(n^2 * 2^n) + O(2n) = O(n^2 * 2^n)
	// Complexidade de espaço: O(n * 2^n)
	public static void dinamicaTSP(int[][] grafo) {
		int tamanho = grafo.length;
		
		// Cria uma tabela de programação dinâmica para armazenar resultados intermediários
		int[][] tabelaDP = new int[tamanho][1 << tamanho];
		
		// Máscara para representar todos os bits ligados até o tamanho - 1
		int mascara = (1 << tamanho) - 1;
		
		// Valor representando infinito para inicializar a tabela
		int infinito = Integer.MAX_VALUE / 2;
		
		for(int[] linha: tabelaDP) {
			Arrays.fill(linha, infinito);
		}
		
		// O caixeiro inicia na cidade 0 (bit 1 representa a cidade 0)
		tabelaDP[0][1] = 0;	
		
		// Preencher a tabela DP
		// For -> O(2^n), por causa da expressão (1 << tamanho) que é uma operação de exponenciação com base 2
		for(int subconjunto = 1; subconjunto < (1 << tamanho); subconjunto += 2) {
			// For -> O(n)
			for(int cidadeOrigem = 1; cidadeOrigem < tamanho; cidadeOrigem++) {
				// Verifica se cidadeOrigem está presente no subconjunto
				if((subconjunto & (1 << cidadeOrigem)) != 0) {
					// For -> O(n)
					for(int cidadeDestino = 0; cidadeDestino < tamanho; cidadeDestino++) {
						// Verifica se cidadeDestino está presente no subconjunto
						if((subconjunto & (1 << cidadeDestino)) != 0) {
							// Calcula o custo atual (menor custo acumulado até a cidadeOrigem no subconjunto atual)
							int custoAtual = tabelaDP[cidadeOrigem][subconjunto];
							
							// Calcula o novo custo (custo total de ir de cidadeDestino para cidadeOrigem no subconjunto atual)
			                int novoCusto = tabelaDP[cidadeDestino][subconjunto ^ (1 << cidadeOrigem)] + grafo[cidadeDestino][cidadeOrigem];
			                
			                // Atualiza a tabela com o menor custo possível até a cidadeOrigem no subconjunto atual
			                tabelaDP[cidadeOrigem][subconjunto] = Math.min(custoAtual, novoCusto);
						}
					}
				}
			}
		}
		
		int custoMinimo = infinito;
		// For O(n)
		for(int cidadeDestino = 1; cidadeDestino < tamanho; cidadeDestino++) {
			 custoMinimo = Math.min(custoMinimo, tabelaDP[cidadeDestino][mascara] + grafo[cidadeDestino][0]);
		}
		
		System.out.println("Dinâmica - Menor custo: " + custoMinimo);
	}	
}