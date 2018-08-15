package br.com.charles.certificacao;

public class TestaComparacaoString {

	public static void main(String[] args) {
		String nome1 =  "Charles";
		String nome2 =  "Charles";
		
		String nome3 =  new String("Charles");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		//melhor forma de comparar variáveis
		System.out.println(nome1.equals(nome3)); // comparando o conteudo das variaveis
		
		String a = "a";
		String ab = a  + "b";
		System.out.println(ab == "ab");
		
		String texto = "um texto qualquer";
		String txt = texto.substring(3, 8); // devolve a palavra texto quando é criado um string de um metodo não vai para o po
		System.out.println(txt == "texto");
		System.out.println(texto.toLowerCase()==texto);
		System.out.println(texto.toString()== texto); // pega o objeto e converte para string não altera o valor
		
		
		
	 
	}
}
