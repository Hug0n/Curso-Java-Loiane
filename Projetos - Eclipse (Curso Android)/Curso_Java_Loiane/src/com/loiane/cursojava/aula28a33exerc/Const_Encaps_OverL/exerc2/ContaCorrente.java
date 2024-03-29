package com.loiane.cursojava.aula28a33exerc.Const_Encaps_OverL.exerc2;


public class ContaCorrente {

	private int idConta;
	private double saldo;
	private boolean contaEspecial;
	private double limite;
	
	//methods getters and setters
	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	//End methods getters and setters

	
	//Constructors
	
	public ContaCorrente() {
		System.out.println("Classe instanciada!");

	}
	
	public ContaCorrente(int idConta, double saldo, boolean contaEspecial, double limite) {
		super();
		this.idConta = idConta;
		this.saldo = saldo;
		this.contaEspecial = contaEspecial;
		this.limite = limite;
	}
	//End Constructors


	public void sacar(double valorSaque) {
		if (saldo < valorSaque) {
			System.out.println("O seu saldo � menor que o valor de saque!");
		} 
		else if (limite < valorSaque ) {
			System.out.println("Limite insuficiente!");
		}
		else {
			saldo -= valorSaque;
			System.out.println("Saque efetuado. Retire o seu dinheiro!");
		}
	}
	
	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("O valor de dep�sito n�o pode se igual ou menor que zero!");
		}
		else {
			saldo += valorDeposito;
			System.out.println("Dep�sito de R$" + valorDeposito + " realizado com sucesso!");
		}
	}
	
	public void consultar(){
		System.out.println("O saldo da sua conta(" + idConta +") � de R$" + saldo + "!");
	}
	
	public void verificarChequeEspecial() {
		if(contaEspecial) {
			System.out.println("A conta " + idConta + " � especial!");
		}
		else if (!contaEspecial) {
			System.out.println("A conta " + idConta + " n�o � especial!");
		}
	}
}
	
