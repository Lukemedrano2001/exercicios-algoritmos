package algoritmos.criptografia.cifras;

import java.util.Arrays;
import java.util.List;

public class CifraCesar {
	public static void main(String[] args) {
        String textoOriginal = "HELLO WORLD";
        String outroTexto = "Guilherme";
        String chave = "KEY";
        String textoCifrado1 = CifraCesar.cifraCesar(textoOriginal, chave);
        String textoCifrado2 = CifraCesar.cifraCesar(outroTexto, chave);
        System.out.println("Texto 1 Cifrado: " + textoCifrado1);
        System.out.println("Texto 2 Cifrado: " + textoCifrado2);
	}
	
	public static String cifraCesar(String texto, String chave) {
		StringBuilder resultado = new StringBuilder();
		
		for(char caractere: texto.toCharArray()) {
			if(isLetra(caractere)) {
				char novoCaractere = calcularNovoCaractere(caractere, chave);
				resultado.append(novoCaractere);
			} else {
				resultado.append(caractere);
			}
		}
		
		return resultado.toString();
	}

	public static boolean isLetra(char letra) {
        List<Character> letras = Arrays.asList(
        		'a', 'b', 'c', 'd', 'e', 'f', 
        		'g', 'h', 'i', 'j', 'k', 'l', 
        		'm', 'n', 'o', 'p', 'q', 'r', 
        		's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        );
        
        return letras.contains(Character.toLowerCase(letra));
    }
	
	public static char calcularNovoCaractere(char caractere, String chave) {
		char base = Character.toUpperCase(caractere);

		// Calcula o deslocamento em relação à chave
        int deslocamento = chave.charAt(0) - base;
        
        // Calcula o deslocamento do caractere original em relação à base.
        // Garante que o resultado esteja no intervalo de 0 a 25, pois % 26 faz com que o resultado seja o resto da divisão por 26.
        if (base == 'A') {
        	// Adiciona a base novamente ao resultado para obter o caractere cifrado.
            return (char) (((caractere - base + deslocamento) % 26) + base);
        } else {
			// Adiciona 26 antes de fazer o módulo para garantir que o resultado seja positivo.
			// Isso é feito para lidar com casos em que o deslocamento é negativo, pois % em Java pode resultar em um valor negativo quando aplicado a um número negativo.
			// Adiciona a base novamente ao resultado para obter o caractere cifrado.
            return (char) (((caractere - base + deslocamento) % 26 + 26) % 26 + base);
        }
	}
}