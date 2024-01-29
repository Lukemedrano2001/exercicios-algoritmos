package collectionsApiPadrao.hashTable;

import java.util.Hashtable;

public class TabelaHash1 {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		
		hashTable.put(100, "Bob Esponja"); 
		hashTable.put(123, "Patrick"); 
		hashTable.put(321, "Sandy"); 
		hashTable.put(555, "Lula Molusco"); 
		hashTable.put(777, "Gary"); 
		
		hashTable.remove(777);
		
		for(Integer chave: hashTable.keySet()) {
			int hashCode = chave.hashCode() % 10;
			String valor = hashTable.get(chave);
			
			System.out.printf("HashCode: %d | Chave: %d | Valor: %s \n", hashCode, chave, valor);
		}
	}
}