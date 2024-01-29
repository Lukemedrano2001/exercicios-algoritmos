package senhaEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaEmail {
	public static void main(String[] args) {
		// ^ - Início da string.
		// [a-zA-Z0-9_+&*-]+ - Pelo menos um caractere alfanumérico, '_', '+', '&', '*' ou '-'.
		// (?:\\.[a-zA-Z0-9_+&*-]+)* - Grupo n�o capturador para permitir pontos seguidos de alfanuméricos.
		// @ - O símbolo de arroba.
		// \\w+ - Pelo menos um caractere alfanumérico para o domínio.
		// \\.[a-zA-Z]{2,7} - Ponto seguido por dois a sete caracteres alfabéticos (domínio).
		// $ - Fim da string.
		
		String email1 = "fulano.com";
		String email2 = "fulano@email.com";
		
		System.out.printf("%s: %s \n", verificaEmail(email1), email1);
		System.out.printf("%s: %s", verificaEmail(email2), email2);
	}
	
	private static boolean validacao(Pattern pattern, String  campo) {
		Matcher matcher = pattern.matcher(campo);
		return matcher.matches();
	}
	
	public static String verificaEmail(String email) {
		Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@\\w+\\.[a-zA-Z]{2,7}$");
        boolean matchEmail = validacao(patternEmail, email);
		
		if(matchEmail) {
			return String.format("E-mail passou na verifica��o");			
		} else {
			return String.format("E-mail n�o passou na verifica��o");
		}
	}
}