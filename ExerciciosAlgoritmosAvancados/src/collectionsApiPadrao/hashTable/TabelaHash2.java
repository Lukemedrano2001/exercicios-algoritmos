package collectionsApiPadrao.hashTable;

import java.util.Hashtable;

public class TabelaHash2 {
	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		
		hashTable.put("100", "Bob Esponja"); 
		hashTable.put("123", "Patrick"); 
		hashTable.put("321", "Sandy"); 
		hashTable.put("555", "Squidward"); 
		hashTable.put("777", "Gary"); 
		
		for(String chave: hashTable.keySet()) {
			int hashCode = chave.hashCode();
			String valor = hashTable.get(chave);
			
			System.out.printf("HashCode: %d | Chave: %s | Valor: %s \n", hashCode, chave, valor);
		}
	}
}