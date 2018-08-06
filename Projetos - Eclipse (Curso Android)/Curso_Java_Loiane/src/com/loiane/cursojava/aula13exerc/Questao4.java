package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao4 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite as notas a seguir: \n Primeiro bimestre:" );
		int nota1 = scan.nextInt();
		System.out.println("Segundo bimestre: " );
		int nota2 = scan.nextInt();
		System.out.println("Terceiro bimestre:" );
		int nota3 = scan.nextInt();
		System.out.println("Quarto bimestre:" );
		int nota4 = scan.nextInt();
		
		int resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média é: " + resultado);
		

	}

}
