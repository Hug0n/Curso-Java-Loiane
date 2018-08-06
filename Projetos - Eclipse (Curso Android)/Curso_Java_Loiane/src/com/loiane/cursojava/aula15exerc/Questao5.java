package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao5 {
	
	

	public static void main(String[] args) {
		
		int media;
				
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira suas duas notas!");
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		media = (nota1 + nota2) / 2;
		
		
		
		if (media >= 7 && media < 10){
			
			System.out.print("Sua média é " + media + ". Você foi "); 
			System.out.print("Aprovado!");
		}
		else if (media < 7){
			
			System.out.print("Sua média é " + media + ". Você foi "); 
			System.out.print("Reprovado!");
		}
		else if (media == 10){
			
			System.out.print("Sua média é " + media + ". Você foi "); 
			System.out.println("Aprovado por distinção!");
		}
		else {
			
			System.out.println("Digite números de 10 à 0!");
		}
			
	
		

	}

}
