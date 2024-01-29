package algoritmos.mochila;

import java.util.ArrayList;
import java.util.List;

public class GreedyMochila {

	// Complexidade de tempo: O(n^2)
	// Fórmula: For + For * For + For + For
	// O(n) + O(n) * O(n) + O(n) + O(n)
	// O(n^2) + O(3n) => O(n^2)
	// Complexidade de espaço: O(n)
	public static void greedyMochila(int[] valores, int[] pesos, int capacidade) {
		int tamanho = valores.length;
		// Tamanho do array de valores * 2 => 
		// O(n * 2) => O(2n) -> O(n)
		double[][] razoes = new double[tamanho][2];
			
		// For -> O(n)
		for(int i = 0; i < tamanho; i++) {
			double razao = (double) valores[i] / pesos[i];
			razoes[i][0] = razao;
			razoes[i][1] = i;
		}
			
		// For -> O(n)
		for(int i = 0; i < tamanho - 1; i++) {
			// For -> O(n)
			for(int j = 0; j < tamanho - i - 1; j++) {
				if(razoes[j][0] < razoes[j + 1][0]) {
					double[] valorTemp = razoes[j];
					razoes[j] = razoes[j + 1];
					razoes[j + 1] = valorTemp;
				}
			}
		}
			
		int valorTotal = 0;
		List<int[]> itensSelecionados = new ArrayList<int[]>();
			
		// For -> O(n)
		for(double[] tupla: razoes) {
			int indice = (int) tupla[1];
			boolean escolhido = pesos[indice] <= capacidade;
			int[] item = {indice, valores[indice], pesos[indice], 0};

			itensSelecionados.add(item);

			if (escolhido) {
				item[3] = 1;
				valorTotal += valores[indice];
				capacidade -= pesos[indice];
			}
		}

		System.out.println("Greedy");
		// For -> O(n)
		for (int[] item: itensSelecionados) {
			String indice = "Indice: " + item[0];
			String valor = "Valor: " + item[1];
			String peso = "Peso: " + item[2];
			String escolhido = "Escolhido: " + item[3];
			String razaoValorPeso = "Razao: " +  razoes[item[0]][0];
				
			System.out.printf("%s | %s | %s | %s | %s \n", indice, valor, peso, escolhido, razaoValorPeso);
		}
		
		System.out.println("Valor Total: " + valorTotal);
	}
}