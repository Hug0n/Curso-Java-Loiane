package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		String letra;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite F ou M");
		letra = scan.nextLine();
				
		/*  if (  letra.equals("F") == "" ){
			
			System.out.println( letra + " de Feminino" );
		
		}else if ( "M" == letra ){
			
			System.out.println( letra + " de Masculino" );
			
		}else {
			
			System.out.println( "Digite F ou M!²" );
			
		}*/
		
		switch (letra) {
		case "f" : System.out.println( letra + " de Feminino" ); break;
		case "m" : System.out.println( letra + " de Masculino" ); break;
		default : System.out.println( "Digite F ou M!²" );
		}
	}
	
}