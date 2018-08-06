package com.loiane.cursojava.aula20exerc.Matriz;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		String [][] Agenda = new String [31][24];

		Scanner e = new Scanner(System.in);

		int intent = 1;
		int opcao = 0;
		///////////////////
		while (intent != 0) {
			
			int i = 0;
			int j = 0;	
			String compromisso = "";
			
			System.out.println("-------------\n\nQual opção você deseja executar?\n \n1 - Cadastrar/Alterar \n2 - Consultar \n3 - Exibir tudo \n4 - Sair \n\n-------------");
			opcao = e.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Qual o dia do mês? (até 31)\n");
				i = e.nextInt();
				i--;
				System.out.println("Em qual hora do dia? (até 24)\n");
				j = e.nextInt();
				j--;
				System.out.println("Qual o compromisso?\n");
				compromisso = e.next();;

				Agenda[i][j] = compromisso;
				
				System.out.println("Salvo com sucesso.");
			}
			else if(opcao == 2) {
				
				System.out.println("Qual o dia do mês? (até 31)\n");
				i = e.nextInt();
				i--;
				System.out.println("Em qual hora do dia? (até 24)\n");
				j = e.nextInt();
				j--;
				
				System.out.println(Agenda[i][j]);

			}
			else if(opcao == 3) {
				
				for (i = 0; i < Agenda.length; i++) {
					System.out.println(" Valores: \n");
					for (j = 0; j < Agenda[i].length; j++) {
						System.out.println("\nLinha " + (i + 1) + " e Coluna " + (j + 1) + " - > " + Agenda[i][j]);
					}
					System.out.println(" \n");
				}
			}
			else if(opcao == 4) {
				
				intent = 0;
				System.out.println("Até breve! \n");

			}
		}
	}
}