package complexidade.ordenacao.heapSort;

import java.util.List;

public class HeapSortGenerics {
    public static <TIPO extends Comparable<TIPO>> void heapSort(List<TIPO> lista) {
        int tamanho = lista.size();

        // Criando o heap para organizar a lista
        // For -> O(n * log n), pois cada chamada do heapify tem complexidade O(log n)
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            heapify(lista, tamanho, i);
        }

        // Extrair elementos um por um do heap
        // For -> O(n * log n), pois cada chamada do heapify tem complexidade O(log n)
        for (int i = tamanho - 1; i >= 0; i--) {
            // Mover a raiz atual para o final da lista
            TIPO valorTemp = lista.get(0);
            lista.set(0, lista.get(i));
            lista.set(i, valorTemp);

            // Chamar heapify no heap reduzido
            heapify(lista, i, 0);
        }
    }

    public static <TIPO extends Comparable<TIPO>> void heapify(List<TIPO> lista, int tamanho, int i) {
        int maior = i;
        int filhoEsquerda = 2 * i + 1;
        int filhoDireita = 2 * i + 2;

        // Se o filho da esquerda é maior que a raiz
        if (filhoEsquerda < tamanho && lista.get(filhoEsquerda).compareTo(lista.get(maior)) > 0) {
            maior = filhoEsquerda;
        }

        // Se o filho da direita é maior que a raiz
        if (filhoDireita < tamanho && lista.get(filhoDireita).compareTo(lista.get(maior)) > 0) {
            maior = filhoDireita;
        }

        // Se o maior não é a raiz
        if (maior != i) {
            // Trocar a raiz com o maior
            TIPO valorTemp = lista.get(i);
            lista.set(i, lista.get(maior));
            lista.set(maior, valorTemp);

            // Recursão -> O(log n)
            // Recursivamente heapify a subárvore afetada
            heapify(lista, tamanho, maior);
        }
    }
}