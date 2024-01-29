package collectionsApiPadrao.arvores.BST.treeSet;

import java.util.TreeSet;

public class TreeSetBST {
	public static void main(String[] args) {
		TreeSet<Integer> treeSetBST = new TreeSet<Integer>();
        
        treeSetBST.add(50);	// Raiz
        treeSetBST.add(30);	// Raiz da sub árvore à esquerda de 50
        treeSetBST.add(70);	// Raiz da sub árvore à direita de 50
        treeSetBST.add(20);	// Raiz da sub árvore à esquerda de 30
        treeSetBST.add(40);	// Raiz da sub árvore à direita de 30
        treeSetBST.add(60);	// Raiz da sub árvore à esquerda de 70
        treeSetBST.add(80);	// Raiz da sub árvore à direita de 70

        // Busca
        boolean contemDois = treeSetBST.contains(2);
        System.out.println("Contém o elemento 2: " + contemDois);

        // Remoção
        treeSetBST.remove(3);
        
        // Em Ordem
        System.out.println("\nEm Ordem");
        for (Integer elemento : treeSetBST) {
            System.out.println("Elemento: " + elemento);
        }
	}
}