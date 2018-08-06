package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao2 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		String scanner = scan.nextLine();
		
		System.out.println("Você digitou " + scanner);
	}

}
