package algoritmos.criptografia.substituicao;

public class Substituicao {
    public static void main(String[] args) {
        String mensagemOriginal = "HELLO WORLD";
        String mensagemCriptografada = cifraSubstituicao(mensagemOriginal, 3);

        System.out.println("Mensagem Original: " + mensagemOriginal);
        System.out.println("Mensagem Criptografada: " + mensagemCriptografada);
    }

    public static String cifraSubstituicao(String mensagem, int deslocamento) {
        StringBuilder mensagemCriptografada = new StringBuilder();

        for (char caractere: mensagem.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base;
                
                if(Character.isUpperCase(caractere)) {
                	base = 'A';
                } else {
                	base = 'a';
                }
                
                int novoCaractere = (caractere - base + deslocamento) % 26 + base;
                mensagemCriptografada.append((char) novoCaractere);
            } else {
                mensagemCriptografada.append(caractere);
            }
        }

        return mensagemCriptografada.toString();
    }
}
