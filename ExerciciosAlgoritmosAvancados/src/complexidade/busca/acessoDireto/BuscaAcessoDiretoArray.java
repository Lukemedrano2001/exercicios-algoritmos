package complexidade.busca.acessoDireto;

public class BuscaAcessoDiretoArray {
	public static void main(String[] args) {
		int[] numerosArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(buscaAcessoDiretoArray(numerosArray, 4));
	}
	
	// Busca por Acesso Direto: Essa busca é melhor quando você sabe exatamente a posição do elemento desejado
	public static String buscaAcessoDiretoArray(int[] array, int indice) {
		String valor = "Valor: " + array[indice];
		String indiceValor = "Índice: " + indice;
		return String.format("%s | %s", valor, indiceValor);
	}
}