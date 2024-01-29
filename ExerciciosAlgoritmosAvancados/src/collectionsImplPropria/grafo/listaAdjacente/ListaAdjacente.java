package collectionsImplPropria.grafo.listaAdjacente;

public class ListaAdjacente {
	public static void main(String[] args) {
		// Complexidade de tempo: O(V) ou O(n)
		// Complexidade de espaço: O(V + E), V = Vértice/Node e E = Aresta
		
		Grafo grafo = new Grafo();
		Node node1 = new Node('A');	// Índice 0
		Node node2 = new Node('B'); // Índice 1
		Node node3 = new Node('C'); // Índice 2
		Node node4 = new Node('D'); // Índice 3
		Node node5 = new Node('E'); // Índice 4
		
		// Nodes/Vértices
		grafo.adicionaNode(node1);
		grafo.adicionaNode(node2);
		grafo.adicionaNode(node3);
		grafo.adicionaNode(node4);
		grafo.adicionaNode(node5);
		
		// Aresta
		grafo.adicionaAresta(0, 1);
		grafo.adicionaAresta(1, 2);
		grafo.adicionaAresta(2, 3);
		grafo.adicionaAresta(2, 4);
		grafo.adicionaAresta(4, 0);
		grafo.adicionaAresta(4, 2);
		
		System.out.println(grafo.toString());
		
		// Check Aresta
		grafo.checkAresta(0, 1);
	}
}