package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		int diaDaSemana;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o número equivalente ao dia de semana de hoje: ");
		diaDaSemana = scan.nextInt();
				
		switch (diaDaSemana) {
		
		case 1 : System.out.println (" Hoje é Segunda-Feira ! "); break;
		case 2 : System.out.println (" Hoje é Terça-Feira ! "); break;
		case 3 : System.out.println (" Hoje é Quarta-Feira ! "); break;
		case 4 : System.out.println (" Hoje é Quinta-Feira ! "); break;
		case 5 : System.out.println (" Hoje é Sexta-Feira ! "); break;
		case 6 : System.out.println (" Hoje é Sabádo ! "); break;
		case 7 : System.out.println (" Hoje é Domingo ! "); break;
		default : System.out.println("Digite um número entre 1 e 7 !");
		
		
		}
	}
}
