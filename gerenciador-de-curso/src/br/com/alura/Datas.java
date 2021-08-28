package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate copaMundo = LocalDate.of(2022, Month.DECEMBER, 5);
		System.out.println(copaMundo);
		
		Period periodo = Period.between(hoje, copaMundo);
		System.out.println(periodo.getDays());
		
		LocalDate proximaCopa =  copaMundo.plusYears(4);
		System.out.println(proximaCopa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(proximaCopa.format(formatador));
		
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorHoras));
		
		
	}

}
