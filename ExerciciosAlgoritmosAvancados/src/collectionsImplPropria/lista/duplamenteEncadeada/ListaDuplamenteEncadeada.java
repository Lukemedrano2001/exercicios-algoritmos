package collectionsImplPropria.lista.duplamenteEncadeada;

public class ListaDuplamenteEncadeada<TIPO> {
	private Node<TIPO> primeiro = null;
	private Node<TIPO> ultimo = null;
	private int totalElementos = 0;
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaNoComeco(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(null, null, chave, valor);
		
		if (this.totalElementos == 0) {
			this.primeiro = novoNode;
			this.ultimo = novoNode;
        } else {
            novoNode.setProximo(this.primeiro);
            this.primeiro.setAnterior(novoNode);
            this.primeiro = novoNode;
        }
		
		this.totalElementos++;
	}
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaNoFinal(int chave, TIPO valor) {
		if (this.totalElementos == 0) {
			adicionaNoComeco(chave, valor);
        } else {
        	Node<TIPO> novoNode = new Node<TIPO>(null, this.ultimo, chave, valor);
            this.ultimo.setProximo(novoNode);
            this.ultimo = novoNode;
        }
		
		this.totalElementos++;
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void adicionaEmQualquerLugar(int posicao, int chave, TIPO valor) {
		if(!posicaoOcupada(posicao)) {
	        throw new IllegalArgumentException("Posicao Inexistente");
	    }
		
		if(this.totalElementos == 0) {
			adicionaNoComeco(chave, valor);
		} else if(posicao == this.totalElementos) {
			adicionaNoFinal(chave, valor);
		} else {
			Node<TIPO> nodeAnterior = pegaNode(posicao - 1);
	        Node<TIPO> proximoNode = nodeAnterior.getProximo();
	        Node<TIPO> novoNode = new Node<TIPO>(proximoNode, nodeAnterior, chave, valor);

	        nodeAnterior.setProximo(novoNode);
	        proximoNode.setAnterior(novoNode);
	        
			this.totalElementos++;			
		}
	}

	// Complexidade de Algoritmo -> O(1)
	public void removeNoComeco() {
		if(this.totalElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		this.primeiro = this.primeiro.getProximo();
		this.totalElementos--;
		
		if(this.totalElementos == 0) {
			this.ultimo = null;
		}
	}
	
	// Complexidade de Algoritmo -> O(1)
	public void removeNoFinal() {
		if(this.totalElementos == 1) {
			removeNoComeco();
		} else {
			Node<TIPO> penultimoNode = this.ultimo.getAnterior();
			penultimoNode.setProximo(null);
	        this.ultimo = penultimoNode;
			this.totalElementos--;
		}
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void removeEmQualquerLugar(int posicao) {
		if(this.totalElementos == 1) {
			removeNoComeco();
		} else if(posicao == this.totalElementos - 1) {
			removeNoFinal();
		} else {
			Node<TIPO> nodeAnterior = pegaNode(posicao - 1);
			Node<TIPO> nodeRemovido = nodeAnterior.getProximo();
			Node<TIPO> proximoNode = nodeRemovido.getProximo();

			nodeAnterior.setProximo(proximoNode);
			proximoNode.setAnterior(nodeAnterior);
			
			this.totalElementos--;
		}
	}
	
	
	public boolean posicaoOcupada(int posicao) {
	    return posicao >= 0 && posicao < this.totalElementos;
	}
	
	
	public String buscaNode(int posicao) { 
		Node<TIPO> nodeAtual = pegaNode(posicao);
	    return nodeAtual.toString();
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

	    Node<TIPO> nodeAtual = this.primeiro;
	    StringBuilder builder = new StringBuilder("[ ");

	    while (nodeAtual != null) {
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