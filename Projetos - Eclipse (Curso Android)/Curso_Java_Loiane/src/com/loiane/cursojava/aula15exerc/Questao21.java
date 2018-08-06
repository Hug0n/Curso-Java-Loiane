	package com.loiane.cursojava.aula15exerc;

	import java.util.Scanner;

	public class Questao21 {

		public static void main(String[] args) {
				
			String tipo = "";
			int escolhaTipo = 0;
			int  quantidade= 0;
			float desconto = 0f;
			float valorComDesconto = 0f;
			float valor = 0f;
			float precoGasolina = 2.50f;
			float precoAlcool = 1.90f;

			
			Scanner scan = new Scanner(System.in);

			System.out.println ("*--|-|--*   Qual combustível você deseja utilizar?   *--|-|--*\n 1 - Gasolina \n 2 - Álcool");
			escolhaTipo = scan.nextInt();
			
			System.out.println ("*--|-|--*   Qual a quantidade desejada?  (Em litros)   *--|-|--*");
			quantidade = scan.nextInt();
			

			if (escolhaTipo == 1){
				
				tipo = "gasolina";
				valor = precoGasolina * quantidade;
				
				if (quantidade <= 20){
					
					desconto = 4;
					valorComDesconto = valor - ((valor * desconto) / 100) ;
				
				}
				else if (quantidade > 20){
					
					desconto = 6;
					valorComDesconto = valor - ((valor * desconto) / 100) ;
					
				}
				else{
					
					System.out.println("Erro. Tente novamente.");
					System.exit(0);
				
				}
			}
			else if (escolhaTipo == 2){
				
				tipo = "álcool";
				valor = precoAlcool * quantidade;
				
				if (quantidade <= 20){
					
					desconto = 3;
					valorComDesconto = valor - ((valor * desconto) / 100) ;
				
				}
				else if (quantidade > 20){
					
					desconto = 5;
					valorComDesconto = valor - ((valor * desconto) / 100) ;
					
				}
				else{
					
					System.out.println("Erro. Tente novamente.");
					
				}
				
			}else {
				
				System.out.println("o tipo do combustível inserido é inválido. Por favor, digite \"1\" para gasolina ou \"2\" para Álcool.");
				System.exit(0);			
			}
			
			if (quantidade <= 0){
				
				System.out.println("A quantidade de litros de " + tipo + " deve ser maior que 0! Tente novamente.");
				System.exit(0);
				
			}else {
				
				System.out.println("O valor total a ser pago por " + quantidade + " litros de " + tipo + " com o desconto de " + desconto + "% será R$" + valorComDesconto);
				
			}
		}
	}