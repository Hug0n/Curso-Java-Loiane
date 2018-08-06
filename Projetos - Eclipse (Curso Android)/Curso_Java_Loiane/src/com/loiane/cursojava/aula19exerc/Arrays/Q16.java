package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q16 {

	private static Scanner scan;


	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int resposta = 0;
		float somaMenorQuinze = 0;
		float somaMaiorQuinze = 0;
		float mediaMaiorQuinze = 0;
		int iguaisQuinze = 0;
		//String nome = "";
		
		int casa [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			
			System.out.println((i + 1) + " -> " + casa[i]);
			
			if(casa[i] < 15){
				
				somaMenorQuinze += casa[i];
			}
			else if (casa[i] == 15)	{
				
				iguaisQuinze++;
			}
			else if (casa[i] > 15){
				
				somaMaiorQuinze += casa[i];
			}
		}	
	
		mediaMaiorQuinze = somaMaiorQuinze / casa.length;
		 	
		
		System.out.print("A soma dos elementos do vetor menores que 15 é " + somaMenorQuinze + ". "
				+ "A quantida de elementos armazenados no vetor que são iguais a 15 é " + iguaisQuinze
				+ ". A MÉDIA dos elementos armazenados no vetor que são superiores a 15 é " + mediaMaiorQuinze );
		
		
		//if
		
		/*for (double cas : casa){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
		}*/
	}
}
