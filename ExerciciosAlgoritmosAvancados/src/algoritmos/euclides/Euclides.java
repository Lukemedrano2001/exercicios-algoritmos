package algoritmos.euclides;

public class Euclides {
	public static int maximoDivisorComum(int numero1, int numero2) {
        while (numero2 != 0) {
            int valorTemp = numero2;
            numero2 = numero1 % numero2;
            numero1 = valorTemp;
        }
        
        return numero1;
    }

	public static void main(String[] args) {
		int numero1 = 48;
		int numero2 = 18;
		
		int resultado1 = maximoDivisorComum(numero1, numero2);
		
		System.out.println(resultado1);
	}
}