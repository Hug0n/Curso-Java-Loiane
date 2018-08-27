package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc4;

public class ConversaoDeUnidadesDeTempo {
	
	static double peQuadrado = 929; //centímetros
	static double metroQuadrado =  conversPeQuadrado(10.76) ; //10.76 * peQuadrado;
	static double Acre = conversPeQuadrado(43.560);
	static double milhaQuadrada = conversAcre(640); //640 * Acre

	static double resultado;

	static double conversMetroQuadrado(double num1) {
		resultado = metroQuadrado * num1; //conversPeQuadrado(num1);
		return resultado;
	}

	static double conversPeQuadrado(double num1) {
		resultado = num1 * peQuadrado; 
		return resultado;
	}

	static double conversMilhaQuadrada(double num1) {
		resultado = milhaQuadrada * num1;
		return resultado;
	}

	static double conversAcre(double num1) {
		resultado = Acre * num1;
		return resultado;
	}
}
