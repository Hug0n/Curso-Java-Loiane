package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao9 {

		private static Scanner scan;
		
	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		System.out.println("Converta o valor em Fahrenheit para Celsius!\nDigite o valor em Fahrenheit: ");
		double valorF = scan.nextDouble();
		double valorC = (5 * (valorF - 32) / 9);
		
		System.out.println("O valor em Fahrenheit " + valorF + " em Celsius é " + valorC + "C°");

	}

}
