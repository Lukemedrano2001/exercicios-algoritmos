package collectionsImplPropria.grafo.listaAdjacente;

import java.util.ArrayList;
import java.util.LinkedList;

public class Grafo {
	ArrayList<LinkedList<Node>> adjacentes = new ArrayList<LinkedList<Node>>();
	
	public void adicionaNode(Node node) {
		LinkedList<Node> listaAtual = new LinkedList<Node>();
		listaAtual.add(node);
		this.adjacentes.add(listaAtual);
	}
	
	public void adicionaAresta(int origem, int destino) {
		LinkedList<Node> listaAtual = this.adjacentes.get(origem);
		Node nodeDestino = this.adjacentes.get(destino).get(0);
		listaAtual.add(nodeDestino);
	}
	
	public boolean checkAresta(int origem, int destino) {
		LinkedList<Node> listaAtual = this.adjacentes.get(origem);
		Node nodeDestino = this.adjacentes.get(destino).get(0);
		
		for(Node node: listaAtual) {
			if(node == nodeDestino) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for(LinkedList<Node> listaAtual: this.adjacentes) {
			for(Node node: listaAtual) {
				builder.append(node.getDado() + " -> ");
			}
			
			builder.append("\n");
		}
	    
	    return builder.toString();
	}
}