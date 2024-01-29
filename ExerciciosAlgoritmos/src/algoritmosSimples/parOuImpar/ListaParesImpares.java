package algoritmosSimples.parOuImpar;

import java.util.ArrayList;
import java.util.List;

public class ListaParesImpares {
	public static void main(String[] args) {
		List<Integer> numeros = geraNumeros(20);
		
		System.out.println(numeros);
		System.out.println(geraListaNumerosPares(numeros));
		System.out.println(geraListaNumerosImpares(numeros));
	}
	
	public static List<Integer> geraNumeros(int quantidade){
		List<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 0; i <= quantidade; i++) {
			numeros.add(i);
		}
		
		return numeros;
	}
	
	public static boolean verificaParOuImpar(double numero) {
		if(numero % 2 == 0) {
			return true;	// Número é par
		} else {
			return false;	// Número é ímpar
		}
	}
	
	public static List<Integer> geraListaNumerosPares(List<Integer> numeros){
		List<Integer> numerosPares = new ArrayList<Integer>();
		
		for(Integer numero: numeros) {
			boolean resultado = verificaParOuImpar(numero);
			
			if(resultado) {
				numerosPares.add(numero);
			}
		}
		
		return numerosPares;
	}
	
	public static List<Integer> geraListaNumerosImpares(List<Integer> numeros){
		List<Integer> numerosImpares = new ArrayList<Integer>();
		
		for(Integer numero: numeros) {
			boolean resultado = verificaParOuImpar(numero);
			
			if(!resultado) {
				numerosImpares.add(numero);
			}
		}
		
		return numerosImpares;
	}
}