package algoritmos.mochila;

public class ProblemaMochila {
	public static void main(String[] args) {
		int[] valores = { 60, 100, 120 };
		int[] pesos = { 10, 20, 30 };
		int capacidade = 50;
		
		int[][] itens = {
			{ 60, 10 },
	        { 100, 20 },
	        { 120, 30 }	
		};
		
		// Programação Dinâmica
		DinamicaMochila.dinamicaMochila(valores, pesos, capacidade);
		
		System.out.println();
		
		// Greedy
		GreedyMochila.greedyMochila(valores, pesos, capacidade);
		
		System.out.println();
		
		// Força Bruta
		ForcaBruta.forcaBrutaMochila(itens, capacidade);
	}
}