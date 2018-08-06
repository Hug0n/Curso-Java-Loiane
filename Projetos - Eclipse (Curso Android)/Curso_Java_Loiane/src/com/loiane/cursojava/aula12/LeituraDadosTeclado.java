package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
	
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade!");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura!");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);
		*/
		
		System.out.println("Digite o seu primeiro nome, idade, quanto de altura, quantidade de filhos e se possui bicho de estimação: ");
		String nome = scan.nextLine();
		int idade2 = scan.nextInt();
		float altura2 = scan.nextFloat();
		byte filhos = scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Os valores digitado foram: " + nome);
		System.out.println("Os valores digitado foram: " + idade2);
		System.out.println("Os valores digitado foram: " + altura2);
		System.out.println("Os valores digitado foram: " + filhos);
		System.out.println("Os valores digitado foram: " + temPet);
		
	}

}
