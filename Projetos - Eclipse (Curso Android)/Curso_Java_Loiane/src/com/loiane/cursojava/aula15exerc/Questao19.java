package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
			
		float numero1;
		float numero2;
		String nomeOperacao = "";
		String posOrNeg = "positivo";
		float resultado = 0;
		int operacao;
		int resulParOrImpar = 0;
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira dois números: ");
		numero1 = scan.nextFloat();
		numero2 = scan.nextFloat();
		
		System.out.println("Escolha uma operação: \n" 
				+ " 1 - Multiplicação \n"
				+ " 2 - Subtração \n"
				+ " 3 - Soma \n"
				+ " 4 - Divisão \n");
		
		operacao = scan.nextInt();
		
				
		if (operacao == 1){
			
			nomeOperacao = "Multiplicação";
			resultado = numero1 * numero2;
			
		}
		else if (operacao == 2){
			
			nomeOperacao = "Subtração";
			resultado = numero1 - numero2;
			
		}else if (operacao == 3){
			
			nomeOperacao = "Soma";
			resultado = numero1 + numero2;
			
		}if (operacao == 4){
			
			nomeOperacao = "Divisão";
			resultado = numero1 / numero2;
			
		}
		
		if (resultado % 2 == 0) {
			
			resulParOrImpar = 0;
			
		}
		else if (resultado % 2 != 0){
				
			resulParOrImpar = 1;
				
		}
		
		else {
			
			resulParOrImpar = 3;
			
		}
		
		if (resultado < 0){
			
			posOrNeg = "negativo";
			
		}
		
		switch (resulParOrImpar){
			case 0 : System.out.println("O resultado da " + nomeOperacao + " do número " + numero1 + " e do número " + numero2 + " é " + resultado + ". Este resultado é par e " + posOrNeg + "!"); break;  
			case 1 : System.out.println("O resultado da " + nomeOperacao + " do número " + numero1 + " e do número " + numero2 + " é " + resultado + ". Este resultado é ímpar e " + posOrNeg + "!"); break;
			
			default : System.out.println("Erro. Tente novamente.");
			
		}
		
			
		}
}
