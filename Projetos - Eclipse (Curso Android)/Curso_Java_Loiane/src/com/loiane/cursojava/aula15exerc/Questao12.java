package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		float resultado = 0;
		int percentualDesconto = 0;
		int percentualInss = 10;
		int percentualSindicato = 3;
		int percentualFGTS = 11;
		float novoSalario;
		int fgts = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de horas trabalhadas por mês: ");
		float horasPorDia = scan.nextFloat();
		System.out.print("Digite o valor da sua hora: ");
		float valorHora = scan.nextFloat();
		
		int salarioBruto = (int) (horasPorDia * valorHora);
		
		if (salarioBruto <= 900){
			
			percentualDesconto = 1;
			resultado = (salarioBruto * percentualDesconto) / 100;
			
		}
		else if (salarioBruto > 900 && salarioBruto <= 1500){
			
			percentualDesconto = 5;
			resultado = (salarioBruto * percentualDesconto) / 100;
			
		}
		else if (salarioBruto > 1500 && salarioBruto <= 2500){
			
			percentualDesconto = 10;
			resultado = (salarioBruto * percentualDesconto) / 100;
			
		}
		else if (salarioBruto > 2500 ){
			
			percentualDesconto = 20;
			resultado = (salarioBruto * percentualDesconto) / 100;
			
		}
		
		novoSalario = salarioBruto + resultado;
		int descontoInss = percentualInss * salarioBruto / 100;
		fgts =  ((percentualFGTS * salarioBruto) / 100) + fgts ;
		int totalDescontos = (int) (resultado + descontoInss);
		int salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println ("Salário Bruto (" + valorHora + " * " + horasPorDia + ")   :   R$" + salarioBruto);
		System.out.println ("(-) IR (" + percentualDesconto + "%)   :   R$" + resultado);
		System.out.println ("(-) INSS (" + percentualInss + "%)   :   R$" + descontoInss);
		System.out.println ("(+) FGTS (" + percentualFGTS + "%)   :   R$" + fgts);
		System.out.println ("(-) Total de descontos   :   R$" + totalDescontos);
		System.out.println ("Salário liquído   :   R$" + salarioLiquido);
		
		
	}

}
