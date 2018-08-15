package br.com.charles.certificacao;

public class Carro {

	String modelo;
	int ano;
	
	// construtor
	Carro() {
		ano = 2014;
	}
	// metodo
	void reseta() {
		ano = 2014;
	}
	// metodo
	public String getDadosDeImpressao() {
		return modelo + "::" + ano;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
