package br.com.charles.certificacao;

public class TestaStrings {

	public static void main(String[] args) {

		String texto = "Vou fazer a certifica��o de java";
		System.out.println(texto.indexOf("Vou")); // apresenta a posi��o da Palavra Java
		System.out.println(texto.indexOf("php")); // procurando por posi��o
		System.out.println(texto.lastIndexOf("a"));// procura a ultima posi��o
		System.out.println(texto.lastIndexOf("teste"));// se n�o encontrar, devolve -1
		System.out.println(texto.startsWith("Vou")); // verifica se a frase inicia com o valor passado no parametro
		System.out.println(texto.endsWith("c#")); // verifica se a ultima palavra � a da frase
		
		
		
//		String s = "Charles";
//		s.toUpperCase(); // Nesse passo o objeto s est� alterando o valor para maiusculo mas n�o ta atribundo para ninguem
//		s = s.toUpperCase(); // s recebe de volta o valor alterado para maiusculo
//		System.out.println(s);
//		
//		System.out.println(s.charAt(2));//acessando a posi��o da String
//      System.out.println(s.length()); // apresenta o tamanho da string
//        
//		System.out.println("Java".equals("java"));// compara duas string
//		System.out.println("Java".equalsIgnoreCase("java")); // compara duas string ignorando a case
//		System.out.println("Certificado".compareTo("Arnaldo"));
//		
//		
//		String nomeDireto = "Java";
//		String nomeIndireto = new String("Java");
//
//		char[] nome = new char[] { 'J', 'a', 'v','a' };
//		String nome1 = new String(nome);
//		
//		StringBuilder sb1 = new StringBuilder("Java");
//		String nome2 = new String(sb1);
//	
//	    String nomeNulo = null;
//		
//		String nomeDaProva = "Certifica��o" + " " + "Java";
//		String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
//		System.out.println(nomeDaProva);
//		System.out.println(nomeDaProvaComNulo);
////	System.out.println(nomeNulo.toString()); n�o � possivel chamar metodo para valores nulos
//		
//		System.out.println("Certifica��o " + 1500);
//		System.out.println(1500 + " Certifica��o");
//		System.out.println(15 + (0 +(0 + " Certifica��o")));
//		System.out.println(1+ (500 + " Certifica��o"));
//		
		

	}
}
