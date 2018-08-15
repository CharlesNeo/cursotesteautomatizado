package br.com.charles.curso.udemy;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;

		int indice = 0; // indice para controlar o while - contador
		while (indice < 3) { // verificando o valor do while
			System.out.println("Digite a nota");
			nota = s.nextDouble(); // entrada de dados do usuário
			somaDasNotas += nota; // soma das notas recebe o a nota que o usuário digitou
			indice++; // incremetando o indice
		}
		s.close();
		System.out.printf("A média é %.2f", somaDasNotas / 3);
	}
}