package br.com.charles.curso.udemy;

public class TestaSwich {

	public static void main(String[] args) {
		String faixa = "Branco";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Entrei na faixa preta");
		case "marrom":
			System.out.println("Entrei na faixa marrom");
		case "roxa":
			System.out.println("Entrei na faixa roxa");
		case "verde":
			System.out.println("Entrei na faixa verde");
		case "laranja":
			System.out.println("Entrei na faixa laranja");
		case "vermelha":
			System.out.println("Entrei na faixa vermelha");
		case "amarela":
			System.out.println("Emtrei na faixa amarela");
		default:
			System.out.println("Não sei lutar karatê");
		}
	}
}
