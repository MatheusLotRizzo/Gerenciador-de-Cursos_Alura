package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Collections", "Matheus Rizzo");
		javaColecoes.adiciona(new Aula("Revisatando Array", 21));
		javaColecoes.adiciona(new Aula("Objetos", 25));
		javaColecoes.adiciona(new Aula("Relações", 15));
		
		Aluno a1 = new Aluno("Zeze ferreira", 34111);
		Aluno a2 = new Aluno("Zeca silvares", 35147);
		Aluno a3 = new Aluno("Gustavo Mendes", 56888);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		System.out.println("Alunos matriculados:\n");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno+"\n");
		});
		
		System.out.println("O aluno "+a1+" está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno zeze = new Aluno("Zeze ferreira", 34111);
		System.out.println(a1.equals(zeze));
		
	}
}
