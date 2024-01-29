package strings;

public class ContaCaracteres {
    public static void main(String[] args) {
        String nome = "guilherme";

        System.out.println("Número de caracteres: " + contaCaracteres(nome));
    }

    public static int contaCaracteres(String string) {
        return string.length();
    }
}