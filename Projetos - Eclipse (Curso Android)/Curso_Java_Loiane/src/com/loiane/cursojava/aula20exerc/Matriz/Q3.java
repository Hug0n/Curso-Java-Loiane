package com.loiane.cursojava.aula20exerc.Matriz;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		int [][] Matriz = new int [3][3];
		
		Scanner e = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				System.out.println("\n Insira o valor na Linha " + (i + 1) + " e Coluna " + (j + 1) + ": ");
				Matriz[i][j] = e.nextInt();
				
				if (Matriz[i][j] % 2 == 0) {
					par++;
				}else{impar++;}
					
			}
		}
		
		for (int i = 0; i < Matriz.length; i++) {
			System.out.println(" Valores: \n");
			for (int j = 0; j < Matriz[i].length; j++) {
				System.out.println("\n Linha " + (i + 1) + " e Coluna " + (j + 1) + " - > " + Matriz[i][j]);
			}
			System.out.println(" \n");
		}
		
		System.out.println("\n Há " + par + " número(s) par(es) na Matriz e " + impar + " ímpar(es).");
	}
}
