package strings;

public class InverterString {
	public static void main(String[] args) {
		String nome = "Guilherme";
		String texto = "roma eé amor";
		
		 System.out.println("Original: " + nome);
		 System.out.println("Original: " + texto);
	     System.out.println("Invertido: " + inverterString(nome));
	     System.out.println("Invertido: " + inverterString(texto));
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
}