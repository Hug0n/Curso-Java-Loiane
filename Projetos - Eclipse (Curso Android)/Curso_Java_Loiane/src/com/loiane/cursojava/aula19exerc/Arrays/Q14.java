package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q14 {

	private static Scanner scan;


	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int resposta = 0;
		float soma = 0;
		//String nome = "";
		
		int casa [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			
			System.out.println((i + 1) + " -> " + casa[i]);
			soma += casa[i];
		}
		
		System.out.print("A média aritimética dos "  + casa.length + " números inseridos no vetor é " + soma / casa.length);
		
		
		/*for (double cas : casa){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
		}*/
	}
}
