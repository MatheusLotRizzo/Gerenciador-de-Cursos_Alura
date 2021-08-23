package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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
		
		System.out.println("Quem é o aluno com a matricula 56888?");
		Aluno aluno = javaColecoes.buscaMatriculado(56888);
		
		System.out.println(aluno);
	}
}
