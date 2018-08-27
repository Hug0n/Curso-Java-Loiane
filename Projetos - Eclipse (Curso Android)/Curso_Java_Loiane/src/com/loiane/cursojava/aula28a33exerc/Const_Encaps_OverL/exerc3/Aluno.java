package com.loiane.cursojava.aula28a33exerc.Const_Encaps_OverL.exerc3;

import java.util.Scanner;

public class Aluno {

	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	int[] notas = new int[3];
	// String[][] DiscNotas = new String[3][1];

	Scanner e = new Scanner(System.in);

	void incluirDisciplinaNotas() {
		String disciplina = "8";
		int nota = 0;
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "° disciplina e a nota: ");
			disciplina = e.next();
			nota = e.nextInt();
			disciplinas[i] = disciplina;
			notas[i] = nota;
		}
	}

	void verificarAprovacao() {
		for (int i = 0; i < disciplinas.length; i++) {
			if (notas[i] >= 7) {
				System.out.println("O aluno " + nome + " (" + matricula + ") do curso de " + curso
						+ " está aprovado na disciplina " + disciplinas[i] + " com a nota " + notas[i] + "!");
			} else if (notas[i] < 7) {
				System.out.println("O aluno " + nome + " (" + matricula + ") do curso de " + curso
						+ " está reprovado com nota inferior a 7 na disciplina " + disciplinas[i] + " com a nota "
						+ notas[i] + "!");
			}
		}
	}

	
	
	public Aluno(String nome, int matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
}
