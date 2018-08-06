package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q5 {
	
	private static Scanner scan;

	// B[i] = A[i] * i  
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int casa [] = new int [15];
		int moveis [] = new int [15];
		
		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			moveis[i] = casa[i] * i ;
			
			System.out.println((i + 1) + " -> " + casa[i]);
			System.out.println((i + 1) + " -> " + moveis[i]);
		}
		
		for (double cas : moveis){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
			
		}
	}
}
