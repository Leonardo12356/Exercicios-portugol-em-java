package br.com.portugolexercicios;

import java.util.Scanner;

/*O restaurante "Self-Service" precisa de um programa para 
 * imprimir as etiquetas de "comanda" na pesagem dos pratos. 
 * O operador da balança irá digitar o preço do quilo e o 
 * total em gramas da refeição, considerando que o prato 
 * vazio pesa 465 gramas (tara). A etiqueta irá conter o 
 * nome do restaurante, o tara do prato, o preço de 100 gramas, 
 * o peso consumido e o valor total.
 */

public class SelfService {

	public static void main(String[] args) {
		final double tara = 0.465;
		double precoGrama, precoCemGramas, precoQuilo, totalGramas, 
	    pesoCobrar, valorACobrar;
		
		Scanner leia = new Scanner (System.in);
		System.out.println(" --> Death service Restaurante <--");
		
		System.out.println("Digite o valor por quilo:");
		precoQuilo = leia.nextDouble();
		
		System.out.println("Digite o peso do prato (com comida) em gramas");
		totalGramas = leia.nextDouble();
		
		 	precoGrama = (precoQuilo /1000);
			precoCemGramas = (precoQuilo /10);
			pesoCobrar = (totalGramas - tara);
			valorACobrar = (pesoCobrar * precoGrama);
			
			System.out.println("\nDeath Service ");
			System.out.println("Tara do prato: " + tara);
			System.out.println("Preço por 100 gramas: " + precoCemGramas);
			System.out.println("Peso consumido: " + pesoCobrar);
			System.out.println("Valor total: " + valorACobrar);
			System.out.println("\n***Death service agradece sua visita, seu peso é a nossa alegria!!***");
			leia.close();
			

		}
	
}
