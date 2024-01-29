package collectionsImplPropria.deque;

import java.util.EmptyStackException;

public class DoubleEndedQueue<TIPO> {
	private Node<TIPO> primeiro = null;
	private Node<TIPO> ultimo = null;
	private int totalElementos = 0;
	
	
	public boolean isVazia() {
		return this.primeiro == null;
	}
	
	// Push Front
	// Complexidade de Algoritmo -> O(1)
	public void empilhar(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(chave, valor);
		
		if(this.primeiro == null) {
			this.primeiro = novoNode;
			this.ultimo = novoNode;			
		} else {
			novoNode.setProximo(this.primeiro);
			this.primeiro.setAnterior(novoNode);
			this.primeiro = novoNode;
		}

		this.totalElementos++;
	}
	
	// Pop Front 
	// Complexidade de Algoritmo -> O(1)
	public void desempilhar() {
		if(isVazia()) {
			throw new EmptyStackException();
		}
		
		this.primeiro = this.primeiro.getProximo();
		this.totalElementos--;
	}
	
	// Push Back
	// Complexidade de Algoritmo -> O(1)
	public void enfileirar(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(chave, valor);
		
		if(this.ultimo == null) {
			this.primeiro = novoNode;
			this.ultimo = novoNode;
		} else {
			novoNode.setAnterior(this.ultimo);
			this.ultimo.setProximo(novoNode);
			this.ultimo = novoNode;
		}
		
		this.totalElementos++;
	}
	
	// Pop Back
	// Complexidade de Algoritmo -> O(1)
	public void desinfileirar() {
		if(isVazia()) {
			throw new IllegalStateException("O deque está vazio.");
		}
		
		if(this.primeiro == this.ultimo) {
			this.primeiro = null;
			this.ultimo = null;
		} else {
			this.ultimo = this.ultimo.getAnterior();
			this.ultimo.setProximo(null);
		}
		
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
	 
	// Complexidade de Algoritmo -> O(n)
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