package br.com.charles.curso.udemy;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
      String resposta1=  JOptionPane.showInputDialog("Qual é a nota 1?");
      String resposta2=  JOptionPane.showInputDialog("Qual é a nota 2?");
      
      System.out.println(resposta1 + resposta2);
	
      //Converter string em double
      double nota1 = Double.parseDouble(resposta1);
      double nota2 = Double.parseDouble(resposta1);
      double total = nota1 + nota2;
      
      //Convertendo string para int
      int notas1 = Integer.parseInt(resposta1);
      int notas2 = Integer.parseInt(resposta2);
      int somaTotal = notas1 + notas2;     
 
      System.out.println(total /2);
      System.out.println(somaTotal /2);
      
      String comentario = "50";
      double valor = Double.parseDouble(comentario); // sempre passar o tipo e palavra reservada parse...
      System.out.println(valor);
      
	
	}
}
