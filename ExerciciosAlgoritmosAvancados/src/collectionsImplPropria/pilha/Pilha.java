package collectionsImplPropria.pilha;

import java.util.EmptyStackException;

public class Pilha<TIPO> {
	private Node<TIPO> topo = null;
	private int totalElementos = 0;
	
	
	public boolean isVazia() {
		return this.topo == null;
	}
	
	// Push
	// Complexidade de Algoritmo -> O(1)
	public void empilhar(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(chave, valor);
		novoNode.setProximo(this.topo);
		this.topo = novoNode;
		
		this.totalElementos++;
	}
	
	// Pop
	// Complexidade de Algoritmo -> O(1)
	public void desempilhar() {
		if(isVazia()) {
			throw new EmptyStackException();
		}

		this.topo = this.topo.getProximo();
		this.totalElementos--;
	}
	
	// Complexidade de Algoritmo -> O(n)
	public Node<TIPO> buscaNode(TIPO valor){
		Node<TIPO> nodeAtual = this.topo;
		
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
		Node<TIPO> nodeAtual = this.topo;
		
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
		
		Node<TIPO> nodeAtual = this.topo;
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