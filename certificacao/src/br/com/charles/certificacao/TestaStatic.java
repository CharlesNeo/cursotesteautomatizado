package br.com.charles.certificacao;

public class TestaStatic {

	public static void main(String[] args) {
		Moto.totalDeMotos = 15; // acessando através do nome da classe
		System.out.println(Moto.getTotalDeMotos()); // acessa através do nome da classe
		
		
	}
}
