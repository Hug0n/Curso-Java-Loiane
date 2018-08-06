package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao8{
	
	

	public static void main(String[] args) {
		
		int media;
				
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira os três preços dos produtos!");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
				
		if (numero1 > numero2 && numero1 > numero3){
					
			if (numero2 > numero3){
				
				System.out.print( "O produto que custa R$" + numero3 + " tem o menor preço entre os 3 produtos e por isso é a melhor escolha!" ); 
				
			}
			else if (numero2 < numero3){
				
				System.out.print( "O produto que custa R$" + numero2 + " tem o menor preço entre os 3 produtos e por isso é a melhor escolha!" ); 
				
			}
			else {
				
				System.out.print( "O segundo e terceiro produto tem o mesmo valor (R$" + numero2 + ")  e são mais baratos que o primeiro produto" );
				
			}
		}
		else if (numero2 > numero1 && numero2 > numero3){
						
			if (numero1 > numero3){
					
				System.out.print( "O produto que custa R$" + numero3 + " tem o menor preço entre os 3 produtos e por isso é a melhor escolha!" ); 
					
			}
			else if (numero1 < numero3){
				
				System.out.print( "O produto que custa R$" + numero1 + " tem o menor preço entre os 3 produtos e por isso é a melhor escolha!" ); 
	
			}
			else { //caso numero 1 e 3 sejam iguais
				
				System.out.print( "O primeiro e o terceiro produto têm o mesmo valor (R$" + numero1 + ")  e são mais baratos que o segundo produto" );
				
			}
			
		}
		else if (numero3 > numero2 && numero3 > numero1){
						
			if (numero1 > numero2){
				
				System.out.print( "O produto que custa R$" + numero2 + " tem o menor preço entre os 3 produtos e por isso é a melhor escolha!" ); 
				
			}
			else if (numero1 < numero2){
				
				System.out.print( "O produto que custa R$" + numero1 + " tem o menor preço entre os 3 produtos e por isso é a melhor escolha!" ); 
				
			}
			else {
				
				System.out.print( "O primeiro e o segundo produto têm o mesmo valor (R$" + numero1 + ") e são mais baratos que o terceiro produto" );
				
			}
		}
		else {
			
			System.out.println("Os 3 valores são iguais! Insira valores diferentes!");
		}
			
	
		

	}

}
