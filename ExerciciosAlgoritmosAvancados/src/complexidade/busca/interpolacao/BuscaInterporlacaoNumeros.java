package complexidade.busca.interpolacao;

import java.util.ArrayList;
import java.util.List;

public class BuscaInterporlacaoNumeros {
	// Busca por Interpolação para Strings não é o melhor, use Busca Binária ou Linear
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of(11, 12, 22, 25, 34, 64, 90));
		
		System.out.println(buscaInterpolacao(numeros, 12));
	}
	
	 public static String buscaInterpolacao(List<Integer> numeros, int chave) {
		 int esquerda = 0;
		 int direita = numeros.size() - 1;
		 
		 // While -> O(n)
		 while (esquerda <= direita && chave >= numeros.get(esquerda) && chave <= numeros.get(direita)) {
			 int estimativa = esquerda + ((chave - numeros.get(esquerda)) * (direita - esquerda)) / (numeros.get(direita) - numeros.get(esquerda));
			 
			 if (numeros.get(estimativa) == chave) {
				 String indice = "Indice: " + estimativa;
				 String valor = "Valor: " + numeros.get(estimativa);
				 return String.format("%s | %s", valor, indice);
			 }
			 
			 if (numeros.get(estimativa) < chave) {
				 esquerda = estimativa + 1;
			 } else {
				 direita = estimativa - 1;
			 }
		 }
		 
		 return String.format("Elemento não encontrado");
	}
}