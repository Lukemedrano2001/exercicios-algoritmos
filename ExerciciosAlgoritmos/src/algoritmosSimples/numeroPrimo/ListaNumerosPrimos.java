package algoritmosSimples.numeroPrimo;

import java.util.ArrayList;
import java.util.List;

public class ListaNumerosPrimos {
	public static void main(String[] args) {
		List<Integer> numeros = geraNumeros(20);
		
		System.out.println(numeros);
		System.out.println(geraListaNumerosPrimos(numeros));
	}
	
	public static List<Integer> geraNumeros(int quantidade){
		List<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 0; i <= quantidade; i++) {
			numeros.add(i);
		}
		
		return numeros;
	}
	
	public static boolean verificaNumeroPrimo(int numero) {
		int divisores = 0;
		
		if(numero < 2) {
			return false;
		} else if(numero == 2 || numero == 3) {
			return true;
		} else {
			for(int i = 2; i < numero; i++) {
				if(numero % i == 0) {
					divisores++;
					break;
				}
			}
			
			if(divisores > 0) {
				return false;
			} else {
				return true;
			}
		}
	}
	
	public static List<Integer> geraListaNumerosPrimos(List<Integer> numeros){
		List<Integer> numerosPrimos = new ArrayList<Integer>();
		
		for(Integer numero: numeros) {
			boolean resultado = verificaNumeroPrimo(numero);
			
			if(resultado) {
				numerosPrimos.add(numero);
			}
		}
		
		return numerosPrimos;
	}
}