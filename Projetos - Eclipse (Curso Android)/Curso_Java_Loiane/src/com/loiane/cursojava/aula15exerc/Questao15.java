package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		int lado1;
		int lado2;
		int lado3;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o primeiro lado do triângulo: ");
		lado1 = scan.nextInt();
		System.out.print("Digite o segundo lado do triângulo: ");
		lado2 = scan.nextInt();
		System.out.print("Digite o terceiro lado do triângulo: ");
		lado3 = scan.nextInt();
		
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1){
			
			System.out.println ("Agora vamos verificar qual o tipo do triângulo...");
			
			if (lado1 == lado2 && lado1 == lado3){
				
				System.out.println ("Você inseriu um triângulo Equilátero!!! Seu triângulo possui os 3 lados iguais.");
				
			}
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
				
				System.out.println ("Você inseriu um triângulo Isósceles!!! Seu triângulo possui 2 lados iguais.");
				
			}
			else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				
				System.out.println ("Você inseriu um triângulo Escaleno!!! Seu triângulo possui os 3 lados diferentes.");
				
			}
		}		
		else {
			
			System.out.println("Você não inseriu um triângulo! O triângulo existe quando  a  soma  de  quaisquer dois lados for maior que o terceiro.");
			
		}
		
		
		}
	}

