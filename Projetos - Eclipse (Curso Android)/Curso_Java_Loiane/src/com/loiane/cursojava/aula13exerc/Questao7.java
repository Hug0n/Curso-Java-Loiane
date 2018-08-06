package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao7 {
	
	private static Scanner scan;
	private static Double ladoQuadrado;
	private static Double areaQuadrado;
	private static Double dobroArea;

	public static void main(String[] args) {
			
		scan = new Scanner(System.in);
		
		System.out.println("Calcule a área do Quadrado! \n \nDigite o valor do lado do quadrado: ");
		ladoQuadrado = scan.nextDouble();
		areaQuadrado = ladoQuadrado * ladoQuadrado;
		dobroArea = areaQuadrado * 2;
		
		System.out.println("A área do quadrado que possui o valor " + ladoQuadrado + " em seus lados é " + areaQuadrado + ". O dobro da área é " + dobroArea );

		}

}
