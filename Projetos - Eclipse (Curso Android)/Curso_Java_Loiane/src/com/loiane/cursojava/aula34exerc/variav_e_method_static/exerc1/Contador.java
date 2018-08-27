package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc1;

public class Contador {
	
	private static int incrementador = 0;
	
	Contador() {
		incrementador++;
		System.out.println("Classe instanciada! Increment realizado");

	}
	

    void zerarIncrement() {
		incrementador = 0;
		System.out.println("Increment zerado!");
	}
	
	void incrementar() {
		incrementador++;
		System.out.println("Increment adicionado com sucesso!");
	}
	
	public int getIncrementador() {
		return incrementador;
	}

	public void setIncrementador(int incrementador) {
		Contador.incrementador = incrementador;
	}
	
	

}
