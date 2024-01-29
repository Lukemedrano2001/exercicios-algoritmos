package strings;

import java.util.Arrays;

public class VerificaAnagrama {
	public static void main(String[] args) {
		String palavra1 = "abc";
		String palavra2 = "bac";
		
		System.out.println(verificaAnagrama(palavra1, palavra2));
	}
	
	public static boolean verificaAnagrama(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		
		char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
	}
}