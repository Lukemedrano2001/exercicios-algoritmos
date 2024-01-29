package collectionsImplPropria.fila;

public class Fila<TIPO> {
	private Node<TIPO> primeiro = null;
	private Node<TIPO> ultimo = null;
	private int totalElementos = 0;
	
	
	public boolean isVazia() {
		return this.primeiro == null;
	}
	
	// Push
	// Complexidade de Algoritmo -> O(1)
	public void enfileirar(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(chave, valor);
		
		if(isVazia()) {
			this.primeiro = novoNode;
			this.ultimo = novoNode;
		} else {
			this.ultimo.setProximo(novoNode);
			this.ultimo = novoNode;
		}
		
		this.totalElementos++;
	}
	
	// Pop
	// Complexidade de Algoritmo -> O(1)
	public void desenfileirar() {
		if(isVazia()) {
			throw new IllegalStateException("A fila está vazia.");
		}
		
		this.primeiro = this.primeiro.getProximo();
		this.totalElementos--;
		
		if(isVazia()) {
			this.ultimo = null;
		}
	}
	
	// Complexidade de Algoritmo -> O(n)
	public Node<TIPO> buscaNode(TIPO valor){
		Node<TIPO> nodeAtual = this.primeiro;
		
		while(nodeAtual != null) {
			if(nodeAtual.getValor().equals(valor)) {
				return nodeAtual;
			}
			
			nodeAtual = nodeAtual.getProximo();
		}
		
		return null;
	}
	
	
	public int getTotalElementos() { 
		return this.totalElementos; 
	}
	 
	
	public boolean contem(Object valor) { 
		Node<TIPO> nodeAtual = this.primeiro;
		
		while(nodeAtual != null) {
			if(nodeAtual.getValor().equals(valor)) {
				return true;
			}
			
			nodeAtual = nodeAtual.getProximo();
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		if (this.totalElementos == 0) {
	        return "[]";
	    }
		
		Node<TIPO> nodeAtual = this.primeiro;
		StringBuilder builder = new StringBuilder("[ ");
		
		while(nodeAtual != null) {
			builder.append(nodeAtual.getValor());

	        if (nodeAtual.getProximo() != null) {
	            builder.append(", ");
	        }

	        nodeAtual = nodeAtual.getProximo();
		}
		
		builder.append(" ]");
		
		return builder.toString();
	}
}