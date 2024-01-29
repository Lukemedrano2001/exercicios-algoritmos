package collectionsImplPropria.array;

import java.util.Arrays;

public class Array {
	// Os elementos são armazenados de forma sequencial na memória, a inserção e remo��o no meio é mais difícil, pois você precisa mover os elementos adjacentes
	
	private Aluno[] alunos = new Aluno[5];
	private int totalAlunos = 0;
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaAluno(Aluno aluno) {
		this.garanteEspaco();
		
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }
	
	// Complexidade de Algoritmo -> O(n)
	public void adicionaEmQualquerLugar(int indice, Aluno aluno) {
		this.garanteEspaco();
		
		if(!indiceOcupado(indice)) {
            throw new IllegalArgumentException("�ndice invalido");
        }
		
		// Movendo os alunos para a direita
	    for(int i = this.totalAlunos - 1; i >= indice; i--) {
	        alunos[i + 1] = alunos[i];
	    }
	    
	    alunos[indice] = aluno;
	    this.totalAlunos++;
	}
	
	// Complexidade de Algoritmo -> O(n)
	public void removeAluno(int indice) {
	    for(int i = indice; i < this.totalAlunos; i++) {
	        this.alunos[i] = this.alunos[i + 1];
	    }
	    
	    this.totalAlunos--;
	}

	
    public Aluno getAlunoByIndice(int indice) {
    	if(!indiceOcupado(indice)) {
            throw new IllegalArgumentException("�ndice invalido");
        }
    	
        return this.alunos[indice];
    }
    
    
    public boolean indiceOcupado(int indice) {
        return indice >= 0 && indice < this.totalAlunos;
    }
    
    // Complexidade de Algoritmo -> O(n)
    public boolean contemAluno(Aluno aluno) {
    	for(int i = 0; i < this.totalAlunos; i++) {
    		if(aluno.equals(alunos[i])) {
    			return true;
    		}
    	}
    	
        return false;
    }

    
    public int getTotalAlunos() {
        return this.totalAlunos;
    }
    
    // Complexidade de Algoritmo -> O(n)
    public void garanteEspaco() {
        if(this.totalAlunos == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2];
            
            for(int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            
            this.alunos = novoArray;
        }
    }
    
    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}