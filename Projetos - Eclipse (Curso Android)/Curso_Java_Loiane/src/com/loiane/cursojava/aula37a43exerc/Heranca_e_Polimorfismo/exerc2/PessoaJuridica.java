package com.loiane.cursojava.aula37a43exerc.Heranca_e_Polimorfismo.exerc2;

public class PessoaJuridica extends Contribuinte{

	private double rendaBruta;
	private double porcentagem = 0.10;
	private double aux;

	//---
	PessoaJuridica(String nome, double rendaBruta){
		this.rendaBruta = rendaBruta;
		setNome(nome);
		System.out.println(nome + " a Renda bruta de R$" + rendaBruta +" foi registrada com sucesso!");
	}
	
	
	void calcularImpostoPJ() {
			aux = rendaBruta * porcentagem;
			rendaBruta -= aux;
			System.out.println("O desconto baseado em sua renda foi de R$" + aux + ". Sua renda bruta atual � de R$" + rendaBruta + "!");
	}
	
	//---
	
	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	
	
