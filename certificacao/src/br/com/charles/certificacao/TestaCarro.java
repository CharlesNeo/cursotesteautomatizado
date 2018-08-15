package br.com.charles.certificacao;

public class TestaCarro {

	public static void main(String[] args) {
		Carro a = new Carro();
		a.modelo = "Palio"; // acessando membro do carro
		a.setModelo("Palio2");
		System.out.println(a.getDadosDeImpressao());
		System.out.println(a.ano);
		System.out.println(a.modelo.length()); // imprimindo o valor de uma String

	}
}
