package complexidade.busca.binaria;

import java.util.List;

public class BuscaBinariaGenerics {
	public static <TIPO extends Comparable<TIPO>> String buscaBinariaArray(List<TIPO> lista, TIPO elemento) {
		// Complexidade de tempo ->  O(log n)
		// Complexidade de espaço -> O(1)
		
		int inicio = 0;
		int fim = lista.size() - 1;
		
		// While -> O(log n)
		while(inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if(elemento.equals(lista.get(meio))) {
				String valor = "Elemento: " + elemento;
				String indice = "Índice: " + meio;
				return String.format("%s | %s", valor, indice);
			} else if(lista.get(meio).compareTo(elemento) < 0) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		
		return String.format("Elemento não encontrado");
	}
}