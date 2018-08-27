package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc6;

public class TesteUnidadesTempos {

	public static void main(String[] args) {

		
		outputVariaveis();

		System.out.println(	"\nPés: " + ConversaoDeUnidadesDeTempo.conversPeQuadrado(5));
		outputVariaveis();
		

		System.out.println(	"\nMetro: " + ConversaoDeUnidadesDeTempo.conversMetroQuadrado(5));
		outputVariaveis();
		
		
		System.out.println(	"\nMilha: " + ConversaoDeUnidadesDeTempo.conversMilhaQuadrada(5));
		outputVariaveis();
		
	
		System.out.println(	"\nAcres: " + ConversaoDeUnidadesDeTempo.conversAcre(5));
		outputVariaveis();

		
	
	}
	
	static void outputVariaveis() {
		
		System.out.println(	"\npeQuadrado: " + ConversaoDeUnidadesDeTempo.peQuadrado);
		System.out.println(	"metroQuadrado: " + ConversaoDeUnidadesDeTempo.metroQuadrado);
		System.out.println(	"milhaQuadrada: " + ConversaoDeUnidadesDeTempo.milhaQuadrada);
		System.out.println(	"Acre: " + ConversaoDeUnidadesDeTempo.Acre);
		System.out.println(	"RESULTADO: " + ConversaoDeUnidadesDeTempo.resultado);
		
	}

}
