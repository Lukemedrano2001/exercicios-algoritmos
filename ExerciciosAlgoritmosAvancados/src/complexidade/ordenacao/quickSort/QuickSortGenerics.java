package complexidade.ordenacao.quickSort;

import java.util.List;

public class QuickSortGenerics {
    public static <TIPO extends Comparable<TIPO>> void quickSort(List<TIPO> numeros, int inicio, int fim) {
        if (inicio >= fim) {
            return; // Caso base
        }

        int pivo = particao(numeros, inicio, fim);
        quickSort(numeros, inicio, pivo - 1); // Partição à esquerda
        quickSort(numeros, pivo + 1, fim); // Partição à direita
    }

    public static <TIPO extends Comparable<TIPO>> int particao(List<TIPO> numeros, int inicio, int fim) {
        TIPO pivo = numeros.get(fim);
        int i = inicio - 1;

        // For -> O(n)
        for (int j = inicio; j <= fim - 1; j++) {
            if (numeros.get(j).compareTo(pivo) < 0) {
                i++;
                TIPO valorTemp = numeros.get(i);
                numeros.set(i, numeros.get(j));
                numeros.set(j, valorTemp);
            }
        }

        i++;
        TIPO valorTemp = numeros.get(i);
        numeros.set(i, numeros.get(fim));
        numeros.set(fim, valorTemp);

        return i;
    }
}