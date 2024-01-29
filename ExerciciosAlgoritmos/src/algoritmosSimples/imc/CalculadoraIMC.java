package algoritmosSimples.imc;

public class CalculadoraIMC {
	public static void main(String[] args) {
		double altura = 1.94;
		double peso = 95;
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Peso / Altura^2 = %.2f", imc);
	}
	
}