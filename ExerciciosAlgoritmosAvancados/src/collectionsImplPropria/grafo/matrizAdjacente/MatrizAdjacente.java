package collectionsImplPropria.grafo.matrizAdjacente;

public class MatrizAdjacente {
	public static void main(String[] args) {
		// Complexidade de tempo: O(1) para checar uma aresta
		// Complexidade de esapço: O(V^2) ou O(n^2), V = Vértice/Node
		
		Grafo grafo = new Grafo(5);
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
		System.out.println(grafo.checkAresta(0, 1));
	}
}