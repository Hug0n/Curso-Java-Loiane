package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao8 {
	
	public static void main(String[] args) {
		
		int numero = 5;
		int numeroInserido = 0;
		int soma = 0;
		int media = 0;
		
		Scanner scan = new Scanner (System.in);
		
		
	 	for ( int count = 0; count < numero ; ){
		 
			count++;
			System.out.println("Insira um número: ");
			numeroInserido = scan.nextInt();
			soma += numeroInserido;
			
		}
	 	//media = soma / numero;
	 	
	 	System.out.println("A soma dos números é " + soma );
	 	System.out.println("A média dos números é " + (media = soma / numero) );
	}
}
