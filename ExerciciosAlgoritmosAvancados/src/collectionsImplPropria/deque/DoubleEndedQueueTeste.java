package collectionsImplPropria.deque;

public class DoubleEndedQueueTeste {
	public static void main(String[] args) {
		DoubleEndedQueue<String> dequeString = new DoubleEndedQueue<String>();
		
		// Inserção
		dequeString.empilhar(1, "Guilherme");
		dequeString.empilhar(2, "Roberto");
		dequeString.enfileirar(3, "Carlos");
		dequeString.enfileirar(4, "Daniel");
		
		System.out.println(dequeString.toString());
		
		
		// Busca
		System.out.println(dequeString.buscaNode("Guilherme"));
		System.out.println(dequeString.contem("Daniel"));
		System.out.println(dequeString.getTotalElementos());
		
		
		// Remoção
		dequeString.desempilhar();
		System.out.println(dequeString.toString());
		
		dequeString.desinfileirar();
		System.out.println(dequeString.toString());
	}
}