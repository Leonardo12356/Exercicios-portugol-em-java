package br.com.portugolexercicios;
/*Crie o programa “mini calculadora”, que após ler dois números inteiros apresenta as
 *  operações de soma,subtração, multiplicação e divisão com eles.
Obs.: Trate o maior número possível de erros 
(ex: operações com números negativos, divisão por zero, uso de letras, etc).
*/

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		int num1;
		int num2;
		double div = 0;
		
		System.out.println("-->Mini Calculadora<--");
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Soma " + (num1 + num2));
		System.out.println("Subtração " + (num1 - num2));
		System.out.println("Multiplicação " + (num1 * num2));
		System.out.println("Divisão " +  ((div) + num1 / num2));
		leia.close();
	}

}
