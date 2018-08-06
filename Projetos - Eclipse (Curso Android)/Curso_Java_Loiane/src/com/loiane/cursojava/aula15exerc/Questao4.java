package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
		
		String letra;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma letra!");
		letra = scan.nextLine();
				
		/*  if (  letra.equals("F") == "" ){
			
			System.out.println( letra + " de Feminino" );
		
		}else if ( "M" == letra ){
			
			System.out.println( letra + " de Masculino" );
			
		}else {
			
			System.out.println( "Digite F ou M!²" );
			
		}*/
		
		switch (letra) {
		case "b" : 
		case "c" : 
		case "d" : 
		case "f" : 
		case "g" : 
		case "h" : 
		case "j" : 
		case "k" : 
		case "l" : 
		case "m" : 
		case "n" : 
		case "p" : 
		case "q" : 
		case "r" : 
		case "s" : 
		case "t" : 
		case "w" : 
		case "y" : 
		case "z" : System.out.println( letra + " é uma consoante!" ); break;
		case "a" : 
		case "e" : 
		case "i" : 
		case "o" : 
		case "u" : System.out.println( letra + " é uma vogal" ); break;
		default : System.out.println( "Insira uma letra!!!" );
		}
	}
	
}