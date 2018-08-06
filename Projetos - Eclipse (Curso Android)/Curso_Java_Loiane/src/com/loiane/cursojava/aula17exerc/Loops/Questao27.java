package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {

		int tempInserida = 0;
		int menorTemp = 1000000;
		int maiorTemp = 0;
		int quantidade = 0;
		float total = 0;
		float mediaTotal = 0;
		boolean entrada = true;
		int resposta = 0;
		
		Scanner scan = new Scanner (System.in);
		
		while (entrada == true){
			quantidade++;
		
			System.out.println("Insira a Temperatura: ");
			tempInserida = scan.nextInt();
			
			if (tempInserida > maiorTemp){
				
				maiorTemp = tempInserida;
			}
			if (tempInserida < menorTemp){
				
				menorTemp = tempInserida;
			}
			
			total += tempInserida;

			System.out.println("Deseja inserir mais algum valor? 1 - Sim / 2 - Não");
			resposta = scan.nextInt();
			
			if (resposta == 2){
				
				entrada = false;
			}
		}
		
		mediaTotal = total / quantidade;
		
		System.out.println("O total para as " + quantidade + " de temperatuas inseridas é de " + total + ". A média total é de " + mediaTotal + ". A maior temperatura inserida foi " + maiorTemp + " e a menor foi " + menorTemp );

	}

}
