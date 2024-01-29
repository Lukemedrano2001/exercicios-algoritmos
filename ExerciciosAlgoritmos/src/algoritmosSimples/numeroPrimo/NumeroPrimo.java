package algoritmosSimples.numeroPrimo;

public class NumeroPrimo {
	public static void main(String[] args) {
		int numero = 4;
		int divisores = 0;
		
		if(numero < 2) {
			System.out.printf("O número %d não é primo.", numero);
		} else if(numero == 2 || numero == 3) {
			System.out.printf("O n�mero %d é primo.", numero);
		} else {
			for(int i = 2; i < numero; i++) {
				if(numero % i == 0) {
					divisores++;
					break;
				}
			}
			
			if(divisores > 0) {
				System.out.printf("O número %d não é primo.", numero);
			}else {
				System.out.printf("O n�mero %d é primo.", numero);
			}
		}
	}
}