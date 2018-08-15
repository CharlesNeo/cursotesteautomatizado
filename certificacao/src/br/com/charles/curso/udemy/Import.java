package br.com.charles.curso.udemy;// fica do lado de fora da classe

import java.util.Date;

public class Import {

	public static void main(String[] args) {
		
		String numero = "10";
		int numeros = 0;
		numeros = Integer.parseInt(numero);
		System.out.println(numeros);
		
		int numero1 =100;
		String numero2 = "";
		numero2 = Integer.toString(numero1);
		System.out.println(numero2);
		
		double nota =1.0;
		String notas = Double.toString(nota);
		System.out.println(notas);
		
		String media = "5.5";
		double medias = Double.parseDouble(media);
		System.out.println("Media geral: "+medias /2);
	}
}
