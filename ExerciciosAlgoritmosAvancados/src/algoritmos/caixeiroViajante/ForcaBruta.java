package algoritmos.caixeiroViajante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForcaBruta {
	
	// Complexidade de tempo: O(n * 2^n) ou O(n!) para valores extremamente grandes
	// Fórmula: For + Função (O(n^2) + For * Função (O(n)
	// O(n) + O(n^2) + O(n) * O(n)
	// O(n * 2^n) + O(2n) -> O(n * 2^n)
	
	// Complexidade de espaço: Array melhor caminho * Permutações
	// O(n) * O(n!) -> O(n!)
	public static void forcaBrutaTSP(int[][] grafo) {
		int numeroVertices = grafo.length;
        int[] melhorCaminho = new int[numeroVertices];
        int melhorCusto = Integer.MAX_VALUE;

        // Inicializa o array de melhor caminho com a ordem inicial dos vértices
        // For -> O(n)
        for (int i = 0; i < numeroVertices; i++) {
            melhorCaminho[i] = i;
        }

        // Gera todas as permutações dos vértices e calcula o custo de cada ciclo
        // Chamando método permutações -> O(n^2) de tempo e de espaço O(n!)
        List<List<Integer>> permutacoes = permutacoes(melhorCaminho);
        // For -> O(n)
        for (List<Integer> caminho: permutacoes) {
        	// Chamando método calcularCustoCiclo -> O(n)
            int custoCiclo = calcularCustoCiclo(grafo, caminho);
            
            if (custoCiclo < melhorCusto) {
                melhorCusto = custoCiclo;
                melhorCaminho = caminho.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        System.out.println("Melhor Caminho: " + Arrays.toString(melhorCaminho));
        System.out.println("Melhor Custo: " + melhorCusto);
	}
	
	// Complexidade de tempo: O(n^2)
	// Complexidade de espaço: O(n!), pois está gerando as permutações
	public static List<List<Integer>> permutacoes(int[] array) {
        List<List<Integer>> resultado = new ArrayList<List<Integer>>();
        permutacoesAuxiliar(array, 0, resultado);
        return resultado;
    }

	// Complexidade de tempo: O(n^2)
	// Fórmula: For + For * For(Recursão)
	// O(n) + O(n) * O(n) -> O(n^2)
	// Complexidade de espaço: O(n)
	public static void permutacoesAuxiliar(int[] array, int inicio, List<List<Integer>> resultado) {
	    if (inicio == array.length - 1) {
	        List<Integer> permutacao = new ArrayList<Integer>();
	        // For -> O(n)
	        for (int valor: array) {
	            permutacao.add(valor);
	        }
	        
	        resultado.add(permutacao);
	        return;
	    }

	    // For -> O(n)
	    for (int i = inicio; i < array.length; i++) {
	        trocar(array, inicio, i);
	        // For (Recursão) -> O(n)
	        permutacoesAuxiliar(array, inicio + 1, resultado);
	        trocar(array, inicio, i);
	    }
	}

	// Complexidade de tempo: O(1)
	// Complexidade de espaço: O(1)
	public static void trocar(int[] array, int i, int j) {
        int valorTemp = array[i];
        array[i] = array[j];
        array[j] = valorTemp;
    }

	// Complexidade de tempo: O(n)
	// Fórmula: For -> O(n)
	// Complexidade de espaço: O(1)
    public static int calcularCustoCiclo(int[][] grafo, List<Integer> caminho) {
        int custo = 0;
        // For -> O(n)
        for (int i = 0; i < caminho.size() - 1; i++) {
            custo += grafo[caminho.get(i)][caminho.get(i + 1)];
        }
        
        // Volta para o início
        custo += grafo[caminho.get(caminho.size() - 1)][caminho.get(0)]; 
        return custo;
    }
}