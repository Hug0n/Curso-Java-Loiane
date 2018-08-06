package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao7 {
	
	public static void main(String[] args) {
	
	int numInserido = 0;
	int numMaior = 0;
	int count = 5; // contador igual a 5 no loop FOR
	Scanner scan = new Scanner(System.in);

	for ( int i = 0; i < count; i++ ){
		
		System.out.println (" Insira um número: ");
		numInserido = scan.nextInt();

		if (numInserido > numMaior){
			
			numMaior = numInserido;
		}//fim do if
	}//fim do for

	System.out.println ("O maior inserido foi o número " + numMaior);

	}//fim do main





}
