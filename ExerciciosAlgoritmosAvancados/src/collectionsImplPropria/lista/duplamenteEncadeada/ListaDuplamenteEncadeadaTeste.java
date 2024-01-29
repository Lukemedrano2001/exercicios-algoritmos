package collectionsImplPropria.lista.duplamenteEncadeada;

public class ListaDuplamenteEncadeadaTeste {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();
		
		// Inserção
		lista.adicionaNoComeco(1, "Guilherme");
		lista.adicionaNoComeco(2, "Roberto");
		lista.adicionaNoFinal(3, "Daniel");
		lista.adicionaNoFinal(4, "Ana");
		lista.adicionaEmQualquerLugar(1, 5, "Maria");
		
		System.out.println(lista);
		
		
		// Busca
		System.out.println(lista.buscaNode(3));
        System.out.println(lista.contem("Maria"));
		System.out.println(lista.getTotalElementos());
		
		
		// Remoção
		lista.removeNoComeco();
		System.out.println(lista);
		
		lista.removeNoFinal();
		System.out.println(lista);
		
		lista.removeEmQualquerLugar(1);
		System.out.println(lista);
	}
}