package br.com.charles.curso.udemy;

public class VariaveisEConstantes {

	public static void main(String[] args) {

	  double raio = 4.5;
	  final double PI = 3.1416;  // CONSTANTE � SEMPRE USADA EM MAIUSCULO
	  double area = PI* raio * raio;
	  System.out.println("�rea � " + area + " m2.");
	 
	  //IMPRIMINDO FORMATADO
	  System.out.printf("�rea � %f m2. \n", area); // Substitui o %f pela variavel depois da virgula(area) - \n quebra linha
	  System.out.printf("�rea � %.2f m2.", area);  // %2f vai exibir apenas duas casa decimais na impress�o
	  
	}
}
