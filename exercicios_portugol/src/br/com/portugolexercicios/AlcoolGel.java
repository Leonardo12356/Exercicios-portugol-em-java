package br.com.portugolexercicios;

import java.util.Scanner;

public class AlcoolGel {

	public static void main(String[] args) {
		final double alcool = 0.7;
		final double gel = 0.3;
		double capacidade;
		double vla, vlg;
		
		System.out.println("-->Laborat�rio do Alcool Gel<--");
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Capacidade da garrafa em mililitros:");
		capacidade = leia.nextDouble();
		leia.close();
		
		vla = (capacidade * alcool);
		vlg = (capacidade * gel);
		
		System.out.println("Resultado de laborat�rio:");
		System.out.println("Volume de �lcool: " + vla +" ml");
		System.out.println("Volume de gel: " + vlg + " ml");
		
		

	}

}
