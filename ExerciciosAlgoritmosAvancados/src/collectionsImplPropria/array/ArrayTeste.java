package collectionsImplPropria.array;

public class ArrayTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Jose");
        Aluno aluno3 = new Aluno("Danilo");
        Array arrayAlunos = new Array();

        
        arrayAlunos.adicionaAluno(aluno1);
        arrayAlunos.adicionaAluno(aluno2);        
        arrayAlunos.adicionaEmQualquerLugar(1, aluno3);        
        
        
        System.out.println(arrayAlunos); 
        System.out.println(arrayAlunos.getTotalAlunos()); 
        System.out.println(arrayAlunos.contemAluno(aluno1));
        System.out.println(arrayAlunos.getAlunoByIndice(0));
        
        
        arrayAlunos.removeAluno(1);
        System.out.println(arrayAlunos); 
        
        
        for(int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno("Joao " + i);
            arrayAlunos.adicionaAluno(aluno);
        }
        
        System.out.println(arrayAlunos);
	}
}
