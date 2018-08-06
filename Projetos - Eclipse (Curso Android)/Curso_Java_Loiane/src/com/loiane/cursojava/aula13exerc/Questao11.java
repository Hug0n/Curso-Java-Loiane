package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao11 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
					
			scan = new Scanner (System.in);
			System.out.println("Insira dois números inteiros: ");
			int valorInt1 = scan.nextInt();
			int valorInt2 = scan.nextInt();
			System.out.println("Insira um número real: ");
			double valorReal = scan.nextFloat();
			
			int resultadoA = ( (valorInt1 * 2) * (valorInt2 / 2) );
			int resultadoB = (int) ((3 * valorInt1) + valorReal);
			int resultadoC = (int) ( Math.pow(valorReal, 3));
			
			
			System.out.println(" Resultados: \nO produto do dobro do primeiro com metade do segundo = " + resultadoA + "\nA soma do triplo do primeiro com o terceiro = " + resultadoB + "\nO terceiro elevado ao cubo: " + resultadoC);

		}

	

	}

