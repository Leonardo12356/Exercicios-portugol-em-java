package br.com.portugolexercicios;

import java.util.Scanner;

public class Termometro {

	public static void main(String[] args) {
		float c;
		System.out.println("-->Conversor de temperatura:<--");
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Celsius: ");
		c = leia.nextFloat();
		System.out.println("A temperatura em fahrenheit é:\n" + (c * 1.8 + 32));
		leia.close();
		
	
		
	}

}
