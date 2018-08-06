package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao6 {

	private static Scanner scan;
	private static Double raioCirculo;
	private static Double areaCirculo;
	
	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		System.out.print("Calcule a área do círculo! \n Digite o raio do círculo:");
		raioCirculo = scan.nextDouble();
		
		areaCirculo = (raioCirculo * raioCirculo) * 3.14;
		System.out.println("A área do circulo que possui um raio " + raioCirculo + " será de " + areaCirculo);
		
		
		

	}

}
