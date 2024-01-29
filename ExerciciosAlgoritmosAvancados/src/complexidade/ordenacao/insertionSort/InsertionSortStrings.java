package complexidade.ordenacao.insertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortStrings {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>(List.of("Guilherme", "Roberto", "Ana", "Carlos"));

        InsertionSortGenerics.insertionSort(nomes);

        System.out.println(nomes);
    }
}