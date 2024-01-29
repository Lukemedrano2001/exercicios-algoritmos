package complexidade.busca.linear;

import java.util.ArrayList;
import java.util.List;

public class BuscaLinearNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(11, 12, 22, 25, 34, 64, 90));
		
		System.out.println(BuscaLinearGenerics.buscaLinear(numeros, 12));
	}
}