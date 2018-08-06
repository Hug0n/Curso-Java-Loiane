package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao10{
		

	public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual turno você estuda? ");
		String turno = scan.nextLine ();
								
		if ( turno == "M" ){
		
			System.out.println("Bom dia!");
		
		}
		else if ( turno == "T" || turno == "Tarde" ){
			
			System.out.println("Bom tarde!");
		
		}
	
		else if ( turno == "N" || turno == "Noite" ){
		
			System.out.println("Bom noite!");
		
		}
		else {
			
			System.out.print("Valor inválido!");
			
		}
			
	
		

	}

}
