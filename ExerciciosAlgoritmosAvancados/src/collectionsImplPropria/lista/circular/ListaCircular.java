package collectionsImplPropria.lista.circular;

public class ListaCircular<TIPO> {
	private Node<TIPO> primeiro = null;
	private Node<TIPO> ultimo = null;
	private int totalElementos = 0;
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaNoComeco(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(primeiro, chave, valor);
		
		if(this.totalElementos == 0) {
			novoNode.setProximo(novoNode);
			this.primeiro = novoNode;
			this.ultimo = novoNode;
		} else {
			novoNode.setProximo(this.primeiro);
			this.primeiro = novoNode;
		}
		
		this.totalElementos++;
	}
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaNoFinal(int chave, TIPO valor) {		
		if(this.totalElementos == 0) {
			adicionaNoComeco(chave, valor);
		} else {
			Node<TIPO> novoNode = new Node<TIPO>(primeiro, chave, valor);
			Node<TIPO> ultimo = this.ultimo;
			
			novoNode.setProximo(this.primeiro);
			ultimo.setProximo(novoNode);
			this.ultimo = novoNode;
		}
		
		this.totalElementos++;
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void adicionaEmQualquerLugar(int posicao, int chave, TIPO valor) {
		if(this.totalElementos == 0) {
			adicionaNoComeco(chave, valor);
		} else if(posicao == this.totalElementos) {
			adicionaNoFinal(chave, valor);
		} else {
			Node<TIPO> nodeAtual = this.primeiro;
			Node<TIPO> novoNode = new Node<TIPO>(null, chave, valor);
			
			for(int i = 1; i < posicao - 1; i++) {
				nodeAtual = nodeAtual.getProximo();
			}
			
			novoNode.setProximo(nodeAtual.getProximo());
			nodeAtual.setProximo(novoNode);
			
			this.totalElementos++;
		}
	}
	
	// Complexidade de Algoritmo -> O(1)
	public void removeNoComeco() {
		if(this.totalElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		if(this.totalElementos == 1) {
			this.primeiro = null;
			this.ultimo = null;
		} else {
			this.primeiro = this.primeiro.getProximo();
			this.ultimo.setProximo(this.primeiro);
		}
		
		this.totalElementos--;
	}
	
	// Complexidade de Algoritmo -> O(1)
	public void removeNoFinal() {
		if(this.totalElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		if(this.totalElementos == 1) {
			removeNoComeco();
		} else {
			Node<TIPO> nodeAnterior = pegaNode(this.totalElementos - 2);
			nodeAnterior.setProximo(this.primeiro);
			this.ultimo = nodeAnterior;
			
			this.totalElementos--;
		}
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void removeEmQualquerLugar(int posicao) {
	    if (this.totalElementos == 0) {
	        throw new IllegalArgumentException("Lista vazia");
	    } else if (posicao == 0) {
	        removeNoComeco();
	    } else if (!posicaoOcupada(posicao)) {
	        throw new IllegalArgumentException("Posicao Inexistente");
	    } else if (posicao == this.totalElementos - 1) {
	        removeNoFinal();
	    } else {
	        Node<TIPO> nodeAnterior = pegaNode(posicao - 1);
	        Node<TIPO> nodeRemover = nodeAnterior.getProximo();
	        nodeAnterior.setProximo(nodeRemover.getProximo());

	        if (posicao == 1) {
	            // Se a posição a ser removida for a segunda, atualiza o primeiro nó
	            this.primeiro = nodeRemover.getProximo();
	        }

	        this.totalElementos--;
	    }
	}

	
	public Node<TIPO> buscaNode(int posicao) { 
		return pegaNode(posicao);
	}
	 
	// Complexidade de Algoritmo -> O(n)
	public Node<TIPO> pegaNode(int posicao) { 
		if(!posicaoOcupada(posicao)) {
	        throw new IllegalArgumentException("Posicao Inexistente");
	    }
		
		Node<TIPO> nodeAtual = primeiro;
		
		for(int i = 0; i < posicao; i++) {
			nodeAtual = nodeAtual.getProximo();
		}
		
		return nodeAtual;
	}
	
	
	public boolean posicaoOcupada(int posicao) {
	    return posicao >= 0 && posicao < this.totalElementos;
	}
	 
	
	public int getTotalElementos() { 
		return this.totalElementos; 
	}
	 
	// Complexidade de Algoritmo -> O(n)
	public boolean contem(Object valor) { 
		Node<TIPO> nodeAtual = primeiro;
		
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

	    StringBuilder builder = new StringBuilder("[ ");
	    Node<TIPO> nodeAtual = this.primeiro;

	    while (nodeAtual != null) {
	        builder.append(nodeAtual.getValor());

	        if (nodeAtual.getProximo() != primeiro) {
	            builder.append(", ");
	        }

	        nodeAtual = nodeAtual.getProximo();

	        if (nodeAtual == primeiro) {
	            break;
	        }
	    }

	    builder.append(" ]");

	    return builder.toString();
	}
}