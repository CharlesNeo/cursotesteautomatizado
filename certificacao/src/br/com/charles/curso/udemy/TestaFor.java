package br.com.charles.curso.udemy;

import java.util.Iterator;
import java.util.Scanner;

public class TestaFor {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;

		for (int i = 0; i < 3; i++) {
			nota = s.nextDouble();
			somaDasNotas += nota;
		}
		s.close();
		System.out.printf("Á media das notas é %.2f", somaDasNotas / 3);
	}
}
