package collectionsImplPropria.lista.encadeada;

public class ListaEncadeada<TIPO> {
	// Os elementos são armazenados em locais diferentes na memória, a busca é menos eficiente, pois os elementos estão dispersos na memória. No entanto, a inserção e remoção de elementos, não é necessário mover os elementos adjacentes.
    // Cada elemento na lista contém uma referência para o próximo elemento, formando uma cadeia de elementos interligados.
	
	private Node<TIPO> primeiro = null;
	private Node<TIPO> ultimo = null;
	private int totalElementos = 0;

	// Complexidade de Algoritmo -> O(1)
	public void adicionaNoComeco(int chave, TIPO valor) {
		Node<TIPO> novoNode = new Node<TIPO>(primeiro, chave, valor);
		this.primeiro = novoNode;
		
		if(this.totalElementos == 0) {
			this.ultimo = this.primeiro;
		}
		
		this.totalElementos++;
	}
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaNoFinal(int chave, TIPO valor) {
		if(this.totalElementos == 0) {
			adicionaNoComeco(chave, valor);
		} else {
			Node<TIPO> novoNode = new Node<TIPO>(null, chave, valor);
			this.ultimo = novoNode;
			this.ultimo.setProximo(novoNode);
			
			this.totalElementos++;
		}
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void adicionaEmQualquerLugar(int posicao, int chave, TIPO valor) {
		if(this.totalElementos == 0) {
			adicionaNoComeco(chave, valor);
		} else if(posicao == this.totalElementos) {
			adicionaNoFinal(chave, valor);
		} else {
			Node<TIPO> nodeAnterior = this.pegaNode(posicao - 1);
			Node<TIPO> novoNode = new Node<TIPO>(nodeAnterior.getProximo(), chave, valor);
			nodeAnterior.setProximo(novoNode);
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
		if(this.totalElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		if (this.totalElementos == 1) {
	        removeNoComeco();
	    } else {
	        Node<TIPO> penultimo = pegaNode(this.totalElementos - 2);
	        penultimo.setProximo(null);
	        this.ultimo = penultimo;
	        
	        this.totalElementos--;
	    }	
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void removeEmQualquerLugar(int posicao) {
		if(this.totalElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		if(!posicaoOcupada(posicao)) {
	        throw new IllegalArgumentException("Posicao Inexistente");
	    }
		
		if (posicao == 0) {
			removeNoComeco();
		} else if (posicao == this.totalElementos - 1) {
			removeNoFinal();
		} else {
			Node<TIPO> nodeAnterior = pegaNode(posicao - 1);
			Node<TIPO> nodeRemovido = nodeAnterior.getProximo();
			
			nodeAnterior.setProximo(nodeRemovido.getProximo());
			nodeRemovido.setProximo(null);
			
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
		
		Node<TIPO> nodeAtual = this.primeiro;
		
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