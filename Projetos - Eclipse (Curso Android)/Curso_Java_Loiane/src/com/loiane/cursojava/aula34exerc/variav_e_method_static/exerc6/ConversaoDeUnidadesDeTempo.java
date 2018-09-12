package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc6;

public class ConversaoDeUnidadesDeTempo {
	
	//static int minuto;
	
	
	static int conMinuto (int minuto) {
		
		minuto = minuto * 60;
		return minuto;
	}
	
	static int conHora (int hora) {
		
		hora = hora * 60;
		return hora;
	}
	
	static int conDia (int dia) {
		
		dia = dia * 24;
		return dia;
	}
	
	static int conSemana (int semana) {
		
		semana = semana * 7;
		return semana;
	}
	
	static int conMes (int mes) {
		
		mes = mes * 30;
		return mes;
	}
	
	static int conAno(double ano) {
		
		ano = ano * 365.25;
		return (int) ano;
	}

	
	
	
}
