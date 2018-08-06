package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {

		int resultado = 0;
		int numeroInserido = 0;
		int valorInicial = 0;
		int valorFinal = 0;
		boolean repetir = true;
		
		Scanner scan = new Scanner (System.in);
		
		while (repetir == true){
			
			System.out.print("Insira o número a ser multiplicado: ");
			numeroInserido = scan.nextInt();
			
			System.out.print("Insira o número incial da tabuada: ");
			valorInicial = scan.nextInt();
			
			System.out.print("Insira o número final da tabuada: ");
			valorFinal = scan.nextInt();;
			
			if (valorInicial > valorFinal) {
				
				System.out.print("O valor inicial nâo pode ser maior que o final! Digite os valores novamente.\n");
				repetir = true;
			} 
			else{
				
				repetir = false;	
			}
		}
		
		for (int i = valorInicial; i <= valorFinal ; i++){
			
			resultado = numeroInserido * i;
			System.out.println(numeroInserido + " x " + i + " = " + resultado);
			
		}
	}

}
