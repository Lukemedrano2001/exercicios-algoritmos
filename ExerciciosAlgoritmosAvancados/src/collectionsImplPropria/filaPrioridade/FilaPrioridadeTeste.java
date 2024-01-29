package collectionsImplPropria.filaPrioridade;

public class FilaPrioridadeTeste {
	public static void main(String[] args) {
		FilaPrioridade<String> filaPrioridadeStrings = new FilaPrioridade<String>();
		
		// Inserção
		filaPrioridadeStrings.enfileirar(3, "Terceiro");
		filaPrioridadeStrings.enfileirar(1, "Primeiro");
		filaPrioridadeStrings.enfileirar(4, "Quarto");
		filaPrioridadeStrings.enfileirar(5, "Quinto");
		filaPrioridadeStrings.enfileirar(2, "Segundo");
		
		System.out.println(filaPrioridadeStrings.toString());
		
		
		// Busca
		System.out.println(filaPrioridadeStrings.buscaNode("Terceiro"));
		System.out.println(filaPrioridadeStrings.contem("Quinto"));
		System.out.println(filaPrioridadeStrings.getTamanho());
		
		
		// Remoção
		filaPrioridadeStrings.desinfileirar();
		System.out.println(filaPrioridadeStrings.toString());
		
		filaPrioridadeStrings.desinfileirar();
		System.out.println(filaPrioridadeStrings.toString());
	}
}