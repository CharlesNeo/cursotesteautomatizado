package br.com.charles.curso.udemy;
import java.util.Scanner;

public class TestaDoWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;

		do {
			nota = s.nextDouble();

			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		} while (nota != -1);
		s.close();
		System.out.printf("Á media de notas foi:  %.2f:", somaDasNotas / numeroDeNotas);
	}
}
