package br.com.charles.certificacao;

public class TestaCasting {

	public static void main(String[] args) {
		double d = 15.8;
		int i = (int) d; // passando um valor double para int - vai perder informa��o - casting
		System.out.println(i);

		long l = 151515151515l - 1191296155;
		int i2 = (int) l; // casting
		System.out.println(i2); // vai imprimir um n�mero que estorou

		int x = 200;
		byte b = (byte) x; // transformando x para byte
		System.out.println(b);
	}
}
