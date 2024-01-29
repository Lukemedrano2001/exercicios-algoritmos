package algoritmosSimples.elementosUnicos.numeros;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosUnicosRepetidos {
    public static void main(String[] args) {
        List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 4, 5, 5);

        Filtragem filtragem1 = new Filtragem(numeros1);
        Filtragem filtragem2 = new Filtragem(numeros2);

        filtragem1.somaElementos();
        filtragem2.somaElementos();

        System.out.println(filtragem1);
        System.out.println(filtragem2);
    }
}
