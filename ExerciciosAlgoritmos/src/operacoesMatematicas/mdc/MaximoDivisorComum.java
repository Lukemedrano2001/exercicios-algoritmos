package operacoesMatematicas.mdc;

public class MaximoDivisorComum {
	public static void main(String[] args) {
		System.out.println(maximoDivisorComum(12, 18));
	}
	
	public static String maximoDivisorComum(int numero1, int numero2) {
		int valor = 1;
		
		for(int i = 1; i <= numero1 && i <= numero2; i++) {
			if(numero1 % i == 0 && numero2 % i == 0) {
				valor = i;
			}
		}
		
		return String.format("Máximo Divisor Comum entre %d e %d = %d", numero1, numero2, valor);
	}
}