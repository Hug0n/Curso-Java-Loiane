package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		double taxaPaisA = 3;
		double taxaPaisB = 1.5;
		int anos = 0;
		
		
		
		Scanner scan = new Scanner (System.in);
		
		/*
		System.out.print("Insira um nome: ");
		nome = scan.nextLine();
		System.out.print("Insira uma idade: ");
		idade = scan.nextInt();
		*/
		
		for ( ; populacaoA < populacaoB ; anos++){
			
			populacaoA = (int) (populacaoA + ((populacaoA * taxaPaisA) /100));
			populacaoB = (int) (populacaoB + ((populacaoB * taxaPaisB) /100));
		}
		
		
		System.out.println("Levaram " + anos + " anos para a cidade A ultrapassar ou igualar a B\n"
				+ "População de A: " + populacaoA + "\n"
				+ "População de B " + populacaoB + "\n"
				);
		
		
	}
}
