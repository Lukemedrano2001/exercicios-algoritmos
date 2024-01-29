package collectionsApiPadrao.listas.encadeada;

import java.util.LinkedList;

public class ListaEncadeada {
	public static void main(String[] args) {
		 // Na API padr�o do Java, não há uma exposição direta dos ponteiros que indicam os endereços de memória do próximo nó em uma lista encadeada.
		
		LinkedList<Integer> listaEncadeada1 = new LinkedList<Integer>();
		LinkedList<String> listaEncadeada2 = new LinkedList<String>();
		
		listaEncadeada1.add(1);
        listaEncadeada1.add(2);
        listaEncadeada1.add(3);
        
        listaEncadeada2.add("Guilherme");
        listaEncadeada2.add("Roberto");
        listaEncadeada2.add("Carlos");
        
        
        // Numeros
        System.out.println("Primeiro elemento: " + listaEncadeada1.getFirst());
        System.out.println("Segundo elemento: " + listaEncadeada1.get(1));
        System.out.println("Último Elemento: " + listaEncadeada1.getLast());
        
        // Strings
        System.out.println();
        System.out.println(listaEncadeada2);
        System.out.println("Primeiro elemento: " + listaEncadeada2.getFirst());
        System.out.println("Segundo elemento: " + listaEncadeada2.get(1));
        System.out.println("Último Elemento:" + listaEncadeada2.getLast());
	}
}