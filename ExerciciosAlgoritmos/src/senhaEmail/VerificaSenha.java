package senhaEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaSenha {
	public static void main(String[] args) {
		// ^ - Início da string.
		// (?=.*[a-z]) - Deve conter pelo menos uma letra minúscula.
		// (?=.*[A-Z]) - Deve conter pelo menos uma letra maiúscula.
		// (?=.*\\d) - Deve conter pelo menos um dígito.
		// (?=.*[!@#$%�&*()_+]) - Deve conter pelo menos um caractere especial.
		// .{8,} - A senha deve ter no mínimo 8 caracteres.
		
		String senha1 = "aA1@";
		String senha2 = "aaAAaaAA";
		String senha3 = "aaAA1122";
		String senha4 = "aaAA11@@";
		
		System.out.printf("%s: %s \n", verificaSenha(senha1), senha1);
		System.out.printf("%s: %s \n", verificaSenha(senha2), senha2);
		System.out.printf("%s: %s \n", verificaSenha(senha3), senha3);
		System.out.printf("%s: %s ", verificaSenha(senha4), senha4);
	}
	
	private static boolean validacao(Pattern pattern, String  campo) {
		Matcher matcher = pattern.matcher(campo);
		return matcher.matches();
	}
	
	public static String verificaSenha(String senha) {
		Pattern patternSenha = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%�&*()_+]).{8,}$");
		boolean matchSenha = validacao(patternSenha, senha);
		
		if(matchSenha) {
			return String.format("Senha passou na verifica��o");			
		} else {
			return String.format("Senha n�o passou na verifica��o");
		}
	}
}