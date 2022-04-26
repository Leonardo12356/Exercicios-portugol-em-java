package br.com.portugolexercicios;

import java.util.Scanner;

public class TempoDeVida {

	public static void main(String[] args) {
		/*Idade colegas e minha idade*/
		
		int col1, col2, col3, col4, col5, minhaidade; 
		
		System.out.println("Qual é a idade do colega 1?");
		Scanner leia = new Scanner (System.in);
		col1 = leia.nextInt();
		System.out.println("Qual é a idade do colega 2?");
		col2 = leia.nextInt();
		System.out.println("Qual é a idade do colega 3?");
		col3 = leia.nextInt();
		System.out.println("Qual é a idade do colega 4?");
		col4 = leia.nextInt();
		System.out.println("Qual é a idade do colega 5?");
		col5 = leia.nextInt();
		System.out.println("Qual é a minha idade? ");
		minhaidade = leia.nextInt();
		System.out.println("O tempo de vida dos meus colegas é: " + (col1 + col2 + col3 + col4 + col5 + minhaidade));
		leia.close();
						
	}

}
