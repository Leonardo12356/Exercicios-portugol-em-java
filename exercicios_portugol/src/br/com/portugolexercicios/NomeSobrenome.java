package br.com.portugolexercicios;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.next();
	
		System.out.println("Digite seu sobrenome: ");
		sobrenome = leia.next();

		System.out.println("Olá " + nome + " " + sobrenome + ", seja bem vindo ao mundo da programação!");
		leia.close();
					
	}

}
