package br.com.charles.certificacao;

public class Calculadora {

	public int soma(String nome, int... numeros) { // números é um array
		int soma = 0; // iniciando soma com valor zero
		
		for (int i = 0; i < numeros.length; i++) { // vale até o i ficar menor que o tamanho do array
			soma += numeros[i]; // variavel soma vai receber ela mais o numero na posição i
		}
		return soma; // retorna soma com os valores somados de i
	}
}
