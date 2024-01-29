package collectionsImplPropria.arvores.BST;

public class ArvoreBST<TIPO> {
	private Node<TIPO> raiz = null;
	private int totalElementos = 0;
	
	
	public void insercao(int chave, TIPO valor) {
		this.raiz = insercaoRecursiva(this.raiz, chave, valor);
		this.totalElementos++;
	}
	
	public Node<TIPO> insercaoRecursiva(Node<TIPO> raiz, int chave, TIPO valor) {
		if(raiz == null) {
			return new Node<TIPO>(chave, valor);
		}
		
		if(chave < raiz.getChave()) {
			raiz.setEsquerda(insercaoRecursiva(raiz.getEsquerda(), chave, valor));
		} else if(chave > raiz.getChave()) {
			raiz.setDireita(insercaoRecursiva(raiz.getDireita(), chave, valor));
		}
		
		return raiz;
	}
	
	
	public Node<TIPO> busca(int chave){
		return buscaRecursiva(this.raiz, chave);
	}
	
	public Node<TIPO> buscaRecursiva(Node<TIPO> raiz, int chave){
		if(raiz == null || raiz.getChave() == chave) {
			return raiz;
		}
		
		if(chave < raiz.getChave()) {
			return buscaRecursiva(raiz.getEsquerda(), chave);
		} else {
			return buscaRecursiva(raiz.getDireita(), chave);			
		}
	}
	
	
	public void remocao(int chave) {
		this.raiz = remocaoRecursiva(this.raiz, chave);
		this.totalElementos--;
	}
	
	public Node<TIPO> remocaoRecursiva(Node<TIPO> raiz, int chave) {
		if(raiz == null) {
			return raiz;
		}
		
		if(chave < raiz.getChave()) {
			raiz.setEsquerda(remocaoRecursiva(raiz.getEsquerda(), chave));
		} else if(chave > raiz.getChave()) {
			raiz.setDireita(remocaoRecursiva(raiz.getDireita(), chave));
		} else {
			// Nó com apenas um filho
			if(raiz.getEsquerda() == null) {
				return raiz.getDireita();
			} else if(raiz.getDireita() == null) {
				return raiz.getEsquerda();
			}
			
			// Nó com dois filhos: Encontrar o sucessor na subárvore da direita
            raiz.setChave(getSucessor(raiz.getDireita()));
            raiz.setDireita(remocaoRecursiva(raiz.getDireita(), raiz.getChave()));
		}
		
		return raiz;
	}
	
	
	public int getSucessor(Node<TIPO> raiz) {
		int menorValor = raiz.getChave();
		
		while(raiz.getEsquerda() != null) {
			menorValor = raiz.getEsquerda().getChave();
			raiz = raiz.getEsquerda();
		}
				
		return menorValor;
	}
	
	
	public int getTotalElementos() {
		return this.totalElementos;
	}
	
	
	public void preOrdem() {
		preOrdemRecursiva(this.raiz);
	}
	
	public void preOrdemRecursiva(Node<TIPO> raiz) {
		if(raiz != null) {
			System.out.print(raiz.getChave() + " ");
			preOrdemRecursiva(raiz.getEsquerda());
			preOrdemRecursiva(raiz.getDireita());
		}
	}
	
	
	public void inOrdem() {
		inOrdemRecursiva(this.raiz);
	}

	public void inOrdemRecursiva(Node<TIPO> raiz) {
		if(raiz != null) {
			inOrdemRecursiva(raiz.getEsquerda());
			System.out.print(raiz.getChave() + " ");
			inOrdemRecursiva(raiz.getDireita());
		}
	}
	
	
	public void posOrdem() {
		posOrdemRecursiva(this.raiz);
	}
	
	public void posOrdemRecursiva(Node<TIPO> raiz) {
		if(raiz != null) {
			posOrdemRecursiva(raiz.getEsquerda());
			posOrdemRecursiva(raiz.getDireita());
			System.out.print(raiz.getChave() + " ");
		}
	}	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		System.out.println();
		imprimirArvoreRecursivamente(raiz, builder, 0);
		return builder.toString();
	}
	
	public void imprimirArvoreRecursivamente(Node<TIPO> raiz, StringBuilder builder, int nivel) {
		if(raiz != null) {
			imprimirArvoreRecursivamente(raiz.getDireita(), builder, nivel + 1);
			
            for (int i = 0; i < nivel; i++) {
                builder.append("  ");
            }
            
            builder.append(raiz.getChave()).append("\n");
            
            imprimirArvoreRecursivamente(raiz.getEsquerda(), builder, nivel + 1);
		}
	}
}