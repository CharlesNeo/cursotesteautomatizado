
package br.com.charles.certificacao;

public class Pessoa {

    static int totalDePessoa = 0; // varíavel static é variável de classe
	String nome; // varíavel membro
	
	// construtod da classe com uma String como atributo
	Pessoa(String nome) {
		this.nome = nome;
	}

	// metodo com retorno dentro da propria classe
	public String getNome() {
		String sobreNome = ("Silveira");
		return nome + sobreNome; // retorna nome e sobre nome
	}

}
