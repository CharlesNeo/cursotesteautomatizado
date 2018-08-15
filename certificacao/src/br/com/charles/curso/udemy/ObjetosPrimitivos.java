package br.com.charles.curso.udemy;

public class ObjetosPrimitivos {

	public static void main(String[] args) {

		// Objetos whapers - pegar tipo primitivo e colocar a primeira letra maiuscula

		Character c = 'a'; // objeto do tipo char
		Boolean bo = true; // versão objeto do tipo

		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4l;

		Float f = 5.1f;
		Double d = 6.1;

		// comportamentos de objetos - .leght pertence aos objetos Strings
		System.out.println(bo.toString().length());

	}
}
