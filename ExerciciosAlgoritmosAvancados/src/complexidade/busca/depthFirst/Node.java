package complexidade.busca.depthFirst;

public class Node {
	private char dado;
	private boolean nodeVisitado;
	
	public Node(char dado) {
		this.dado = dado;
	}

	public char getDado() {
		return dado;
	}

	public void setDado(char dado) {
		this.dado = dado;
	}
	
	public boolean isNodeVisitado() {
		return this.nodeVisitado;
	}
}