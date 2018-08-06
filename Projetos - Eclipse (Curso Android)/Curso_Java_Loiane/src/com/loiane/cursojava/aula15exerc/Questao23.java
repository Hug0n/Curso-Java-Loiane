	package com.loiane.cursojava.aula15exerc;

	import java.util.Scanner;

	public class Questao23 {

		public static void main(String[] args) {
			
			String nomeCarne = ""; 
			int tipoCarne = 0;
			double quantidadeKG = 0;
			int usoCartao = 0;
			double precoCarne = 0;
			double precoTotalCarne = 0;
			double descontoCartao = 5;
			double totalComDesconto = 0;
						
			
			
			Scanner scan = new Scanner(System.in);

			System.out.println ("*--|-|--*   Bem vindo(a) a loja de carnes! Qual carne você deseja? \n          1 - Filé Duplo /// 2 - Alcatra /// 3 - Picanha   *--|-|--*\n");
			tipoCarne = scan.nextInt();
			
			
			System.out.println ("*--|-|--*   E quantos KG você deseja?   *--|-|--*\n");
			quantidadeKG = scan.nextInt();
			
			System.out.println ("*--|-|--*   Comprando com o cartão H.MARKET você ganha um desconto de R$" + descontoCartao + "! Deseja utilizar o cartão? \n          1 - Sim ||| 2 - Não   *--|-|--*\n");
			usoCartao = scan.nextInt();
			
			if (tipoCarne == 1){
				
				nomeCarne = "Filé Duplo";
				
				if (quantidadeKG <= 5){
					
					precoCarne = 4.90;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				else if	(quantidadeKG > 5){
					
					precoCarne = 5.80;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				
			}
			else if (tipoCarne == 2){
				
				nomeCarne = "Alcatra";
				
				if (quantidadeKG <= 5){
					
					precoCarne = 5.90;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				else if	(quantidadeKG > 5){
					
					precoCarne = 6.80;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				
			}
			else if (tipoCarne == 3){
				
				nomeCarne = "Picanha";
				
				if (quantidadeKG <= 5){
					
					precoCarne = 6.90;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				else if	(quantidadeKG > 5){
					
					precoCarne = 7.80;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				
			}
			if (usoCartao == 1){
				
				totalComDesconto = precoTotalCarne - ((precoTotalCarne * descontoCartao) / 100);
				
				System.out.println ("*--|-|--*   Você comprou " + quantidadeKG + "KG de " + nomeCarne + ", por um valor total de R$" + precoTotalCarne + "! *--|-|--*\n"
						+ "*--|-|--*   Por você ter comprado com o cartão H.MARKET você terá um desconto de " + descontoCartao + "% no valor total. Com isso, você pagará apenas R$" + totalComDesconto + " !!!  *--|-|--*\n"
								+ "\n\n *--|-|--*   SUPERMERCADO H.MARKET. AGRADECEMOS SUA PREFERÊNCIA.   *--|-|--* ");
				
			}
			else{
				
				System.out.println ("*--|-|--*   Você comprou " + quantidadeKG + "KG de " + nomeCarne + ", por um valor total de R$" + precoTotalCarne + "! *--|-|--*\n"
						+ "*--|-|--*   Por você ter comprado a vista, infelizmente voê não terá o desconto adicional no valor de " + descontoCartao + "% no valor total.   *--|-|--*\n"
								+ "\n\n *--|-|--*   SUPERMERCADO H.MARKET. AGRADECEMOS SUA PREFERÊNCIA.   *--|-|--* ");
				
			}
		}	
	}		