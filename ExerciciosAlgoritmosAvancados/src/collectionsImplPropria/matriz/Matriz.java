package collectionsImplPropria.matriz;

import java.util.Arrays;

public class Matriz {
	// Os elementos são armazenados de forma sequencial na memória, a inserção e remo��o no meio é mais difícil, pois você precisa mover os elementos adjacentes
	
	private Aluno[][] alunos = new Aluno[3][3];
	private int totalAlunos = 0;
	
	// Complexidade de Algoritmo -> O(1)
	public void adicionaAluno(Aluno aluno) {	
		int linha = this.totalAlunos / alunos.length;
		int coluna = this.totalAlunos % alunos[0].length;
		
		this.alunos[linha][coluna] = aluno;
        this.totalAlunos++;
    }
	
	// Complexidade de Algoritmo -> O(n^2)
	public void removeAluno(int linha, int coluna) {
		for(int i = linha; i < this.totalAlunos; i++) {
    		for(int j = coluna; j < alunos[0].length - 1; j++) {
    			alunos[i][j] = alunos[i][j + 1];
    		}
    	}
		
		// Limpando a última posi��o na �ltima coluna
		alunos[linha][alunos[0].length - 1] = null;
		this.totalAlunos--;
	}

	// Complexidade de Algoritmo -> O(1)
    public Aluno getAlunoByLinhaColuna(int linha, int coluna) {
    	if(!linhaColunaOcupada(linha, coluna)) {
            throw new IllegalArgumentException("Linha e Coluna inv�lidas");
        }
    	
        return this.alunos[linha][coluna];
    }
    
    
    public boolean linhaColunaOcupada(int linha, int coluna) {
    	boolean linhaColuna = linha >= 0 && coluna >= 0;
    	boolean qualquer = linha < this.totalAlunos && coluna < this.totalAlunos;
    	
        return linhaColuna && qualquer;
    }
    
    // Complexidade de Algoritmo -> O(n^2)
    public boolean contemAluno(Aluno aluno) {
    	for(int i = 0; i < this.totalAlunos; i++) {
    		for(int j = 0; j < this.totalAlunos; j++) {
    			if(aluno.equals(alunos[i][j])) {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }

    
    public int getTotalAlunos() {
        return this.totalAlunos;
    }
    
    
    @Override
    public String toString() {
    	StringBuilder resultado = new StringBuilder();
    	
    	for(Aluno[] array: this.alunos) {
    		resultado.append(Arrays.toString(array)).append("\n");
    	}
    	
    	return resultado.toString();
    }
}