package collectionsImplPropria.lista.duplamenteEncadeada;

import java.util.Objects;

public class Node<TIPO> {
	private Node<TIPO> proximo;	
	private Node<TIPO> anterior;	
	private int chave;
	private TIPO valor;
	
	public Node(Node<TIPO> proximo, Node<TIPO> anterior, int chave, TIPO valor) {
		this.proximo = proximo;
		this.anterior = anterior;
		this.chave = chave;
		this.valor = valor;
	}

	public Node<TIPO> getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Node<TIPO> proximo) {
		this.proximo = proximo;
	}
	
	public Node<TIPO> getAnterior() {
		return anterior;
	}

	public void setAnterior(Node<TIPO> anterior) {
		this.anterior = anterior;
	}
	
	public int getChave() {
		return this.chave;
	}
	
	public TIPO getValor() {
		return this.valor;
	}

	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null || getClass() != objeto.getClass())
			return false;
		Node<TIPO> node = (Node<TIPO>) objeto;
		return Objects.equals(valor, node.valor);
	}

	@Override
	public String toString() {
		int proximo;
		int anterior;
		if(this.proximo != null || this.anterior != null) {
			proximo = this.proximo.getChave();
			anterior = this.anterior.getChave();
		} else {
			proximo = -1;
			anterior = -1;
		}
		
		return String.format("Proximo: %d | Anterior: %d | Chave: %d | Valor: %s", 
				proximo, anterior, this.chave, this.valor);
	}
}