package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao6 {
	
	public static void main(String[] args) {
		
		int numero = 20;
		
		Scanner scan = new Scanner (System.in);
		
		
	 	for ( int count = 0; count < numero ; ){
		 
			
			count++;
			System.out.println(count);
		}
		
		for ( int count = 0; count < numero ; ){
			
			count++;
			System.out.print(count + " ");
		}
		
	}
}
