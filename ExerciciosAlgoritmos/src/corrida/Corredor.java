package corrida;

import java.util.ArrayList;
import java.util.List;

public class Corredor {
	String nome;
	double velocidade;
	List<Volta> voltas = new ArrayList<Volta>();
	
	public Corredor(String nome, double velocidade) {
		this.nome = nome;
		this.velocidade = velocidade;
	}
	
	public void adicionaVolta(Volta volta) {
		this.voltas.add(volta);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public List<Volta> getVoltas() {
		return voltas;
	}

	public void setVoltas(List<Volta> voltas) {
		this.voltas = voltas;
	}
	
	public double getTempoVolta() {
		int tempo = 0;
		for(Volta volta: this.voltas) {
			tempo = volta.getTempoVolta();
		}
		
		return tempo;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s | Velocidade: %.2f | Voltas: %s", nome, velocidade, voltas);
	}
}