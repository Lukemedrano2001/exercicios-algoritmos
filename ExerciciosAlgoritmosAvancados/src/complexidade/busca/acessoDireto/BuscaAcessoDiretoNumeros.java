package complexidade.busca.acessoDireto;

import java.util.ArrayList;
import java.util.List;

public class BuscaAcessoDiretoNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(11, 12, 22, 25, 34, 64, 90));
		
		System.out.println(BuscaAcessoDiretoGenerics.buscaAcessoDireto(numeros, 2));
	}
}