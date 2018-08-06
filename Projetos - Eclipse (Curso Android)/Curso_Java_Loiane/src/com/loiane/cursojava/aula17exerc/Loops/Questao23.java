package com.loiane.cursojava.aula17exerc.Loops;

public class Questao23 {

	public static void main(String[] args) {
		
		double increaseValorProduct = 1.99;
		int quantItens = 50;
		double valorProduto = 0;
		
		System.out.println("Loja Quase Dois - Tabela de Preços");
		
		for (int i = 1; i <= quantItens; i++){
			
			valorProduto =+ valorProduto + increaseValorProduct;
			
			System.out.printf(i + " - R$ %.2f %n" , valorProduto);
		}	
	}
}
