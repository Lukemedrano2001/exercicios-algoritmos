package collectionsImplPropria.lista.circular;

public class ListaCircularTeste {
	public static void main(String[] args) {
		ListaCircular<String> lista = new ListaCircular<String>();
		
		// Inserção
		lista.adicionaNoComeco(1, "Guilherme");
		lista.adicionaNoComeco(2, "Carlos");
		lista.adicionaNoFinal(3, "Roberto");
		lista.adicionaNoFinal(4, "Ana");
		lista.adicionaEmQualquerLugar(1, 5, "Daniel");
		
		System.out.println(lista);
		
		
		// Busca
		System.out.println(lista.buscaNode(1));
		System.out.println(lista.getTotalElementos());
		System.out.println(lista.contem("Daniel"));
		
		
		// Remoção
		lista.removeNoComeco();
		System.out.println(lista.toString());
		
		lista.removeNoFinal();
		System.out.println(lista.toString());
		
		lista.removeEmQualquerLugar(1);
		System.out.println(lista.toString());

	}
}