package com.loiane.cursojava.aula15exerc;


import java.util.Scanner;

public class Questao6{
	
	

	public static void main(String[] args) {
		
		int media;
				
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira três números!");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
				
		if (numero1 > numero2 && numero1 > numero3){
			
			System.out.print( "O número " + numero1 + " é maior que o número "  + numero2 + " e o número " + numero3 + " !" ); 

		}
		else if (numero2 > numero1 && numero2 > numero3){
			
			System.out.print( "O número " + numero2 + " é maior que o número "  + numero1 + " e o número " + numero3 + " !" ); 

		}
		else if (numero3 > numero2 && numero3 > numero1){
			
			System.out.print( "O número " + numero3 + " é maior que o número "  + numero1 + " e o número " + numero2 + " !"); 
		}
		
		else {
			
			System.out.println("Os 3 números são iguais! Insira números diferentes!");
		}
			
	
		

	}

}
