package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisatando Array", 21);
		Aula a2 = new Aula("Lista obj", 15);
		Aula a3 = new Aula("Relacionando Lista e obj", 20);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
