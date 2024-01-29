package collectionsApiPadrao.array;

import java.util.ArrayList;

public class ArrayLista {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Jose");
        Aluno aluno3 = new Aluno("Danilo");
        Aluno aluno4 = new Aluno("Guilherme");
        Aluno aluno5 = new Aluno("Carlos");
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		// Inserção
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);
		
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		// Busca
		System.out.println(alunos.get(1));
		System.out.println(alunos.getFirst());
		System.out.println(alunos.getLast());
		System.out.println(alunos.contains(aluno3));
		System.out.println(alunos.indexOf(aluno5));
		
		// Remo��o
		alunos.remove(0);
		alunos.remove(aluno5);
		
		
		System.out.println(alunos);
	}
}