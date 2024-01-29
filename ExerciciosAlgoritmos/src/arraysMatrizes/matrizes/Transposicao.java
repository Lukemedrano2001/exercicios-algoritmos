package arraysMatrizes.matrizes;

public class Transposicao {
	public static void main(String[] args) {
		// Transposição: Operação que troca as linhas por colunas e vice-versa em uma matriz.

		int[][] numeros = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }
		};
	
		// Antes da transposição
        System.out.println(imprimeMatriz(numeros));
        
        int[][] resultado = transposicaoMatriz(numeros);
        
        // Depois da transposição
        System.out.println(imprimeMatriz(resultado));	
	}
	
	public static String imprimeMatriz(int[][] numeros) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            resultado.append("[ ");
            for (int j = 0; j < numeros[i].length; j++) {
                resultado.append(numeros[i][j] + " ");
            }
            resultado.append("]\n");
        }
        return resultado.toString();
    }
	
	public static int[][] transposicaoMatriz(int[][] matriz){
		int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] resultado = new int[colunas][linhas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				resultado[j][i] = matriz[i][j];
			}
		}
		
		return resultado;
	}
}