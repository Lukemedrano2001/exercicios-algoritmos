package collectionsImplPropria.hashTable;

public class Entry<TIPO> {
	private final int chave;
    private TIPO valor;

    public Entry(int chave, TIPO valor) {
        this.chave = chave;
        this.valor = valor;
    }

	public int getChave() {
		return chave;
	}

	public TIPO getValor() {
		return valor;
	}
	
	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	
	public int hashCode() {
        return this.valor.hashCode();
    }
	
	@Override
	public String toString() {
		return String.format("HashCode: %d | Chave: %d | Valor: %s", this.hashCode(), this.getChave(), this.getValor());
	}
}