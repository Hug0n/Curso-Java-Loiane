package com.loiane.cursojava.aula20exerc.Matriz;

import java.util.Scanner;

public class Q6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[][] JogoDaVelha = new int[3][3];

		Scanner e = new Scanner(System.in);

		System.out.println("Bem vindo ao Jogo da Velha! Jogador X e Y preparados?");
		int game = 1;
		int linha = 10;
		int coluna = 10;
		String jogador = "X";
		int noWinner = 0;
		
		while (game == 1) {
			
			System.out.println("\n Jogador " + jogador + ": Digite a linha e a coluna desejada");
			linha = e.nextInt();
			coluna = e.nextInt();
			linha--;
			coluna--;
			// valida��o da inser��o

			if (linha > 2 || linha < 0) {
				System.out.println("Linha inv�lida! Tente novamente.");

			} else if (coluna > 2 || coluna < 0) {
				System.out.println("Coluna inv�lida! Tente novamente.");
			} else { // valida��o se o valor da posi��o � NULL
				Integer posicao = JogoDaVelha[linha][coluna];

				if (posicao == 0) {
					int verify = 0;

					// PLAYER X

					if (jogador.equals("X")) {
						JogoDaVelha[linha][coluna] = 1;
						noWinner++;

						// verifica��o nas linhas X X X
						for (int i = 0; i < JogoDaVelha.length; i++) {
							verify = 0; // verify RESETADO na prox linha
							for (int j = 0; j < JogoDaVelha.length; j++) {
								if (JogoDaVelha[i][j] == 1) {
									verify++;
									if (verify == 3) {
										System.out.println("O jogador " + jogador + " preencheu 1 linha e ganhou! Parab�ns! ");
										game = 0;
										break;
									}
								}
							}
						}
						// verifica��o nas diagonais
						// com incrementador de coluna diagonal direita esquerda

						int marcaLinha = 2;
						int marcaColuna = 2;
						verify = 0;

						for (int i = 0; i < JogoDaVelha.length; i++) {
							if (JogoDaVelha[marcaLinha][marcaColuna] == 1) {
								verify++;
								if (verify == 3) {
									System.out.println("O jogador " + jogador + " preencheu 1 diagonal D-E e ganhou! Parab�ns! ");
									game = 0;
									break;
								}
							}
							marcaLinha--;
							marcaColuna--;
						}

						// verifica��o nas diagonais
						// com incrementador de coluna diagonal esquerda direita

						marcaLinha = 0;
						marcaColuna = 0;
						verify = 0;

						for (int i = 0; i < JogoDaVelha.length; i++) {

							if (JogoDaVelha[marcaLinha][marcaColuna] == 1) {
								verify++;
								if (verify == 3) {
									System.out.println("O jogador " + jogador + " preencheu 1 diagonal E-D e ganhou! Parab�ns! ");
									game = 0;
									break;
								}
							}
							marcaLinha++;
							marcaColuna++;
						}

						// verifica��o nas colunas
						// com incrementador de coluna e linha

						marcaLinha = 0;
						marcaColuna = 0;
						verify = 0;

						for (int i = 0; i < JogoDaVelha.length; i++) {
							for (int j = 0; j < JogoDaVelha[i].length; j++) {
								if (JogoDaVelha[j][marcaColuna] == 1) {
									verify++;
									if (verify == 3) {
										System.out.println("O jogador " + jogador + " preencheu 1 coluna e ganhou! Parab�ns! ");
										game = 0;
										break;
									}
								}
								//marcaLinha++;
							}
							marcaColuna++;
							verify = 0;
						}
					} // END PLAYER X

					// PLAYER Y

					else if (jogador.equals("Y")) {
						JogoDaVelha[linha][coluna] = 2;
						noWinner++;

						// verifica��o nas linhas X X X
						for (int i = 0; i < JogoDaVelha.length; i++) {
							verify = 0; // verify RESETADO na prox linha
							for (int j = 0; j < JogoDaVelha.length; j++) {
								if (JogoDaVelha[i][j] == 2) {
									verify++;
									if (verify == 3) {
										System.out.println("O jogador " + jogador + " preencheu 1 linha e ganhou! Parab�ns! ");
										game = 0;
										break;
									}
								}
							}
						}
						// verifica��o nas diagonais
						// com incrementador de coluna diagonal direita esquerda

						int marcaLinha = 2;
						int marcaColuna = 2;
						verify = 0;

						for (int i = 0; i < JogoDaVelha.length; i++) {

							if (JogoDaVelha[marcaLinha][marcaColuna] == 2) {
								verify++;
								if (verify == 3) {
									System.out.println("O jogador " + jogador + " preencheu 1 diagonal D-E e ganhou! Parab�ns! ");
									game = 0;
									break;
								}
							}
							marcaLinha--;
							marcaColuna--;
						}

						// verifica��o nas diagonais
						// com incrementador de coluna diagonal esquerda direita

						marcaLinha = 0;
						marcaColuna = 0;
						verify = 0;

						for (int i = 0; i < JogoDaVelha.length; i++) {

							if (JogoDaVelha[marcaLinha][marcaColuna] == 2) {
								verify++;
								if (verify == 3) {
									System.out.println("O jogador " + jogador + " preencheu 1 diagonal E-D e ganhou! Parab�ns! ");
									game = 0;
									break;
								}
							}
							marcaLinha++;
							marcaColuna++;
						}

						// verifica��o nas colunas
						// com incrementador de coluna e linha

						marcaLinha = 0;
						marcaColuna = 0;
						verify = 0;

						for (int i = 0; i < JogoDaVelha.length; i++) {
							for (int j = 0; j < JogoDaVelha[i].length; j++) {
								if (JogoDaVelha[j][marcaColuna] == 2) {
									verify++;
									if (verify == 3) {
										System.out.println("O jogador " + jogador + " preencheu 1 coluna e ganhou! Parab�ns! ");
										game = 0;
										break;
									}
								}
								//marcaLinha++;
							}
							marcaColuna++;
							verify = 0;
						}
					} // END PLAYER Y

					System.out.println("\nA rodada acabou com a seguinte tabela da velha: \n");

					for (int i = 0; i < JogoDaVelha.length; i++) {
						for (int j = 0; j < JogoDaVelha[i].length; j++) {
							System.out.print("| " + JogoDaVelha[i][j] + " |");
						}
						System.out.print(" \n");
					}
					
					//Trocar os jogadores
					
					if (jogador.equals("X")) {
						jogador = "Y";
					} else if (jogador.equals("Y")){
						jogador = "X";
					}
					
					if(noWinner == 9) {
						game = 2;
						System.out.println("N�o houve vencedor dessa vez! Tentem novamente ;D");

						break;
					}
					
				} else {
					System.out.println("J� existe um valor nessa posi��o! Tente novamente!");
				}
			}
		}
		if (game != 2) {
			System.out.println("N�o se preocupe, " + jogador + "! Nos vemos na revanche!");
		}
	}
}
