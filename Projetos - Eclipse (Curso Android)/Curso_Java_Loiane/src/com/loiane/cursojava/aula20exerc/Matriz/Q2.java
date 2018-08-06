package com.loiane.cursojava.aula20exerc.Matriz;

import java.util.Random;

public class Q2 {

	public static void main(String[] args) {

		int[][] Matriz  = new int [10][10];
		
		int min = 0;
		int max = 9;
		Random ran = new Random();
		
		int minLinha = 9;
		int maxLinha = 0;

		int minColuna = 9;
		int maxColuna = 0;
		
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				
				Matriz[i][j] = ran.nextInt(max - min + 1) + min;
			}
		}
		
		for (int i = 0; i < Matriz.length; i++) {
			System.out.println(" Valores: \n");
			for (int j = 0; j < Matriz[i].length; j++) {
				System.out.println("\n Linha " + (i + 1) + " e Coluna " + (j + 1) + " - > " + Matriz[i][j]);
				
				if (i == 4) {
					if (Matriz[i][j] >= maxLinha ) {
						maxLinha = Matriz[i][j];
					}else if (Matriz[i][j] <= minLinha ) {
						minLinha = Matriz[i][j];
					}
				else if (j == 6)
					if (Matriz[i][j] >= maxColuna ) {
						maxColuna = Matriz[i][j];
					}else if (Matriz[i][j] <= minColuna ) {
						minColuna = Matriz[i][j];
					}
				}
			}
			System.out.println(" \n");
		}
		System.out.println("\n O maior valor da Linha 5 é " + (maxLinha) + " e o menor valor é " + minLinha + "."
				+ " O maior valor da Coluna 7 é " + maxColuna + " e o menor valor é " + minColuna );

		
	}

}
