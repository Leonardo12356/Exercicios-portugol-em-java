package br.com.portugolexercicios;

import java.util.Scanner;

public class TotalProduto {

	public static void main(String[] args) {
		int quant;
		
		System.out.println("Boa Tarde, Cliente!Informe a quantidade de produtos que voc� vai comprar, por favor:");
		Scanner leia = new Scanner (System.in);
		quant = leia.nextInt();
		System.out.println("Parab�ns por comprar " + quant +  " produtos!");
		leia.close();
	}

}
