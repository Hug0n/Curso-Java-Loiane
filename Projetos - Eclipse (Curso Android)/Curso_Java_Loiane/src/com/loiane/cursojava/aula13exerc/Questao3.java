package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao3 {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Insira dois valores para a soma:");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("Os números digitados foram " + numero1 + " e " + numero2 + ". " + "O resultado da soma é " + resultado);
		
		
		

	}

}
