package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		
		int idadeInserida = 0;
		int resultado = 1;
		int quantInserida = 0;
		float media = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println ("Quantas pessoas você entrevistará na turma? ");
		quantInserida = scan.nextInt();

		for (int i = quantInserida; i > 0; i--){
			
			System.out.println("Insira uma idade: ");
			idadeInserida = scan.nextInt();
			
			resultado += idadeInserida;
		}
		
		media = resultado / quantInserida;
		
		if (0 <= media && media <= 25 ){
			
			System.out.println("A média aritmética das " + quantInserida + " pessoas da turma resultou na média " + media + ", que significa que a turma em sua maioria (ou totalidade) é jovem. ");
		}
		else if (26 <= media && media <= 60 ){
			
			System.out.println("A média aritmética das " + quantInserida + " pessoas da turma resultou na média " + media + ", que significa que a turma em sua maioria (ou totalidade) é adulta. ");
		}
		else if (61 <= media && media <= 150 ){
			
			System.out.println("A média aritmética das " + quantInserida + " pessoas da turma resultou na média " + media + ", que significa que a turma em sua maioria (ou totalidade) é idosa            . ");
		}
		else{
			
			System.out.println("Ops! As idades inseridas não correspondem a uma média de idades humanas! Tente novamente.");
		}
		
		

	}
}
