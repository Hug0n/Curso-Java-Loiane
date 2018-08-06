	package com.loiane.cursojava.aula15exerc;

	import java.util.Scanner;

	public class Questao20 {

		public static void main(String[] args) {
				
			int resposta;
			int resultado = 0;

			Scanner scan = new Scanner(System.in);

			System.out.println ("*--|-|--*   Você é Culpado? Descubra com essas 5 perguntas!   *--|-|--*");

			System.out.println ("Você telefonou para a vítima? \n 1 - Sim    2 - Não");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Você esteve no local do crime? \n 1 - Sim    2 - Não");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Você mora perto da vítima? \n 1 - Sim    2 - Não");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Você devia para a vítima? \n 1 - Sim    2 - Não");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Você já trabalhou com a vítima? \n 1 - Sim    2 - Não");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			// Verificação final - Levantamento dos pontos ------------------------------

			if (resultado == 2) {

				System.out.println ("Você é um suspeito do crime!");

			}
			else if (resultado == 3 ||resultado == 4){
				
				System.out.println ("Você foi considerado um cúmplice do crime!");

			}
			else if (resultado == 5){
				
				System.out.println ("Pelas suas respostas você foi considerado culpado! :o Por favor, permaneça onde está; a polícia chegará em 5 minutos.");

			}

			else if (resultado < 2){
				
				System.out.println ("Você foi considerado inocente! (Por enquanto :})");

			}
			else {
				
				System.out.println ("Erro desconhecido. Você escapou desta vez...Efetue o teste novamente.");

			}
		}
	}
	

	


