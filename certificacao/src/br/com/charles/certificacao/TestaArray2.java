package br.com.charles.certificacao;

public class TestaArray2 {

	public static void main(String[] args) {

		Cliente[] clientes = new Cliente[10];

		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
			clientes[i].nome = "MARIO";
		}

		for (Cliente c : clientes) {
			System.out.println(c.nome);

			Cliente clientes2[] = new Cliente[5];
			clientes2[0] = new Cliente();
			clientes2[1] = new ClienteEspecial(); // aplicando polimorfismo (Cliente Especial extends Cliente)

			Cliente charles = new Cliente();
			charles.nome = "Charles";
			clientes2[0] = charles; // recebendo o objeto

			System.out.println(charles.nome);
			System.out.println(clientes2[0].nome);

			charles.nome = "Alves";

			System.out.println(charles.nome);
			System.out.println(clientes2[0].nome);

			// arrays de tipos primitivos
			// int [] valores = new int [10];
			// long numero [] = (long[]) valores; // não é possivel fazer um cast
			//
			String[] nomes = { "Maria", "Joao" };
			Object[] objetos = nomes; // é possivel fazer cast de objetos
			for (Object o : objetos) {
				System.out.println(o);
			}
		}
	}
}
