package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		
		int quantItens = 50;
		double valorProduto = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor incial do pão: ");
		double numInserido = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for (int i = 1; i <= quantItens; i++){
			
			valorProduto =+ valorProduto + numInserido;
			
			System.out.printf(i + " - R$ %.2f %n" , valorProduto);
		}	
	}
}
