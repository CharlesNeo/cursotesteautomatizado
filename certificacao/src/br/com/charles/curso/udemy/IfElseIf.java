package br.com.charles.curso.udemy;

public class IfElseIf {

	public static void main(String[] args) {

		double nota = 5.6;

		if (nota >= 9.0) {
			System.out.println("Quadro de honra");
		} else if (nota >= 7.0) {
			System.out.println("Aprovado");
		} else if (nota >= 5.5) {
			System.out.println("Recupera��o");
		} else if (nota >= 3.5) {
			System.out.println("Recupera��o + Trabalho");
		} else {
			System.out.println("Reprovado");
		}
	}
}
