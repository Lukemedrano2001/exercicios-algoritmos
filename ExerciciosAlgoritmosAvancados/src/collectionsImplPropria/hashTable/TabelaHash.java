package collectionsImplPropria.hashTable;

import java.util.LinkedList;

public class TabelaHash<TIPO> {
	private int tamanho;
    private LinkedList<Entry<TIPO>>[] tabela;

	@SuppressWarnings("unchecked")
	public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new LinkedList[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<Entry<TIPO>>();
        }
    }

    public int funcaoHash(int chave) {
    	int hash = chave;
    	
    	// Calcula o módulo do valor hash pelo tamanho da tabela. O Math.abs é usado para garantir que o resultado seja não negativo. Isso produz um índice válido para a tabela de hash, pois o resultado é um valor entre 0 e tamanho - 1.
    	return Math.abs(hash % tamanho);
    }
    
    // Complexidade de Tempo -> O(1) no melhor caso
 	// Complexidade de Tempo -> O(n) no pior caso
 	// Complexidade de Espaço -> O(n)
    public void insere(int chave, TIPO valor) {
        int indice = funcaoHash(chave);
        LinkedList<Entry<TIPO>> lista = tabela[indice];

        for (Entry<TIPO> entry: lista) {
            if (entry.getChave() == chave) {
                entry.setValor(valor);
                return;
            }
        }

        lista.add(new Entry<TIPO>(chave, valor));
    }

    // Complexidade de Tempo -> O(1) no melhor caso
 	// Complexidade de Tempo -> O(n) no pior caso
 	// Complexidade de Espaço -> O(1)
    public void remover(int chave) {
        int indice = funcaoHash(chave);
        LinkedList<Entry<TIPO>> lista = tabela[indice];

        lista.removeIf(entry -> entry.getChave() == chave);
    }

    // Complexidade de Tempo -> O(1) no melhor caso
  	// Complexidade de Tempo -> O(n) no pior caso
  	// Complexidade de Espaço -> O(1)
    public void remover(TIPO valor) {
        for (LinkedList<Entry<TIPO>> lista : tabela) {
            lista.removeIf(entry -> entry.getValor().equals(valor));
        }
    }

    // Complexidade de Tempo -> O(1) no melhor caso
 	// Complexidade de Tempo -> O(n) no pior caso
 	// Complexidade de Espaço -> O(1)
    public Entry<TIPO> buscar(int chave) {
        int indice = funcaoHash(chave);
        LinkedList<Entry<TIPO>> lista = tabela[indice];
        
        for (Entry<TIPO> entry: lista) {
            if (entry.getChave() == chave) {
                return entry;
            }
        }
        
        return null;
    }

    // Complexidade de Tempo -> O(1) no melhor caso
  	// Complexidade de Tempo -> O(n) no pior caso
  	// Complexidade de Espaço -> O(1)
    public Entry<TIPO> buscar(TIPO valor) {
        for (LinkedList<Entry<TIPO>> lista: tabela) {
            for (Entry<TIPO> entry: lista) {
                if (entry.getValor().equals(valor)) {
                    return entry;
                }
            }
        }
        
        return null;
    }

    // Complexidade de Tempo -> O(1) no melhor caso
  	// Complexidade de Tempo -> O(n) no pior caso
  	// Complexidade de Espaço -> O(1)
    public boolean contem(int chave) {
        int indice = funcaoHash(chave);
        LinkedList<Entry<TIPO>> lista = tabela[indice];

        for (Entry<TIPO> entry: lista) {
            if (entry.getChave() == chave) {
                return true;
            }
        }
        
        return false;
    }

    // Complexidade de Tempo -> O(1) no melhor caso
  	// Complexidade de Tempo -> O(n) no pior caso
  	// Complexidade de Espaço -> O(1)
    public boolean contem(TIPO valor) {
        for (LinkedList<Entry<TIPO>> lista: tabela) {
            for (Entry<TIPO> entry: lista) {
                if (entry.getValor().equals(valor)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (LinkedList<Entry<TIPO>> lista: tabela) {
            for (Entry<TIPO> entry: lista) {
                builder.append(entry.toString()).append("\n");
            }
        }
        
        return builder.toString();
    }
}