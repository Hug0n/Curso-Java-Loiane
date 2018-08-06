package com.loiane.cursojava.aula13exerc;


import java.util.Scanner;

public class Questao14 {
	
	private static Scanner scan;
		
	public static void main(String[] args) {
		
	
		float resultado;
		float tamanho;
		float velocidade;
		int minutos = 60;
		
		scan = new Scanner (System.in);
		System.out.println("Calcule o tempo estimado para Donwload do seu arquivo!\nQual o tamanho do arquivo em MB?");
		tamanho = scan.nextFloat();
		System.out.println("Qual a velocidade da sua internet em Mpbs?");
		velocidade = scan.nextFloat();
		resultado = (tamanho / (velocidade * minutos)) * 100;
				
						
		System.out.println("O arquivo será em aproximadamente em " + resultado + " minutos!");

	}

}
