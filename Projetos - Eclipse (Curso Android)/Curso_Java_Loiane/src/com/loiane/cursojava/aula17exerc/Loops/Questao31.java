package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

	public class Questao31 {

		public static void main(String[] args) {

		double salarioInicial = 0;
		double salarioAtual = 0;
		int anoCount = 1995;
		int anoAtual = 0;
		
		double porcentagem = 1.5;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira seu salário incial: ");
		salarioInicial = scan.nextDouble() ;

		System.out.println("Insira o ano atual: ");
		anoAtual = scan.nextInt() ;
		
		salarioAtual = salarioInicial;
			
		for (int i = anoCount; i <= anoAtual ; i++){
			
			if (i < 1996){
				
				System.out.println("Seu salário em " + i + " é de " + salarioAtual);
			}
			
			else if (i == 1996){
				
				salarioAtual = salarioAtual + (salarioAtual * (porcentagem / 100));
				System.out.printf("Seu salário em " + i + " é de %.2f %n" , salarioAtual);
			}
			
			else {
		
				porcentagem = porcentagem * 2;
				salarioAtual = salarioAtual + (salarioAtual * (porcentagem / 100));
				System.out.printf("Seu salário em " + i + " é de %2.2f %n" , salarioAtual);
			}
		}
		System.out.printf("Seu salário atual é %.2f %n" ,salarioAtual);
	}

	}

