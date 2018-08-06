package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q15 {

	private static Scanner scan;


	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		
		int resposta = 0;
		//String nome = "";
		float par = 0;
		float impar = 0;
		float percPar = 0;
		float percImp = 0;
		
		
		int casa [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			
			System.out.println((i + 1) + " -> " + casa[i]);
		}
		
			
		for (int i=0; i < casa.length; i++){
			
			if (casa[i] % 2 == 0){

				par++;
				System.out.println(par);

			}
			else if (casa[i] % 2 == 1){
				
				impar++;
				System.out.println(impar);
			}
		}
		
		percPar =  par / casa.length * 100;
		percImp = impar / casa.length * 100;
		
		System.out.println("O vetor possui " + casa.length + " espaços. A porcentagem dos números pares é de " + percPar + "% e a dos números ímpares é de " + percImp + "%");
		
		
		/*for (double cas : casa){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
		}*/
	}
}
