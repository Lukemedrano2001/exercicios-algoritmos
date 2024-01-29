package collectionsImplPropria.arvores.BST;

import java.util.Objects;

public class Node<TIPO> {
	private Node<TIPO> esquerda = null;
	private Node<TIPO> direita = null;
	private int chave;
	private TIPO valor;
	
	public Node(int chave, TIPO valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public Node<TIPO> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Node<TIPO> esquerda) {
		this.esquerda = esquerda;
	}

	public Node<TIPO> getDireita() {
		return direita;
	}

	public void setDireita(Node<TIPO> direita) {
		this.direita = direita;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public TIPO getValor() {
		return valor;
	}

	public void setValor(TIPO valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave, valor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null || getClass() != objeto.getClass())
			return false;
		Node<TIPO> other = (Node<TIPO>) objeto;
		return chave == other.chave && Objects.equals(valor, other.valor);
	}
	
	@Override
	public String toString() {
		int esquerda;
		int direita;
		
		if(this.esquerda != null && this.direita != null) {
			esquerda = this.esquerda.getChave();
			direita = this.direita.getChave();
		} else if(this.esquerda != null && this.direita == null) {
			esquerda = this.esquerda.getChave();
			direita = -1;
		} else if(this.esquerda == null && this.direita != null) {
			direita = this.direita.getChave();
			esquerda = -1;
		} else {
			esquerda = -1;
			direita = -1;
		}
		
		return String.format("Esquerda: %d | Direita: %d | Chave: %d | Valor: %s", 
				esquerda, direita, this.chave, this.valor);
	}
}