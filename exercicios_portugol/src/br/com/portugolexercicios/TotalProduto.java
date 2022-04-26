package br.com.portugolexercicios;

import java.util.Scanner;

public class TotalProduto {

	public static void main(String[] args) {
		int quant;
		
		System.out.println("Boa Tarde, Cliente!Informe a quantidade de produtos que você vai comprar, por favor:");
		Scanner leia = new Scanner (System.in);
		quant = leia.nextInt();
		System.out.println("Parabéns por comprar " + quant +  " produtos!");
		leia.close();
	}

}
