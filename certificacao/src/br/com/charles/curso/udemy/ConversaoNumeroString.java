package br.com.charles.curso.udemy;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		// Integer num1 = 10000;
		// System.out.println(num1.toString().length());
		//
		// // Convertendo int para String
		// int num2 = 100000;
		// System.out.println(Integer.toString(num2).length());
		// System.out.println(("" + num2).length());
		//
		// // convertendo double para String
		// double num3 = 10.2 / 8;
		// System.out.println(Double.toString(num3));
		// System.out.println(Double.toString(num3).length());
		//
		// long notas = 10000;
		// System.out.println(Long.toString(notas));
		//
		// // convertendo int para String
		// int not = 56411;
		// String variasNotas = Integer.toString(not);
		// System.out.println(variasNotas);
		//
		// double medias = 50.1;
		// String mediaGeral = Double.toString(medias); // sempre passar o valor da
		// Classe wharper
		// System.out.println(mediaGeral);

		double notaAluno = 5.9;

		if (notaAluno == 6.9) {
			notaAluno += 0.1;
			String resultados = Double.toString(notaAluno); // conversão do tipo Double para String
			System.out.println("Media do Aluno : " + notaAluno);
			System.out.println(resultados);
			System.out.println(notaAluno >= 7.0 ? "Aprovado" : "Reprovado");	
		}
	}
}