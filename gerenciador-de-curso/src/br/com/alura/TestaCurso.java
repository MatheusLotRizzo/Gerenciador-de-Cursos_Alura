package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Collections", "Matheus Rizzo");
		
		//List<Aula> aulas = javaColecoes.getAulas();
		//aulas.add(new Aula("Revisatando Array", 21));
		
		//javaColecoes.getAulas().add(new Aula("Revisatando Array", 21));
		javaColecoes.adiciona(new Aula("Revisatando Array", 21));
		javaColecoes.adiciona(new Aula("Objetos", 25));
		javaColecoes.adiciona(new Aula("Relações", 15));
		System.out.println(javaColecoes.getAulas());
		
		//jogar em uma lista para poder ordenar, pois na classe está imutavel
		List<Aula> aulas = new ArrayList<>(javaColecoes.getAulas());
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}

}
