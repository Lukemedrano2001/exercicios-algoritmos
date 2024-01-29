package algoritmosSimples.elementosUnicos.numeros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Filtragem {
    List<Integer> numerosArmazenados = new ArrayList<Integer>();
    List<Integer> numerosRepetidos = new ArrayList<Integer>();
    int somaNumerosUnicos;
    int somaNumerosRepetidos;

    public Filtragem(List<Integer> numeros) {
        this.numerosArmazenados = new ArrayList<Integer>(numeros);
    }

    public void filtraElementos() {
        Set<Integer> numerosUnicos = new HashSet<Integer>();
        Set<Integer> numerosDuplicados = new HashSet<Integer>();

        for (int numero: numerosArmazenados) {
            if(!numerosUnicos.add(numero)) {
                numerosDuplicados.add(numero);
            }
        }

        numerosRepetidos = new ArrayList<Integer>(numerosDuplicados);
        numerosArmazenados.removeAll(numerosRepetidos);
    }

    public void somaElementos() {
        filtraElementos();

        somaNumerosUnicos = calculaSoma(numerosArmazenados);
        somaNumerosRepetidos = calculaSoma(numerosRepetidos);
    }

    public int calculaSoma(List<Integer> numeros) {
        int soma = 0;
        for (int numero: numeros) {
            soma += numero;
        }
        
        return soma;
    }

    @Override
    public String toString() {
        String numerosArmazenados = "Números Armazenados: " + this.numerosArmazenados;
        String numerosRepetidos = "Números Repetidos: " + this.numerosRepetidos;
        String somaNumerosUnicos = "Soma de Números Únicos: " + this.somaNumerosUnicos;
        String somaNumerosRepetidos = "Soma de Números Repetidos: " + this.somaNumerosRepetidos;

        return String.format("%s | %s | %s | %s", numerosArmazenados, numerosRepetidos, somaNumerosUnicos, somaNumerosRepetidos);
    }
}