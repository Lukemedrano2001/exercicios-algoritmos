package collectionsApiPadrao.arvores.BST.treeMap;

import java.util.TreeMap;

public class TreeMapBST {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMapBST = new TreeMap<>();

        // Inserção
        treeMapBST.put(50, "Cinquenta");
        treeMapBST.put(30, "Trinta");
        treeMapBST.put(70, "Setenta");
        treeMapBST.put(20, "Vinte");
        treeMapBST.put(40, "Quarenta");
        treeMapBST.put(60, "Sessenta");
        treeMapBST.put(80, "Oitenta");
        

        // Busca
        System.out.println(treeMapBST.get(20));

        // Remoção
        System.out.println(treeMapBST.remove(20));

        // Percurso em Ordem
        System.out.println("\nEm Ordem");
        for (Integer chave : treeMapBST.keySet()) {
            String valor = treeMapBST.get(chave);
            System.out.printf("Chave: %d | Valor: %s \n", chave, valor);
        }
    }
}