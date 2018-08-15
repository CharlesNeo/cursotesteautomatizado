package br.com.charles.certificacao;

public class TestaCicloDeVida {

	public static void main(String[] args) {
		
		Carros carros = new Carros();
		
		//Carro c; // variavel do tipo carro (pra criar um objeto precisa chamar o construtor)
		Carro c = new Carro();  // a variavel c é uma referencia de objeto do Tipo carro
		new Carro(); //
		c.ano = 2015;
		c.modelo = "Ferrari";
		carros.c1 = c; // não pode ser deletado, faz referencia a classe Carros
     
		c = new Carro(); // o primeiro carro perde a variavel de acessibilidade
		// o Garbage collection pode jogar fora o objeto - não tem como saber quando ele vai rodar
		// se torna inelegivel quando o objeto não será mais acessivel
		carros.c2 = c; // não pode ser deletado, faz referencia a classe Carros
		
		c= null;  // referencia nada (2 objetos inacessiveis)
		
		if(15 > 10) {
			Carro c2 = new Carro();
			c2.ano = 2010;
		} // fora do escopo do if, o objeto não é mais acessivel		
	
		Carro c3;
		for (int i = 0; i < 10; i++) {
			c3 = new Carro(); // criando 10 carro
		}// só existem dentro do for
		 // a variável c3(carro ainda existe e guarda o ultimo carro -- 1 carro ficou acessivel)
	    
	}
}
