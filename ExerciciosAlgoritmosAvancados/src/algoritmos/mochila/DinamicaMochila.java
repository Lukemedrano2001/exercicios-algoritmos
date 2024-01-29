package algoritmos.mochila;

import java.util.ArrayList;
import java.util.List;

public class DinamicaMochila {
	
	// Complexidade de tempo: O(n^2)
	// Fórmula: For * For + While + For
	// O(n) * O(n) + O(n) + O(n)
	// O(n^2) + O(2n) => O(n^2)
	// Complexidade de espaço: O(n * capacidade)
	public static void dinamicaMochila(int[] valores, int[] pesos, int capacidade) {
        int tamanho = valores.length;
        // Tamanho do array de valores * Capacidade
        // O(n) * capacidade -> O(n * capacidade)
        int[][] tabelaDP = new int[tamanho + 1][capacidade + 1];

        // For -> O(n)
        for (int i = 1; i <= tamanho; i++) {
        	// For -> O(n)
            for (int peso = 1; peso <= capacidade; peso++) {
                int pesoAtual = pesos[i - 1];

                if (pesoAtual > peso) {
                    tabelaDP[i][peso] = tabelaDP[i - 1][peso];
                } else {
                    int semIncluirItemAtual = tabelaDP[i - 1][peso];
                    int incluirItemAtual = valores[i - 1] + tabelaDP[i - 1][peso - pesoAtual];
                    tabelaDP[i][peso] = Math.max(semIncluirItemAtual, incluirItemAtual);
                }
            }
        }

        List<Integer> itensSelecionados = new ArrayList<Integer>();
        int i = tamanho;
        int peso = capacidade;
        
        // While -> O(n)
        while (i > 0 && peso > 0) {
            if (tabelaDP[i][peso] != tabelaDP[i - 1][peso]) {
                itensSelecionados.add(i - 1);
                peso -= pesos[i - 1];
            }

            i--;
        }

        System.out.println("Prog Dinamica");
        // For -> O(n)
        for (int indice: itensSelecionados) {
            String valor = "Valor: " + valores[indice];
            String pesoItem = "Peso: " + pesos[indice];
            String escolhido = "Escolhido: " + 1;

            System.out.printf("Indice: %d | %s | %s | %s\n", indice, valor, pesoItem, escolhido);
        }
        System.out.println("Valor total: " + tabelaDP[tamanho][capacidade]);
    }
}