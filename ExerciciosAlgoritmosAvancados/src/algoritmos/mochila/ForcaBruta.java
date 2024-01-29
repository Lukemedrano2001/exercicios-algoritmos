package algoritmos.mochila;

import java.util.ArrayList;
import java.util.List;

public class ForcaBruta {
	
	// Complexidade de tempo: O(n * 2^n) ou O(n!) para valores extremamente grandes
	// Fórmula: For(1 << tamanho) * For + For
	// O(2^n) * O(n) + O(n) -> O(n * 2^n)
	// Complexidade de espaço: O(n)
	public static void forcaBrutaMochila(int[][] itens, int capacidade) {
		int tamanho = itens.length;
		List<int[]> melhorCombinacao = new ArrayList<int[]>();
		int melhorValor = 0;
		
		// For -> O(2^n), por causa da expressão (1 << tamanho) que é uma operação de exponenciação com base 2
		for(int i = 0; i < (1 << tamanho); i++) {
			List<int[]> combinacaoAtual = new ArrayList<int[]>();
            int pesoAtual = 0;
            int valorAtual = 0;
            
            // For -> O(n)
            for(int j = 0; j < tamanho; j++) {
            	if((i & (1 << j)) != 0) {
            		combinacaoAtual.add(itens[j]);
                    pesoAtual += itens[j][1];
                    valorAtual += itens[j][0];
            	}
            }
            
            if (pesoAtual <= capacidade && valorAtual > melhorValor) {
                melhorValor = valorAtual;
                melhorCombinacao = new ArrayList<int[]>(combinacaoAtual);
            }
		}
		
		System.out.println("Força Bruta");
		// For -> O(n)
		for (int i = 0; i < tamanho; i++) {
			int[] item = itens[i];
			String indice = "Indice: " + i;
			String valor = "Valor: " + item[0];
			String peso = "Peso: " + item[1];
			String escolhido;
		    if (melhorCombinacao.contains(item)) {
		        escolhido = "Escolhido: 1";
		    } else {
		        escolhido = "Escolhido: 0";
		    }
				
			System.out.printf("%s | %s | %s | %s \n", indice, valor, peso, escolhido);
		}
		
		System.out.println("Valor Total: " + melhorValor);
	}
}