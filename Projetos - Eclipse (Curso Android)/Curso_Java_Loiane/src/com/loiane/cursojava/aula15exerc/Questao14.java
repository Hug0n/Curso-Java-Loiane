package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		int nota1;
		int nota2;
		int media;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = scan.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextInt();
		media = (nota1 + nota2) / 2;
				
		System.out.println ("Sua media foi " + media);
		
		if (media >= 9 && media <=10){
			
			System.out.println ("Você tirou A!");
			
		}
		else if (media >= 7.5 && media < 9) {
			
			System.out.print("Você tirou B!");
			
		}
		else if (media >= 6 && media < 7.5) {
			
			System.out.print("Você tirou C!");
			
		}
		else if (media >= 4 && media < 6) {
			
			System.out.print("Você tirou D!");
			
		}
		else if (media >= 0 && media <= 4) {
			
			System.out.print("Você tirou E!");
			
		}
		
		
		
		}
	}

