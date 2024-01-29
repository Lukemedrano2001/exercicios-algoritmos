package algoritmosSimples.elementosUnicos.strings;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatas {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Ana", "Ana", "Maria", "Maria", "Carlos", "João", "Pedro");
		
		Filtragem filtragem = new Filtragem(nomes);
		
		filtragem.filtraElementos(nomes);
		
		System.out.println(filtragem);
	}
}