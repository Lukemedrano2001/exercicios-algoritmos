package complexidade.busca.linear;

import java.util.List;

public class BuscaLinearGenerics {
	public static <TIPO> String buscaLinear(List<TIPO> lista, TIPO elemento) {
		// Complexidade de tempo -> O(n)
		// Complexidade de espaço -> O(1)
		
		// For -> O(n)
		for(int i = 0; i < lista.size(); i++) {
			if(elemento.equals(lista.get(i))) {
				String valor = "Valor: " + elemento;
				String indice = "Índice: " + i;
				return String.format("%s | %s", valor.toString(), indice);
			}
		}
		
		return String.format("Elemento não encontrado");
	}
}