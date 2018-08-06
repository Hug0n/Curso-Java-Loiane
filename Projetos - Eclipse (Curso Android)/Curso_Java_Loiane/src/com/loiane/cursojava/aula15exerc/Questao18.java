package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
			
		int numero;
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira um número para verificar se é ímpar ou par!: ");
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("O número inserido é par!");
			
		}
		else if (numero % 2 != 0){
				
				System.out.println("O número inserido é ímpar!");
				
		}
		else {
			
			System.out.println("Erro. Tente novamente.");
			
		}
					
	}
}
