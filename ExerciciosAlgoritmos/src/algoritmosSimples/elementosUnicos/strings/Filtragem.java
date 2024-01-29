package algoritmosSimples.elementosUnicos.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Filtragem {
	List<String> nomesArmazenados = new ArrayList<String>();
	List<String> nomesRepetidos = new ArrayList<String>();
	
	public Filtragem(List<String> nomes) {
		this.nomesArmazenados = new ArrayList<String>(nomes);
	}
	
	public void filtraElementos(List<String> nomes) {
		Set<String> nomesUnicos = new HashSet<String>();
        Set<String> nomesDuplicados = new HashSet<String>();
        
        for(String nome: nomesArmazenados) {
        	if(!nomesUnicos.add(nome)) {
        		nomesDuplicados.add(nome);
        	}
        }
        
        nomesRepetidos = new ArrayList<String>(nomesDuplicados);
        nomesArmazenados.removeAll(nomesDuplicados);
	}
	
	@Override
    public String toString() {
        String nomesArmazenados = "Nomes Armazenados: " + this.nomesArmazenados;
        String nomesRepetidos = "Nomes Repetidos: " + this.nomesRepetidos;

        return String.format("%s | %s", nomesArmazenados, nomesRepetidos);
    }
}