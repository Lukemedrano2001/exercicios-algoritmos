package arraysMatrizes.arrays;

public class OperacoesArrays {
	public static void main(String[] args) {
		int[] numeros1 = { 1, 2, 3, 4, 5 };
		int[] numeros2 = { 6, 7, 8, 9, 10 };
		
		// Soma
		int resultado1 = somaArray(numeros1);
		int resultado2 = somaArray(numeros2);
		
		// Subtra��o
		int resultado3 = subtracaoArray(numeros1);
		int resultado4 = subtracaoArray(numeros2);
		
		// Multiplica��o
		int resultado5 = multiplicacaoArray(numeros1);
		int resultado6 = multiplicacaoArray(numeros2);
		
		// Divis�o
		double resultado7 = divisaoArray(numeros1);
		double resultado8 = divisaoArray(numeros2);
		
		// M�dia
		double resultado9 = mediaArray(numeros1);
		double resultado10 = mediaArray(numeros2);
		
		System.out.printf("Soma 1: %d | Soma 2: %d \n", resultado1, resultado2);
		System.out.printf("Subtração 1: %d | Subtração 2: %d \n", resultado3, resultado4);
		System.out.printf("Multiplicação 1: %d | Multiplicação 2: %d \n", resultado5, resultado6);
		System.out.printf("Divisão 1: %f | Divisão 2: %f \n", resultado7, resultado8);
		System.out.printf("Média 1: %.2f | Média 2: %.2f", resultado9, resultado10);
	}
	
	public static int somaArray(int[] numeros) {
		int resultado = 0;
		for(Integer numero: numeros) {
			resultado += numero;
		}
		
		return resultado;
	}
	
	public static int subtracaoArray(int[] numeros) {
		int resultado = 0;
		for(Integer numero: numeros) {
			resultado -= numero;
		}
		
		return resultado;
	}
	
	public static int multiplicacaoArray(int[] numeros) {
		int resultado = 1;
		for(Integer numero: numeros) {
			resultado *= numero;
		}
		
		return resultado;
	}
	
	public static double divisaoArray(int[] numeros) {
		double resultado = numeros[0];

        if (numeros.length > 1) {
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] != 0) {
                    resultado /= numeros[i];
                } else {
                    return 0;
                }
            }
        } else {
            return 0;
        }

        return resultado;
	}
	
	public static double mediaArray(int[] numeros) {
		int soma = somaArray(numeros);
		double media = soma / numeros.length;
		
		return media;
	}
}