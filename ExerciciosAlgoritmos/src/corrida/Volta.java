package corrida;

public class Volta {
	int numeroVolta;
	int tempoVolta;
	
	public Volta(int numeroVolta, int tempoVolta) {
		this.numeroVolta = numeroVolta;
		this.tempoVolta = tempoVolta;
	}
	
	public int getNumeroVolta() {
		return numeroVolta;
	}

	public void setNumeroVolta(int numeroVolta) {
		this.numeroVolta = numeroVolta;
	}

	public int getTempoVolta() {
		return tempoVolta;
	}

	public void setTempoVolta(int tempoVolta) {
		this.tempoVolta = tempoVolta;
	}

	@Override
	public String toString() {
		return String.format("Numero: %d | Tempo: %d", numeroVolta, tempoVolta);
	}
}