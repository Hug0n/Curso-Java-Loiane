package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao8 {

	//private static Scanner scan;
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Calcule o seu salário no mês atual! \n  Quanto você ganha por hora?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Qual o número de horas trabalhadas durante o mês?");
		double horasMes = scan.nextDouble();

		double totalSalario = (salarioHora * horasMes) * 30;
		
		System.out.println("O seu salário mensal é de R$" + totalSalario);
	}

}
