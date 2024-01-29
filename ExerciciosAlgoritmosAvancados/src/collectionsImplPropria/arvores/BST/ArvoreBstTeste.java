package collectionsImplPropria.arvores.BST;

public class ArvoreBstTeste {
	public static void main(String[] args) {
		/*
			Árvore de Busca Binária: Organiza os nós de forma que os menores ficam à esquerda e os maiores à direita, garantindo eficiência em inserções, buscas e remoções.

			
			Complexidade de tempo: O(log n) no médio e melhor caso
			Complexidade de tempo: O(n) no pior caso (Árvore desbalanceada)
			Complexidade de tempo: O(n)
		*/
		
		ArvoreBST<String> arvoreBST = new ArvoreBST<String>();

        // Inserção
        arvoreBST.insercao(50, "Cinquenta");	// Raiz
        arvoreBST.insercao(30, "Trinta");	// Raiz da sub árvore da esquerda de 50
        arvoreBST.insercao(70, "Setenta");	// Raiz da sub árvore da direita de 50
        arvoreBST.insercao(20, "Vinte");	// Raiz da sub árvore da esquerda de 30
        arvoreBST.insercao(40, "Quarenta");	// Raiz da sub árvore da direita de 30
        arvoreBST.insercao(60, "Sessenta");	// Raiz da sub árvore da esquerda de 70
        arvoreBST.insercao(80, "Oitenta");	// Raiz da sub árvore da direita de 70
        
        System.out.println(arvoreBST.toString());

        
        // Busca
        System.out.println(arvoreBST.getTotalElementos());
        System.out.println(arvoreBST.busca(40));
        System.out.println(arvoreBST.busca(90));

        
        // Remoção
        arvoreBST.remocao(30);
        System.out.println(arvoreBST.toString());

        
        // Percursos
        System.out.println("Pre-Ordem:");
        arvoreBST.preOrdem();
        
        System.out.println("\nIn-Ordem:");
        arvoreBST.inOrdem();
        
        System.out.println("\nPos-Ordem:");
        arvoreBST.posOrdem();
	}
}