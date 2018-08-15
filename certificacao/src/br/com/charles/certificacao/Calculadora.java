package br.com.charles.certificacao;

public class Calculadora {

	public int soma(String nome, int... numeros) { // n�meros � um array
		int soma = 0; // iniciando soma com valor zero
		
		for (int i = 0; i < numeros.length; i++) { // vale at� o i ficar menor que o tamanho do array
			soma += numeros[i]; // variavel soma vai receber ela mais o numero na posi��o i
		}
		return soma; // retorna soma com os valores somados de i
	}
}
