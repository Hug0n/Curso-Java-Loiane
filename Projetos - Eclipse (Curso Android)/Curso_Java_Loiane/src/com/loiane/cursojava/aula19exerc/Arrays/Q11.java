package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q11 {

	private static Scanner scan;


	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		
		int resposta = 0;
		String nome = "";
		
		int casa [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			
			System.out.println((i + 1) + " -> " + casa[i]);
		}
		
		System.out.println(" Você deseja ver os números armazenados no vetor que são pares ou ímpar?? 1 - Par /  2 - Ímpar");
		resposta = scan.nextInt();
				
		switch (resposta){
		
		case 1 :
			nome = "pares";
			break;
		case 2 :
			nome = "ímpares";
			break;
		}
			System.out.println("O vetor possui " + casa.length + " espaços. Os números " + nome + " são: ");
			
			if (resposta == 1){
				for (int i=0; i < casa.length; i++){
					
					if (casa[i] % 2 == 0){
	
						System.out.println((i + 1) + " -> " + casa[i]);
					}
				}
			}
			else if (resposta == 2){
				
				for (int i=0; i < casa.length; i++){
					
					if (casa[i] % 2 == 1){
	
						System.out.println((i + 1) + " -> " + casa[i]);
					}
				}
			}
		
		/*for (double cas : casa){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
		}*/
	}
}
