package collectionsImplPropria.matriz;

public class MatrizTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Guilherme");
		Aluno aluno2 = new Aluno("Roberto");
		Aluno aluno3 = new Aluno("Carlos");
		Matriz matrizAlunos = new Matriz();
		
		
		matrizAlunos.adicionaAluno(aluno1);
		matrizAlunos.adicionaAluno(aluno2);
		matrizAlunos.adicionaAluno(aluno3);

		
		
		System.out.println(matrizAlunos.toString());
		System.out.println(matrizAlunos.getTotalAlunos());
		System.out.println(matrizAlunos.getAlunoByLinhaColuna(0, 2));
		
		
		matrizAlunos.removeAluno(0, 1);
		System.out.println(matrizAlunos.toString());
	}
}