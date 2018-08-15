package br.com.charles.curso.udemy;

public class If {
	public static void main(String[] args) {

		double nota = 9.5;
		boolean bomComportamento = false;

		if (nota >= 9 && bomComportamento) {
			System.out.println("Quadro de hora!");
		} else {
			System.out.println("Não teve bom comportamento " + nota);
		}

	}
}
