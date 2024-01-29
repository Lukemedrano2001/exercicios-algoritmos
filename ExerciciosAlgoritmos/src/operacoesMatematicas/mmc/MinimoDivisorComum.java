package operacoesMatematicas.mmc;

public class MinimoDivisorComum {
	public static void main(String[] args) {
		System.out.println(minimoDivisorComum(12, 18));
	}

	public static String minimoDivisorComum(int numero1, int numero2) {
		int valor = (numero1 * numero2) / maximoDivisorComum(numero1, numero2);
		return String.format("Máximo Multiplicador Comum entre %d e %d = %d", numero1, numero2, valor);
	}
	
	public static int maximoDivisorComum(int numero1, int numero2) {
		int valor = 1;
		
		for(int i = 1; i <= numero1 && i <= numero2; i++) {
			if(numero1 % i == 0 && numero2 % i == 0) {
				valor = i;
			}
		}
		
		return valor;
	}
}