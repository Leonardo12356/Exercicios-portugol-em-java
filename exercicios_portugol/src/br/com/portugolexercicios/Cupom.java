package br.com.portugolexercicios;

import java.util.Scanner;

public class Cupom {

	public static void main(String[] args) {
		int cup = 1;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite seus cupons ");
		cup = leia.nextInt();
		System.out.println("De acordo com seus cupons, você tem, " + cup + " pontos no programa de fidelidade!");
		leia.close();
	}

}
