package br.com.charles.curso.udemy;

import java.util.Scanner;

public class TestaWhile {

	public static void main(String[] args) {

		boolean status = true;
		Scanner s = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;

		System.out.println("***Bem vindo ao Programa de Notas***");

		
		while (nota != -1) { // enquanto nota for diferente de -1
			System.out.println("Digite a nota do aluno");
			nota = s.nextDouble(); // nota recebe o valor do teclado

			// verifica se a nota que vem do teclado é menor ou igual a zero e não é
			// negativa
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota; // soma das notas recebe o valor da nota digitada
				numeroDeNotas++; // numero de notas recebe o quantidade de notas digitadas
			}
		}
		s.close(); // fecha o método scanner
		System.out.printf("A média é %.2f ", somaDasNotas / numeroDeNotas); // apresenta o valor final formatado
	}
}
