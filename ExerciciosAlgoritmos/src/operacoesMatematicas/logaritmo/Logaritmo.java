package operacoesMatematicas.logaritmo;

public class Logaritmo {
	public static void main(String[] args) {
		System.out.println(calculaLogaritmoBase10(10));
		System.out.println(calculaLogaritmo(2, 10));	// Logaritmo na base 2 de 10
		System.out.println(calculaLogaritmo(10, 2));	// Logaritmo na base 10 de 2
		
	}
	
	public static double calculaLogaritmoBase10(double numero) {
		return Math.log10(numero);
	}
	
	public static double calculaLogaritmo(double base, double numero) {
		if (numero <= 0 || base <= 0 || base == 1) {
            throw new IllegalArgumentException("Número e base devem ser positivos e a base não pode ser 1.");
        }
		
		// Calcula o logaritmo natural (base e) e divide pelo logaritmo natural da base desejada
        return Math.log(numero) / Math.log(base);
	}
}