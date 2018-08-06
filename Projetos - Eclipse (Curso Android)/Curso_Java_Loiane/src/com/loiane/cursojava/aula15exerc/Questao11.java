package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		float resultado = 0;
		int percentualAumento = 0;
		float novoSalario;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o valor do seu salário: ");
		float salario = scan.nextFloat() ;
		
		if (salario <= 280){
			
			percentualAumento = 20;
			resultado = (salario * percentualAumento) / 100;
			
		}
		else if (salario > 280 && salario <= 700){
			
			percentualAumento = 15;
			resultado = (salario * percentualAumento) / 100;
			
		}
		else if (salario > 700 && salario <= 1500){
			
			percentualAumento = 10;
			resultado = (salario * percentualAumento) / 100;
			
		}
		else if (salario > 1500 ){
			
			percentualAumento = 05;
			resultado = (salario * percentualAumento) / 100;
			
		}
		
		novoSalario = salario + resultado;
		
		
		System.out.println ("O seu salário é R$" + salario);
		System.out.println ("O percentual de aumento aplicado foi de " + percentualAumento + "%");
		System.out.println ("O valor do aumento é de R$" + resultado);
		System.out.println ("O seu salário, após o aumento, ficará R$" + novoSalario);
		
		
		
	}

}
