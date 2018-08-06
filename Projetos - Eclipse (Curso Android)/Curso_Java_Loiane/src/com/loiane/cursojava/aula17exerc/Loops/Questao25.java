package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		
		double valorProduct = 0;
		boolean pausa = false;
		int productCount = 0;
		double total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		
		
		do {
			productCount++;
			
			System.out.println("Produto "  + productCount + ": ");
			valorProduct = scan.nextDouble();
			
			if (valorProduct == 0){
				pausa = true;
			}
			else {
				
				total += valorProduct;
			}
						
		}while (pausa != true);
		
		System.out.println("\nTotal: " + total);
		
		System.out.println("Dinheiro: ");
		double moneyInsert = scan.nextDouble();
		
		double troco = (moneyInsert - total);
		
		/*if (troco < 0){
			troco *= -1;
		}*/
		
		System.out.println("Troco: " + troco);
		
		}	
	}
