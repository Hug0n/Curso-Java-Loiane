package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		int  numero1;
		int  numero2;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com dois valores:");
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		
		if (numero1 > numero2){
			
			System.out.println( numero1 + " é maior que " + numero2);
		
		}else if (numero1 < numero2 ){
			
			System.out.println( numero2 + " é maior que " + numero1);
			
		}else {
			
			System.out.println( numero2 + " é igual a " + numero1);
			
		}
		
	
		 
		
		

	}

}
