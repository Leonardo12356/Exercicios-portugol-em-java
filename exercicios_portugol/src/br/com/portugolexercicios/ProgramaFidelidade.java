package br.com.portugolexercicios;
/*O �Programa de fidelidade� aumentou o sistema, 
criando o bot�o �Multiplique seus pontos�. 
O cliente ir� digitar quantos cupons tem, 
e o sistema ir� triplicar o valor.
 */

import java.util.Scanner;

public class ProgramaFidelidade {

	public static void main(String[] args) {
		int cup, mult;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite seus cupons: ");
		cup = leia.nextInt();
		mult = (cup * 3);
		System.out.println("Seus cupons agora valem " + mult + " pontos! ");
		leia.close();

	}

}
