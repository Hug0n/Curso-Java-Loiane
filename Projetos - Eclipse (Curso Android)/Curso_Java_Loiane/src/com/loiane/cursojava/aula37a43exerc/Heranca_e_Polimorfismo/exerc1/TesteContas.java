package com.loiane.cursojava.aula37a43exerc.Heranca_e_Polimorfismo.exerc1;

import java.util.Scanner;


public class TesteContas {
	
	static Scanner e = new Scanner(System.in);
	private static String nomePessoa;

	static ContaBancaria cBancaria = new ContaBancaria();
	static ContaEspecial cEspecial = new ContaEspecial();
	static ContaPoupanca cPoupa = new ContaPoupanca();

	public static void main(String[] args) {
	
		System.out.println("Bem-Vindo ao nosso BBBanco! ");

		loop();
		
	}
	
	private static void loop() {

		boolean loop = true;
		int opcao = 0;

		ContaBancaria variavelConta = cBancaria;
		nomePessoa = "ContaBancaria";

		while (loop) {

			System.out.println("\nQual operação deseja executar " + nomePessoa + "?");
			System.out.println("1 - Saque");
			System.out.println("2 - Depósito");
			System.out.println("3 - Consulta de Saldo");
			System.out.println("4 - Saque da Conta Especial"); //mesma função da opção 1
			System.out.println("5 - Trocar de Usuário");
			System.out.println("6 - Sair");

			opcao = e.nextInt();

			if (opcao == 1) {
				if (variavelConta.equals(cEspecial)) {
					System.out.println("Digite o valor do saque na conta especial: ");
					cEspecial.sacar(e.nextDouble());
				}
				else {
					System.out.println("Digite o valor do saque: ");
					variavelConta.sacar(e.nextDouble());
				}
			} else if (opcao == 2) {
				System.out.println("Digite o valor do depósito: ");
				variavelConta.depositar(e.nextDouble());
			} else if (opcao == 3) {
				if (variavelConta.equals(cPoupa)) {
					cPoupa.calcularNovoSaldo();
					System.out.println("O valor atual na poupança é R$" + variavelConta.getSaldoConta());
				}
				else {
					System.out.println("O saldo atual na conta é de R$" + variavelConta.getSaldoConta());
				}
			} else if (opcao == 4) {
				if (variavelConta.equals(cEspecial)) {
					System.out.println("Digite o valor do saque na conta especial: ");
					cEspecial.sacar(e.nextDouble());
				}
				else {
					System.out.println("A conta não é do tipo Especial!");
				}
			} else if (opcao == 5) {
				variavelConta = verificarPessoa(variavelConta);
			} else if (opcao == 6) {
				loop = false;
				System.out.println("Agradecemos a sua preferência. Queremos te ver de novo em breve!");
			}
		}
	}
	
	private static ContaBancaria verificarPessoa(ContaBancaria variavelConta) {
		if (variavelConta == cBancaria) {
			variavelConta = cEspecial;
			nomePessoa = "ContaEspecial";
		} else if (variavelConta == cEspecial){
			variavelConta = cPoupa;
			nomePessoa = "ContaPoupanca";
		}else {
			variavelConta = cBancaria;
			nomePessoa = "ContaBancaria";
		}
		System.out.println("Usuário alterado!");
		return variavelConta;
	}
}

