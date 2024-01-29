package collectionsImplPropria.hashTable;

public class TabelaHashTeste {
	public static void main(String[] args) {
        TabelaHash<String> hashTable = new TabelaHash<String>(10);

        // Inserção
        hashTable.insere(1, "Valor 1");
        hashTable.insere(11, "Valor 2");
        hashTable.insere(3, "Valor 3");

        System.out.println(hashTable.toString());

        
        // Busca
        System.out.println(hashTable.buscar(3));
        System.out.println(hashTable.buscar("Valor 2"));
        
        System.out.println(hashTable.contem(3));
        System.out.println(hashTable.contem("Valor 3"));
        
        
        // Remoção
        hashTable.remover(1);
        hashTable.remover("Valor 2");

        System.out.println(hashTable.toString());
	}
}