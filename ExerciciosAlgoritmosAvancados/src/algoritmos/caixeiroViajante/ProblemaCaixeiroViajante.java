package algoritmos.caixeiroViajante;

public class ProblemaCaixeiroViajante {
	public static void main(String[] args) {
		int[][] grafo1 = {
			{ 0, 10, 15, 20 },
			{ 10, 0, 35, 25 },
			{ 15, 35, 0, 30 },
			{ 20, 25, 30, 0 }
		};
		
		int[][] grafo2 = {
			{ 0, 8, 11, 10, 15 },
	        { 8, 0, 6, 7, 9 },
	        { 11, 6, 0, 9, 12 },
	        { 10, 7, 9, 0, 13 },
	        { 15, 9, 12, 13, 0 }
		};
		
		int[][] grafo3 = {
			{ 10, 15, 5 },
			{ 90, 30, 50 }
		};
		
		// Programação Dinâmica
		DinamicaTSP.dinamicaTSP(grafo1);
		DinamicaTSP.dinamicaTSP(grafo2);
		
		System.out.println();
		
		// Greedy
		GreedyTSP.greddyTSP(grafo1);
		GreedyTSP.greddyTSP(grafo2);
	
		System.out.println();
		
		// Força Bruta
		ForcaBruta.forcaBrutaTSP(grafo3);
	}
}