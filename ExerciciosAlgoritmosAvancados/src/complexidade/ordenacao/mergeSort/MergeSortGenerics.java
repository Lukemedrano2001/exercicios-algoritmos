package complexidade.ordenacao.mergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortGenerics {
	public static <TIPO extends Comparable<TIPO>> void mergeSortNumeros(List<TIPO> numeros) {
		int tamanho = numeros.size();
		if(tamanho <= 1) {
			return; // Caso base
		}
		
		int meio = tamanho / 2;
		List<TIPO> listaEsquerda = new ArrayList<TIPO>(numeros.subList(0, meio));
		List<TIPO> listaDireita = new ArrayList<TIPO>(numeros.subList(meio, tamanho));
		
		mergeSortNumeros(listaEsquerda);
		mergeSortNumeros(listaDireita);
		merge(listaEsquerda, listaDireita, numeros);
	}

	public static <TIPO extends Comparable<TIPO>> void merge(List<TIPO> listaEsquerda, List<TIPO> listaDireita, List<TIPO> numeros) {
		int tamanhoEsquerda = listaEsquerda.size();
		int tamanhoDireita = listaDireita.size();
		int i = 0, l = 0, r = 0;	// Indices
		
		// Checando as condições para dar merge
		while(l < tamanhoEsquerda && r < tamanhoDireita) {
			if(listaEsquerda.get(l).compareTo(listaDireita.get(r)) <= 0) {
				numeros.set(i, listaEsquerda.get(l));
				l++;
			} else {
				numeros.set(i, listaDireita.get(r));
				r++;
			}
			
			i++;
		}

		while(l < tamanhoEsquerda) {
			numeros.set(i, listaEsquerda.get(l));
			i++;
			l++;
		}
		
		while(r < tamanhoDireita) {
			numeros.set(i, listaDireita.get(r));
			i++;
			r++;
		}
	}
}