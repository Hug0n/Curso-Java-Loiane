package com.loiane.cursojava.aula28a33exerc.Const_Encaps_OverL.exerc1;


public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada(10,"oi, ","tudo bem?", false);
		
		lampada.ligar();
		
		lampada.mudarEstado();
		
		lampada.mudarEstado();
	}

}
