package com.loiane.cursojava.aula37a43exerc.Heranca_e_Polimorfismo.exerc2;

public class PessoaFisica extends Contribuinte{

	private double rendaBruta;
	private double porcentagem = 0.10;
	private double aux;

	//---
	PessoaFisica(String nome, double rendaBruta){
		this.rendaBruta = rendaBruta;
		setNome(nome);
		System.out.println(nome + " a Renda bruta de R$" + rendaBruta +" foi registrada com sucesso!");
	}
	
	void calcularImpostoPF() {
		if (rendaBruta >= 0 && rendaBruta <= 1400) {
			porcentagem = 0;
			System.out.println("Valor de renda bruta não elegível para cálculo de Imposto de Renda.");
		}
		else if (rendaBruta > 1400 && rendaBruta <= 2100 ) {
			porcentagem = 10;
			rendaBruta -= 100;
			System.out.println("Alíquota de R$" + porcentagem + "%. Sua renda bruta atual é de R$" + rendaBruta + "!");
		}
		else if (rendaBruta > 2100 && rendaBruta <= 2800 ) {
			porcentagem = 15;
			rendaBruta -= 270;
			System.out.println("Alíquota de R$" + porcentagem + "%. Sua renda bruta atual é de R$" + rendaBruta + "!");
		}
		else if (rendaBruta > 2800 && rendaBruta <= 3600 ) {
			porcentagem = 25;
			rendaBruta -= 500;
			System.out.println("Alíquota de R$" + porcentagem + "%. Sua renda bruta atual é de R$" + rendaBruta + "!");
		}
		else if (rendaBruta > 3600) {
			porcentagem = 30;
			rendaBruta -= 700;
			System.out.println("Alíquota de R$" + porcentagem + "%. Sua renda bruta atual é de R$" + rendaBruta + "!");
		}
	}
	
}
