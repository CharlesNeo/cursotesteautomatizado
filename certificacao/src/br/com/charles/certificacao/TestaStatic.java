package br.com.charles.certificacao;

public class TestaStatic {

	public static void main(String[] args) {
		Moto.totalDeMotos = 15; // acessando atrav�s do nome da classe
		System.out.println(Moto.getTotalDeMotos()); // acessa atrav�s do nome da classe
		
		
	}
}
