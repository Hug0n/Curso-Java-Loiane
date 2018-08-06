package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
			
		int ano;
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o ano: ");
		ano = scan.nextInt();
		
		if (ano % 400 == 0) {
			
			System.out.println("O ano inserido é bissexto!");
			
		}
		else if (ano % 4 == 0 && ano % 100 != 0){
				
				System.out.println("O ano inserido é bissexto!");
				
		}
		else {
			
			System.out.println("O ano inserido não é bissexto!");
			
		}
					
	}
}
