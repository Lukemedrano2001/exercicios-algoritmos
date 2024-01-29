package strings;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<List<String>> categorias = Arrays.asList(
        		Arrays.asList("Uva", "Girafa", "Carne", "Pao", "Mamao", "Java", "Melancia", "Estudo", "Abacaxi", "Codigo"),
                Arrays.asList("JavaScript", "Laranja", "Leao", "Banana", "Gato", "Livro", "Cenoura", "Alface", "Tomate", "Aprendizado"),
                Arrays.asList("Elefante", "Feijao", "Maca", "Tigre", "Frango", "Biblioteca", "Batata", "Morango", "Brocolis", "Conhecimento"),
                Arrays.asList("Arroz", "Cachorro", "Python", "Lima", "Framework", "Laranja", "Geladeira", "Cereja", "Roteador", "Lentilha")
        );

        String palavraEscolhida = escolherStringAleatoriamente(categorias);
        char[] palavraOculta = new char[palavraEscolhida.length()];
        Arrays.fill(palavraOculta, '_');

        int tentativas = 5;
        char[] letrasCorretas = new char[26]; // Armazena letras corretas para evitar repeti��es

        while (tentativas > 0) {
            System.out.println("Palavra: " + new String(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (letraInseridaAntes(letra, letrasCorretas)) {
                System.out.println("Voc� j� tentou essa letra. Tente novamente.");
                continue;
            }

            letrasCorretas[26 - tentativas] = letra;

            if (adivinharLetra(letra, palavraEscolhida, palavraOculta)) {
                System.out.println("Letra correta!");
            } else {
                System.out.println("Letra incorreta!");
                tentativas--;
            }

            if (Arrays.equals(palavraEscolhida.toCharArray(), palavraOculta)) {
                System.out.println("Parab�ns! Voc� venceu!");
                System.out.println(palavraOculta);
                break;
            }
        }

        if (tentativas == 0) {
            System.out.println("Voc� perdeu! A palavra era: " + palavraEscolhida);
        }

        scanner.close();
    }

    
    public static String escolherStringAleatoriamente(List<List<String>> listas) {
        Random random = new Random();
        int indiceCategoriaEscolhida = random.nextInt(listas.size());
        List<String> categoriaEscolhida = listas.get(indiceCategoriaEscolhida);

        return escolherElementoAleatoriamente(categoriaEscolhida);
    }

    
    public static String escolherElementoAleatoriamente(List<String> lista) {
        Random random = new Random();
        int indiceEscolhido = random.nextInt(lista.size());
        
        return lista.get(indiceEscolhido).toUpperCase();
    }

    
    public static boolean adivinharLetra(char letra, String palavra, char[] palavraOculta) {
        boolean acertou = false;
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.toUpperCase(palavra.charAt(i)) == Character.toUpperCase(letra)) {
                palavraOculta[i] = palavra.charAt(i);
                acertou = true;
            }
        }
        
        return acertou;
    }

    
    public static boolean letraInseridaAntes(char letra, char[] letrasInseridas) {
        for (char letraInserida : letrasInseridas) {
            if (letraInserida == letra) {
                return true;
            }
        }
        
        return false;
    }
}