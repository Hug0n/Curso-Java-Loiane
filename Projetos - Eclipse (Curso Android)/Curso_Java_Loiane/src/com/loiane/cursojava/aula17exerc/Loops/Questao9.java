package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao9 {
	
	public static void main(String[] args) {
		
		int numero = 50;
		int numeroInserido = 0;
		int soma = 0;
		int media = 0;
		
		Scanner scan = new Scanner (System.in);
		
		
	 	for ( int count = 0; count < numero ; ){
		 
			count++;
			if ((count % 2) != 0){
				
				System.out.println(count);
			}
	 	}	
	}
}
