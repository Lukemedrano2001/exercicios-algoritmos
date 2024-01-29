package strings;

import java.util.Arrays;
import java.util.List;

public class ContaVogaisConsoantes {
    public static void main(String[] args) {
        String nome = "guilherme";

        System.out.println("Número de vogais: " + contaVogais(nome));
        System.out.println("Número de consoantes: " + contaConsoantes(nome));
    }

    public static int contaVogais(String string) {
        int numeroVogais = 0;

        for (char letra: string.toCharArray()) {
            if (isVogal(letra)) {
                numeroVogais++;
            }
        }

        return numeroVogais;
    }

    public static int contaConsoantes(String string) {
        int numeroConsoantes = 0;

        for (char letra: string.toCharArray()) {
            if (isConsoante(letra)) {
                numeroConsoantes++;
            }
        }

        return numeroConsoantes;
    }

    public static boolean isVogal(char letra) {
        List<Character> vogais = Arrays.asList('a', 'e', 'i', 'o', 'u');
        
        return vogais.contains(Character.toLowerCase(letra));
    }

    public static boolean isConsoante(char letra) {
        List<Character> consoantes = Arrays.asList(
        	'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
        );
        
        return consoantes.contains(Character.toLowerCase(letra));
    }
}