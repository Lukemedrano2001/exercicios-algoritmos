package complexidade.busca.binaria;

import java.util.ArrayList;
import java.util.List;

public class BuscaBinariaNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(11, 12, 22, 25, 34, 64, 90));
		
		System.out.println(BuscaBinariaGenerics.buscaBinariaArray(numeros, 12));
	}
}