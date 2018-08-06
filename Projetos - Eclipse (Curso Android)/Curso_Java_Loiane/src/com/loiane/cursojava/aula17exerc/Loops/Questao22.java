package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		
		int quantCDs = 0;
		double resultadoInd = 0;
		double valorCD = 0;
		String nomeCD = "";
		double total = 0;
		double mediaTotal = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println ("Quantos CD's você possui? ");
		quantCDs = scan.nextInt();

		for (int i = 1; i <= quantCDs; i++){
			
			System.out.println("Insira o nome do " + i + "° CD: ");
			nomeCD = scan.next();
			
			System.out.println("Insira o valor desse CD: ");
			valorCD = scan.nextDouble();
			
			total += valorCD;
			resultadoInd = valorCD / quantCDs;
			
			System.out.println("A média do valor do CD " + nomeCD + " é de R$" + resultadoInd + "\n");
		}
		
		mediaTotal = total / quantCDs ; 
		System.out.println("O total gasto nos " + quantCDs + " inseridos foi de R$" + total + " e a média total foi de R$" + mediaTotal);

		

	}
}
