package complexidade.ordenacao.insertionSort;

import java.util.List;

public class InsertionSortGenerics {
    public static <TIPO extends Comparable<TIPO>> void insertionSort(List<TIPO> nomes) {
        // Complexidade de tempo: O(n^2)
        // Complexidade de espaço: O(1)

        // For -> O(n)
        for (int i = 1; i < nomes.size(); i++) {
            TIPO chave = nomes.get(i);
            int j = i - 1;

            // While -> O(n)
            while (j >= 0 && nomes.get(j).compareTo(chave) > 0) {
                nomes.set(j + 1, nomes.get(j));
                j--;
            }

            nomes.set(j + 1, chave);
        }
    }
}