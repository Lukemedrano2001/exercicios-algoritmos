package collectionsImplPropria.fila;

import java.util.Objects;

public class Node<TIPO> {
	private Node<TIPO> proximo = null;
	private int chave;
	private TIPO valor;
	
	public Node(int chave, TIPO valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public Node<TIPO> getProximo() {
		return this.proximo;
	}

	public void setProximo(Node<TIPO> proximo) {
		this.proximo = proximo;
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
		if(this.proximo != null) {
			proximo = this.proximo.getChave();
		} else {
			proximo = -1;
		}
		
		return String.format("Proximo: %s | Chave: %d | Valor: %s", proximo, this.chave, this.valor);
	}
}