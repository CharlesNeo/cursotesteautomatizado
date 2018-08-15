package br.com.charles.certificacao;

public class TesteTernario {

	public static void main(String[] args) {

		char sexo = 'M';
		System.out.println(sexo == 'F' ? "Leu é gay" : "Leu é homem");

		int i = 4;
		System.out.println(i == 5 ? 100 + " Resultado" : 0);

	}
}
