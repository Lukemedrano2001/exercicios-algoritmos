package torreHanoi;

public class TorreHanoi {
	public static void main(String[] args) {
		/*
			É um quebra-cabeça matemático que envolve mover uma pilha de discos de um pino para outro, seguindo tr�s regras simples:

			1-) Apenas um disco pode ser movido por vez.
			2-) Um disco maior não pode ser colocado sobre um disco menor.
			3-) Apenas o topo de uma pilha pode ser movido para outro pino.
			
			A solução tradicional é recursiva e tem uma complexidade de tempo exponencial, O(2^n) , onde n é o número de discos. Cada disco é movido para o pino de destino usando um pino auxiliar.
		*/
		
        int numeroDiscos = 3;

        System.out.printf("Movimentos para resolver a Torre de Hanoi com discos: %d \n", numeroDiscos);
        resolverTorreHanoi(numeroDiscos, 'A', 'C', 'B');
    }
	
	// O(2^n) de tempo
	// 2^n - 1 de movimentos, onde n = Número de discos
	// O(n) de espaço
    public static void resolverTorreHanoi(int numeroDiscos, char origem, char destino, char auxiliar) {
        if (numeroDiscos == 1) {
            System.out.printf("Mover disco 1 de %c para %c \n", origem, destino);
            return;
        }

        resolverTorreHanoi(numeroDiscos - 1, origem, auxiliar, destino);
        System.out.printf("Mover disco %d de %c para %c \n", numeroDiscos, origem, destino);
        resolverTorreHanoi(numeroDiscos - 1, auxiliar, destino, origem);
    }
}