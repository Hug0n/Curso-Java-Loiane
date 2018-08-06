package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q1 {
   
	// A[] == B[]
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double casa [] = new double [5];
		double moveis [] = new double [5];
		
		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextDouble();
			moveis[i] = casa[i];
			
			System.out.println((i + 1) + " -> " + casa[i]);
			System.out.println((i + 1) + " -> " + moveis[i]);
		}
		
		for (double cas : casa){
			
			int i = 0;
			i++;
			System.out.println(i + " -> " + cas);
			
		}
	}

}
