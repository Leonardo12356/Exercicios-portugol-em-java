package br.com.portugolexercicios;

import java.util.Scanner;

public class AlcoolGel {

	public static void main(String[] args) {
		final double alcool = 0.7;
		final double gel = 0.3;
		double capacidade;
		double vla, vlg;
		
		System.out.println("-->Laboratório do Alcool Gel<--");
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Capacidade da garrafa em mililitros:");
		capacidade = leia.nextDouble();
		leia.close();
		
		vla = (capacidade * alcool);
		vlg = (capacidade * gel);
		
		System.out.println("Resultado de laboratório:");
		System.out.println("Volume de álcool: " + vla +" ml");
		System.out.println("Volume de gel: " + vlg + " ml");
		
		

	}

}
