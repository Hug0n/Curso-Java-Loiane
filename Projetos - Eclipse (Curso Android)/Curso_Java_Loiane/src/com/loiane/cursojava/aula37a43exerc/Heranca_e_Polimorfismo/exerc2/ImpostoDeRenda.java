package com.loiane.cursojava.aula37a43exerc.Heranca_e_Polimorfismo.exerc2;

public abstract class  ImpostoDeRenda {
	
	private static double porcentagem;
	private static double aux;
	private static double rendaBruta;

	
	void calcularImpostoDeRenda() {
	
	}
	 
	 void static calcularImpostoPessoaJuridica() {
			aux = (rendaBruta * porcentagem) / 100;
			rendaBruta -= aux;
	 }

}
