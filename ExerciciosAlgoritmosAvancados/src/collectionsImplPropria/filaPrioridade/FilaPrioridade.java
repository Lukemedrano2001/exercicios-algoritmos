package collectionsImplPropria.filaPrioridade;

import collectionsImplPropria.fila.Node;

public class FilaPrioridade<TIPO> {
	private Node<TIPO> primeiro = null;
	private int totalElementos = 0;
	
	
	public boolean isVazia() {
		return this.primeiro == null;
	}
	
	
	// Push
	public void enfileirar(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(chave, valor);
		
		if(this.primeiro == null || chave < this.primeiro.getChave()) {
			novoNode.setProximo(this.primeiro);
			this.primeiro = novoNode;
			this.totalElementos++;
		} else {
			Node<TIPO> nodeAtual = this.primeiro;
			
			while (nodeAtual != null && chave >= nodeAtual.getChave()) {
				if (nodeAtual.getProximo() == null || chave < nodeAtual.getProximo().getChave()) {
					novoNode.setProximo(nodeAtual.getProximo());
					nodeAtual.setProximo(novoNode);
					this.totalElementos++;
					return;
				}
				
				nodeAtual = nodeAtual.getProximo();
			}
		}
	}
	
	// Pop
	public void desinfileirar() {
		if(isVazia()) {
			throw new IllegalStateException("A fila de prioridade está vazia.");
		}
		
		this.primeiro = this.primeiro.getProximo();
		this.totalElementos--;
	}
	
	
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
	
	
	public int getTamanho() { 
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

	        if (nodeAtual.getProximo() != null && nodeAtual.getProximo() != this.primeiro) {
	            builder.append(", ");
	        }

	        nodeAtual = nodeAtual.getProximo();
		}
		
		builder.append(" ]");
		
		return builder.toString();
	}
}