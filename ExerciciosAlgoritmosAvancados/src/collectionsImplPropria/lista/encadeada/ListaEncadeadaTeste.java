package collectionsImplPropria.lista.encadeada;

public class ListaEncadeadaTeste {
	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<String>();
		
		// Inserção
        lista.adicionaNoComeco(1, "Mauricio");
        lista.adicionaNoComeco(2, "Paulo");
        lista.adicionaNoComeco(3, "Guilherme");
        lista.adicionaNoFinal(4, "Marcelo");
        lista.adicionaEmQualquerLugar(1, 5, "Carlos");
        
        System.out.println(lista.toString());
        
        
        // Busca
        System.out.println(lista.buscaNode(3));
        System.out.println(lista.contem("Mauricio"));
        System.out.println(lista.getTotalElementos());
        
        
        // Remoção
        lista.removeNoComeco();
        System.out.println(lista.toString());
        
        lista.removeNoFinal();
        System.out.println(lista.toString());
        
        lista.removeEmQualquerLugar(1);
        System.out.println(lista.toString());
	}
}