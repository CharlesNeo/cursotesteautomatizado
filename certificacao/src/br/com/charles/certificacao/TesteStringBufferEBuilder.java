package br.com.charles.certificacao;

public class TesteStringBufferEBuilder {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("Tesde criação de String");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer(50);
		sb2.append(sb); // atribuindo um valor já existente
		sb2.append(" Ensino e Inovação");
		System.out.println(sb2);

		StringBuilder sb4 = new StringBuilder("C:Documentosarquivo.pdf");
		sb4.insert(2, "\\");
		sb4.insert(13, "\\");
		String caminho = sb4.toString(); // passando o valor para um string
		System.out.println(caminho);

		StringBuilder sb5 = new StringBuilder("Programando em Java");
		sb5.insert(2, "_"); // recebe a posição e o valor
		System.out.println(sb5);

		StringBuilder sb6 = new StringBuilder("Retirando string da frase");
		sb6.delete(2, 10); // deletando strings
		System.out.println(sb6);

		String frase = sb6.toString();
		System.out.println(frase);

		//Invertendo String
		System.out.println(new StringBuffer("Charles").reverse());

		// usando uma parte da frase
		StringBuilder sb7 = new StringBuilder("Programando para viver");
		System.out.println(sb7.substring(3, 10));
		System.out.println(sb7.subSequence(3, 15)); // mesma função do substring

		
	}
}
