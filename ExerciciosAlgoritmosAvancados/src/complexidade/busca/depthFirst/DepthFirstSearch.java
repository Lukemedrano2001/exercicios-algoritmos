package complexidade.busca.depthFirst;

public class DepthFirstSearch {
	/* Depth First Search: É um algoritmo de busca para percorrer uma estrutura de dados em árvore ou grafo
		1-) DFS percorre a estrutura de dados explorando o máximo possível em uma ramificação antes de retroceder para explorar outras ramificações.
		2-) Utiliza recursão ou uma pilha para realizar a exploração em profundidade.
		3-) Inicia a busca a partir de um nó, explora o máximo possível em uma direção antes de retroceder e explorar outras direções.
		4-) Mantém um registro dos nós já visitados para evitar ciclos e repetições.
		
		// Complexidade de tempo: O(V + E), , V = Vértice/Node e E = Aresta
		// Complexidade de tempo: O(E^2) em grafos com muitas arestas
		// Complexidade de tempo: O(V) em grafos com poucas arestas
		// Complexidade de espaço: O(V) ou O(n)
	*/

	public static void main(String[] args) {
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
		
		
		grafo.depthFirstSearch(0);
	}
}