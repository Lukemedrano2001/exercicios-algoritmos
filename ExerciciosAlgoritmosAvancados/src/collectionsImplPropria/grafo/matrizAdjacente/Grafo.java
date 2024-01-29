package collectionsImplPropria.grafo.matrizAdjacente;

import java.util.ArrayList;

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