package com.loiane.cursojava.aula37a43exerc.Heranca_e_Polimorfismo.exerc1;

public class ContaPoupanca extends ContaBancaria{

	private double diaRendimento = 0.001;

	//-----
	
	void calcularNovoSaldo() {
		double valor = getSaldoConta();
		System.out.println("Acréscimo de R$" + valor + " realizado com sucesso!");
		valor += valor * diaRendimento;
		setSaldoConta(valor);
	}
	
	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	

}
