package algoritmosSimples.parOuImpar;

public class ParOuImpar {
	public static void main(String[] args) {
		int numero = 3;
		
		if(numero % 2 == 0) {
			System.out.printf("Número %d é par.", numero);
		} else {
			System.out.printf("Número %d é ímpar.", numero);
		}
	}
}