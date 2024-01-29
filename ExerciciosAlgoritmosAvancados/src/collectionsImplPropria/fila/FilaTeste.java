package collectionsImplPropria.fila;

public class FilaTeste {
	public static void main(String[] args) {
		Fila<String> filaStrings = new Fila<String>();
		
		// Inserção
		filaStrings.enfileirar(1, "Guilherme");
		filaStrings.enfileirar(2, "Roberto");
		filaStrings.enfileirar(3, "Carlos");
		filaStrings.enfileirar(4, "Ana");
		filaStrings.enfileirar(5, "Daniel");
		
		System.out.println(filaStrings.toString());
		
		
		// Busca
		System.out.println(filaStrings.buscaNode("Ana"));
		System.out.println(filaStrings.contem("Carlos"));
		System.out.println(filaStrings.getTotalElementos());
		
		
		// Remoção
		filaStrings.desenfileirar();
		System.out.println(filaStrings.toString());
		
		filaStrings.desenfileirar();
		System.out.println(filaStrings.toString());
		
		filaStrings.desenfileirar();
		System.out.println(filaStrings.toString());
	}
}