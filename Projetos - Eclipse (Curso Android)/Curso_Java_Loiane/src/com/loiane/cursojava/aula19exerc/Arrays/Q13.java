package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q13 {

	private static Scanner scan;


	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int resposta = 0;
		//String nome = "";
		
		int casa [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			
			System.out.println((i + 1) + " -> " + casa[i]);
		}
		
		System.out.print("Os números divisíveis por 5 são: ");
		
		for (int i=0; i < casa.length; i++){
			
			if (casa[i] % 5 == 0){

				System.out.println((i + 1) + " -> " + casa[i]);
			}
		}
		
		/*for (double cas : casa){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
		}*/
	}
}
