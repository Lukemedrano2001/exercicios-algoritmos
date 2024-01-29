package algoritmos.criptografia.cifras;

import java.util.Arrays;
import java.util.List;

public class CifraVigenere {
    public static void main(String[] args) {
        String textoOriginal = "HELLO WORLD";
        String outroTexto = "Guilherme";
        String chave = "KEY";
        String textoCifrado1 = cifraVigenere(textoOriginal, chave);
        String textoCifrado2 = cifraVigenere(outroTexto, chave);
        System.out.println("Texto 1 Cifrado: " + textoCifrado1);
        System.out.println("Texto 2 Cifrado: " + textoCifrado2);
    }

    public static String cifraVigenere(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (isLetra(caractere)) {
            	// Obtém o caractere atual da chave (O intervalo fica entre 0 e 25)
                char chaveAtual = chave.charAt(i % chave.length());
                char novoCaractere = calcularNovoCaractere(caractere, chaveAtual);
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

    public static char calcularNovoCaractere(char caractere, char chave) {
    	// Determina a base (letra maiúscula ou minúscula) para o cálculo do deslocamento
        char base;

        // Verifica se o caractere é uma letra maiúscula ou minúscula
        if (Character.isUpperCase(caractere)) {
            base = 'A';
        } else {
            base = 'a';
        }

        // Calcula o deslocamento com base na chave - base
        int deslocamento = chave - base;
        
        // Calcula o novo caractere cifrado usando a cifra de Vigenère
        int resultado = (caractere - base + deslocamento) % 26;

        if (resultado < 0) {
            resultado += 26;
        }

        return (char) (resultado + base);
    }
}
