package strings;

import java.util.ArrayList;
import java.util.List;

public class GeraAnagrama {
	public static void main(String[] args) {
		String palavra = "abc";
		System.out.println(gerarAnagramas(palavra.toCharArray(), 0, palavra.length() - 1));
	}
	
	public static List<String> gerarAnagramas(char[] palavra, int inicio, int fim) {
        List<String> anagramas = new ArrayList<String>();

        if (inicio == fim) {
            anagramas.add(new String(palavra));
        } else {
            for (int i = inicio; i <= fim; i++) {
                trocar(palavra, inicio, i);
                anagramas.addAll(gerarAnagramas(palavra, inicio + 1, fim));
                trocar(palavra, inicio, i); // Desfaz a troca para voltar ao estado original
            }
        }

        return anagramas;
    }
	
	public static void trocar(char[] palavra, int i, int j) {
        char temp = palavra[i];
        palavra[i] = palavra[j];
        palavra[j] = temp;
    }
}