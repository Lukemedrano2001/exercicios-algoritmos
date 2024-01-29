package collectionsApiPadrao.filaPrioridade;

import java.util.PriorityQueue;

public class FilaPrioridadeInversa {
	public static void main(String[] args) {
		PriorityQueue<Integer> filaPrioridade = new PriorityQueue<Integer>((a, b) -> b - a);
		
		filaPrioridade.offer(3);
        filaPrioridade.offer(1);
        filaPrioridade.offer(4);
        filaPrioridade.offer(2);
        
        while (!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.poll());
        }
	}
}