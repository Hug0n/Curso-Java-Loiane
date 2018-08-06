package com.loiane.cursojava.aula13exerc;
import java.util.Scanner;

public class Questao10 {
	
	private static Scanner scan;


	public static void main(String[] args) {

				
				scan = new Scanner (System.in);
				System.out.println("Converta o valor em Celsius para Fahrenheit!\nDigite o valor em Celsius: ");
				double valorC= scan.nextDouble();
				double valorF = (1.8 * valorC) + 32;
				
				System.out.println("O valor em Celsius " + valorC + " em Fahrenheit é " + valorF + "F°");

	}

}
