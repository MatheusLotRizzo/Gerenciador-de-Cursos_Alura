package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Arrumando a bugadeira";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		System.out.println(aulas);
		
		System.out.println("-----------------//------------");
		System.out.println();
		
		aulas.remove(0);
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		System.out.println("-----------------//------------");
		System.out.println();
		
		for(int i=0; i < aulas.size(); i++) {
			System.out.println((i+1) + "º Aula: " + aulas.get(i));
		}
		
		System.out.println("-----------------//------------");
		System.out.println();
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("-----------------//------------");
		System.out.println();
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});
		
		System.out.println("-----------------//------------");
		System.out.println();
		
		Collections.sort(aulas);
		aulas.forEach(aula -> {
			System.out.println("Alfabetico: " + aula);
		});
	}
}
