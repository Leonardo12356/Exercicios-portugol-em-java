package br.com.portugolexercicios;
/*Crie o programa �mini calculadora�, que ap�s ler dois n�meros inteiros apresenta as
 *  opera��es de soma,subtra��o, multiplica��o e divis�o com eles.
Obs.: Trate o maior n�mero poss�vel de erros 
(ex: opera��es com n�meros negativos, divis�o por zero, uso de letras, etc).
*/

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		int num1;
		int num2;
		double div = 0;
		
		System.out.println("-->Mini Calculadora<--");
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Soma " + (num1 + num2));
		System.out.println("Subtra��o " + (num1 - num2));
		System.out.println("Multiplica��o " + (num1 * num2));
		System.out.println("Divis�o " +  ((div) + num1 / num2));
		leia.close();
	}

}
