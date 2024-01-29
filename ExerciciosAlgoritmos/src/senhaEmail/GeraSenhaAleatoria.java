package senhaEmail;

import java.security.SecureRandom;

public class GeraSenhaAleatoria {
    private final static char[] letrasMinusculas = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final static char[] letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final static char[] numeros = "0123456789".toCharArray();
    private final static char[] especiais = "!@#$%^&*()-_=+".toCharArray();

    
    public static void main(String[] args) {
        int quantidade = 12;
        String senhaGerada = geraSenhaAleatoria(quantidade);
        System.out.println(senhaGerada);
    }

    
    public static String geraSenhaAleatoria(int quantidade) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < quantidade; i++) {
            char categoria = escolherCategoria(random);
            char caractere = escolherCaractere(categoria);

            senha.append(caractere);
        }

        return senha.toString();
    }

    
    private static char escolherCategoria(SecureRandom random) {
    	// 0 para minúsculas, 1 para maiúsculas, 2 para números, 3 para especiais
        int categoriaIndice = random.nextInt(4);
        
        if(categoriaIndice == 0) {
        	return 'l';
        } else if(categoriaIndice == 1) {
        	return 'u';
        } else if(categoriaIndice == 2) {
        	return 'n';
        } else if(categoriaIndice == 3) {
        	return 'e';
        } else {
        	return 'l';
        }
    }

    
    private static char escolherCaractere(char categoria) {
        SecureRandom random = new SecureRandom();
        
        if(categoria == 'l') {
        	return letrasMinusculas[random.nextInt(letrasMinusculas.length)];
        } else if(categoria == 'u') {
        	return letrasMaiusculas[random.nextInt(letrasMaiusculas.length)];
        } else if(categoria == 'n') {
        	return numeros[random.nextInt(numeros.length)];
        } else if(categoria == 'e') {
        	return especiais[random.nextInt(especiais.length)];
        } else {
        	return ' ';
        }
    }
}
