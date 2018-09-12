package com.loiane.cursojava.aula35exerc.MetodosRecursivos.exerc2;

public class Somatorio {
	
	static int calcularSomatorio(int num) {

		if (num == 0) {
			return 0;
		}
		return num + calcularSomatorio(num-1);
	}

}
