package com.loiane.cursojava.aula13exerc;


import java.util.Scanner;

public class Questao12 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		System.out.println("Calcule o seu peso ideal! \n Digite a sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
	
		System.out.println(" O seu peso ideal é " + pesoIdeal);


	}

}
