package collectionsImplPropria.matriz;

import java.util.Objects;

public class Aluno {
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null || getClass() != objeto.getClass())
			return false;
		Aluno aluno = (Aluno) objeto;
		return Objects.equals(nome, aluno.nome);
	}
	
	@Override
	public String toString() {
	    return this.nome;
	 }
}