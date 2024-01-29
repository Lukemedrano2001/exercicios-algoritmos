package complexidade.busca.breadthFirst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	ArrayList<Node> nodes = new ArrayList<Node>();
	int[][] matriz;
	
	public Grafo(int tamanho) {
		this.matriz = new int[tamanho][tamanho];
	}
	
	public void adicionaNode(Node node) {
		this.nodes.add(node);
	}
	
	public void adicionaAresta(int origem, int destino) {
		this.matriz[origem][destino] = 1;
	}
	
	public boolean checkAresta(int origem, int destino) {
		if(matriz[origem][destino] == 1) {
			return true;			
		} else {
			return false;
		}
	}
	
	public void breadthFirstSearch(int origem) {
		Queue<Integer> fila = new LinkedList<Integer>();
		boolean[] nodesVisitados = new boolean[matriz.length];
		
		fila.offer(origem);
		nodesVisitados[origem] = true;
		
		while(fila.size() != 0) {
			origem = fila.poll();
			System.out.println(this.nodes.get(origem).getDado() + " = visitado");
			
			for(int i = 0; i < matriz[origem].length; i++) {
				if(matriz[origem][i] == 1 && !nodesVisitados[i]) {
					fila.offer(i);
					nodesVisitados[i] = true;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("   ");
	    for (Node node : this.nodes) {
	    	builder.append(node.getDado() + "  ");
	    }
	    
	    builder.append("\n");

	    for (int i = 0; i < matriz.length; i++) {
	    	builder.append(this.nodes.get(i).getDado() + "  ");
	        for (int j = 0; j < matriz[i].length; j++) {
	        	builder.append(this.matriz[i][j] + "  ");
	        }

	        builder.append("\n");    
	    }
	    
	    return builder.toString();
	}
}