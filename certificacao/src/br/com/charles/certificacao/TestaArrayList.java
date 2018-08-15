package br.com.charles.certificacao;

import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Charles");
		nomes.add("Mauricio");
		nomes.add("Francisca");
		nomes.add("Francisca");
		
		System.out.println(nomes.contains("Francisca")); // contains verifica se o valor existe no array
		System.out.println(nomes.contains("Fábio")); // contains verifica se o valor existe no array
		
		boolean removido = nomes.remove("Francisca");
		
		System.out.println(removido);
		System.out.println(nomes.contains("Francisca"));
		
		System.out.println(nomes.size()); //imprime quantos elementos existe dentro do arraylist
		
		
	}
}
