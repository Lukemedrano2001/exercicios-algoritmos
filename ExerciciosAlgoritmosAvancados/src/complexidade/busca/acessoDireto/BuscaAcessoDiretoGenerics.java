package complexidade.busca.acessoDireto;

import java.util.List;

public class BuscaAcessoDiretoGenerics {
	public static <TIPO> String buscaAcessoDireto(List<TIPO> lista, int indice) {
		String valor = "Valor: " + lista.get(indice);
		String indiceValor = "Índice: " + indice;
		
		return String.format("%s | %s", valor.toString(), indiceValor);
	}
}