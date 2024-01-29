package strings;

public class Palindromo {
	public static void main(String[] args) {
		String texto = "roma é amor";
		
		System.out.println(verificaPalindromo(texto));
	}
	
	public static String inverterString(String string) {
		char[] arrayDeCaracteres = string.toCharArray();

        for (int i = 0, j = arrayDeCaracteres.length - 1; i < j; i++, j--) {
            char temp = arrayDeCaracteres[i];
            arrayDeCaracteres[i] = arrayDeCaracteres[j];
            arrayDeCaracteres[j] = temp;
        }

        return new String(arrayDeCaracteres);
	}
	
	public static boolean verificaPalindromo(String string1) {
		String stringInvertida = inverterString(string1);
		boolean resultado =  string1.equalsIgnoreCase(stringInvertida);
		
		return resultado;
	}
}