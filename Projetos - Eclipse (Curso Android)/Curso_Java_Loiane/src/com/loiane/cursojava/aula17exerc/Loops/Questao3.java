package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		boolean valida = false;
		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo;
		String estadoCivil;
		
		int resposta; 
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Insira um nome: ");
		nome = scan.nextLine();
		System.out.print("Insira uma idade: ");
		idade = scan.nextInt();
		System.out.print("Insira um salário: ");
		salario = scan.nextDouble();
		System.out.print("Insira um sexo: \n");
		sexo = scan.next();
		System.out.print("Insira um estado civil: ");
		estadoCivil = scan.next();
		
		do {
			
			valida = false;
			
			if (nome.length() < 3){
				
				System.out.println("Nome inválido! Digite um nome válido: ");
				nome = scan.next();
				valida = true;
			}
			
			if (idade < 0 || idade > 150){
				
				System.out.println("Idade inválida! Digite uma idade válido: ");
				idade = scan.nextInt();	
				valida = true;
			}
			
			if (salario < 0){
				
				System.out.println("Salário inválido! Digite um salário válido: ");
				salario = scan.nextDouble();
				valida = true;
			}
			
			if (sexo.trim().equals("f") || sexo.trim().equals("m") || sexo.trim().equals("F") || sexo.trim().equals("M")){
				
				
			}
			else{

				System.out.println("Sexo inválido! Digite um sexo válido (M ou F): ");
				sexo = scan.next();
				valida = true;
			}
			
			if (estadoCivil.trim().equals("s") || estadoCivil.trim().equals("c") || estadoCivil.trim().equals("v") || estadoCivil.trim().equals("d")){
				
				
			}
			else{
				
				System.out.println("Estado Civil inválido! Digite um estado civil válido (s, c, v ou d): ");
				estadoCivil = scan.next();
				valida = true;
			}
			
			
		}while (valida == true);
			
		System.out.println("Dados cadastrados com sucesso! Nome: " + nome + "\n"
				+ "Idade: " + idade + "\n"
				+ "Salário: " + salario + "\n"
				+ "Sexo: " + sexo + "\n"
				+ "estadoCivil: " + estadoCivil + "\n");
			
		
	}
}
