package br.com.portugolexercicios;

import java.util.Scanner;

public class ProgramaEducado {

	public static void main(String[] args) {
		String nome, apelido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Boa Tarde! Sou o programa Educado. Como posso te chamar?");
		nome = leia.next();
		System.out.println("Prazer em te conhecer, " + nome + ", mas como gostaria de ser chamado? ");
		apelido = leia.next(); 
		System.out.println("Perfeito " + apelido + ", Excelente tarde!");
		leia.close();
	}
}
